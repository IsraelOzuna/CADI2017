
package Negocios;

import Datos.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Cristhian Ubaldo Promotor
 */
public class SeccionDAO implements ISeccionDAO{
    /**
     * Este método obtiene las secciones que imparte un asesor
     * @param numeroPersonalAsesor Es el numero de personal que identifica al asesor
     * @return Regresa una lista de Secciones en las cuales tambien van los alumnos 
     * de dichas secciones
     */
   @Override
    public ArrayList<Seccion> obtenerSeccionesDeAsesor(String numeroPersonalAsesor) {
        
        ArrayList<Seccion> misSecciones = new ArrayList();
        
        Conexion conexion = new Conexion();
        PreparedStatement sentencia = null;
        ResultSet resultado = null;
        String consultaSQL = null;
        
        consultaSQL = "SELECT nrc, nombreSeccion, fechaInicio, fechaFin, cupo FROM seccion WHERE asesorAsignado = ? ";
        
        try{
            
            sentencia = conexion.obtenerConexion().prepareStatement(consultaSQL);           
            sentencia.setString(1, numeroPersonalAsesor);
            resultado = sentencia.executeQuery();
            
            while(resultado.next()){
                
                Seccion seccionACargo = new Seccion();
                seccionACargo.setNrc(resultado.getString(1));
                seccionACargo.setNombre(resultado.getString(2));
                seccionACargo.setFechaInicio(resultado.getDate(3));
                seccionACargo.setFechaFin(resultado.getDate(4));
                seccionACargo.setCupo(resultado.getInt(5));
                
                seccionACargo.setAlumnosSeccion(obtenerAlumnosSeccion(resultado.getString(1)));
                
                misSecciones.add(seccionACargo);
            }
            
        }catch (SQLException ex){
            ex.printStackTrace();
        }finally{
            conexion.cerrarConexion();
        }
        
        
        return misSecciones;
        
    }
    
    /**
     * Busca los alumnos que están en cierta seccion
     * @param nrcCruso Es el identificador de la secciónen la que
     * buscará a los alumnos
     * @return Retorna una lista de alumnos de la sección
     */
    @Override
    public List<UsuarioAutonomo> obtenerAlumnosSeccion(String nrcCruso){
        
        List<UsuarioAutonomo> usuariosSeccion = new ArrayList();
        Conexion conexion = new Conexion();
        PreparedStatement sentencia = null;
        ResultSet resultado = null;
        String consultaSQL = null;
        UsuarioAutonomo alumno = null;
        
        consultaSQL = "SELECT *FROM usuarioAutonomo, inscripcion WHERE usuarioAutonomo.matricula = inscripcion.matricula AND nrc = ? ";
        try{
            
            sentencia = conexion.obtenerConexion().prepareStatement(consultaSQL);           
            sentencia.setString(1, nrcCruso);
            resultado = sentencia.executeQuery();
            
            while(resultado.next()){
                alumno = new UsuarioAutonomo();
                
                alumno.setMatricula( resultado.getString(1));
                alumno.setUsuario(resultado.getString(2));
                alumno.setNombre(resultado.getString(4));
                alumno.setApellidos(resultado.getString(5));
                alumno.setCorreo(resultado.getString(6));
                alumno.setFechaNacimiento(resultado.getDate(7));
                alumno.setGenero(resultado.getString(8));
                alumno.setArea(resultado.getString(9));
                alumno.setCarrera(resultado.getString(10));
                alumno.setTelefono(resultado.getString(11));
                alumno.setDiscapacidad(resultado.getString(12));
                alumno.setLenguaIndigena(resultado.getString(13));
                
                usuariosSeccion.add(alumno);
            }
            
        } catch (SQLException ex) {
           Logger.getLogger(SeccionDAO.class.getName()).log(Level.SEVERE, null, ex);
       }finally{
         conexion.cerrarConexion();
        }
        return usuariosSeccion;
    }
    
    /**
     * Método que permite buscar los alumnos que le pertenecen un asesor
     * @param asesor Es el asesor el cual quiere buscar entre los alumnos 
     * a los que les da clase
     * @param palabraClave Es la palabra con la que buscará coincidencias
     * @return Es un lista de alumnos los cuales tienen en su interior la palabra que busca
     */
    @Override
    public ArrayList<UsuarioAutonomo> buscarAlumnosAsesor(Asesor asesor, String palabraClave){
        
        ArrayList<UsuarioAutonomo> misAlumnos = null;
        
        Conexion conexion = new Conexion();
        PreparedStatement sentencia = null;
        ResultSet resultado = null;
        String consultaSQL = null;
        UsuarioAutonomo alumnoEncontrado = null;
        
        consultaSQL = "SELECT usuarioAutonomo.matricula, usuario,  nombreUsuarioAutonomo, apellidosUsuarioAutonomo,"
                + " correoUsuarioAutonomo, fechaNacimiento, genero, area, carrera, telefono,"
                + " discapacidad, hablaLenguaIndigena FROM usuarioAutonomo, inscripcion, seccion WHERE "
                + " usuarioAutonomo.matricula = inscripcion.matricula AND inscripcion.nrc = seccion.nrc "
                + "AND asesorAsignado = ? AND (usuarioAutonomo.matricula LIKE ? OR nombreUsuarioAutonomo LIKE ? )";
        
        try{
            
            sentencia = conexion.obtenerConexion().prepareStatement(consultaSQL);           
            sentencia.setString(1, asesor.getNumeroPersonal());
            sentencia.setString(2, "%" + palabraClave+"%");
            sentencia.setString(3, "%" + palabraClave+"%");
            resultado = sentencia.executeQuery();
            misAlumnos = new ArrayList();
            while(resultado.next()){
                alumnoEncontrado = new UsuarioAutonomo();
                
                alumnoEncontrado.setMatricula( resultado.getString(1));
                alumnoEncontrado.setUsuario(resultado.getString(2));
                alumnoEncontrado.setNombre(resultado.getString(3));
                alumnoEncontrado.setApellidos(resultado.getString(4));
                alumnoEncontrado.setCorreo(resultado.getString(5));
                alumnoEncontrado.setFechaNacimiento(resultado.getDate(6));
                alumnoEncontrado.setGenero(resultado.getString(7));
                alumnoEncontrado.setArea(resultado.getString(8));
                alumnoEncontrado.setCarrera(resultado.getString(9));
                alumnoEncontrado.setTelefono(resultado.getString(10));
                alumnoEncontrado.setDiscapacidad(resultado.getString(11));
                alumnoEncontrado.setLenguaIndigena(resultado.getString(12));
                
                misAlumnos.add(alumnoEncontrado);
            }
            
        } catch (SQLException ex) {
           Logger.getLogger(SeccionDAO.class.getName()).log(Level.SEVERE, null, ex);
       }finally{
            conexion.cerrarConexion();
        }
        
        return misAlumnos;
        
    }
    
}
