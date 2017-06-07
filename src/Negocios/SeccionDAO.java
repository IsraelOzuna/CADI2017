
package Negocios;

import Datos.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Cristhian Ubaldo Promotor
 */
public class SeccionDAO implements ISeccionDAO{

   @Override
    public ArrayList<Seccion> obtenerSeccione(String numeroPersonalAsesor) {
        
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
    
    public List<UsuarioAutonomo> obtenerAlumnosSeccion(String nrcCruso){
        
        List<UsuarioAutonomo> usuariosSeccion = new ArrayList();
        Conexion conexion = new Conexion();
        PreparedStatement sentencia = null;
        ResultSet resultado = null;
        String consultaSQL = null;
        
        consultaSQL = "SELECT *FROM usuarioAutonomo, inscripcion WHERE usuarioAutonomo.matricula = inscripcion.matricula AND nrc = ? ";
        try{
            
            sentencia = conexion.obtenerConexion().prepareStatement(consultaSQL);           
            sentencia.setString(1, nrcCruso);
            resultado = sentencia.executeQuery();
            
            while(resultado.next()){
                UsuarioAutonomo alumno = new UsuarioAutonomo();
                
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
            
        }catch(SQLException ex){
            ex.printStackTrace();
        }finally{
         conexion.cerrarConexion();
        }
        return usuariosSeccion;
    }
    
    public ArrayList<UsuarioAutonomo> obtenerMisAlumnos(Asesor asesor, String palabraClave){
        
        ArrayList<UsuarioAutonomo> misAlumnos = new ArrayList();
        
        Conexion conexion = new Conexion();
        PreparedStatement sentencia = null;
        ResultSet resultado = null;
        String consultaSQL = null;
        
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
            
            while(resultado.next()){
                UsuarioAutonomo alumnoEncontrado = new UsuarioAutonomo();
                
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
            
        }catch (SQLException ex){
            ex.printStackTrace();
        }finally{
            conexion.cerrarConexion();
        }
        
        return misAlumnos;
        
    }
    
}
