
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
    public List<Seccion> obtenerSeccione(String numeroPersonalAsesor) {
        
        List<Seccion> misSecciones = new ArrayList();
        
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
                
                UsuarioAutonomo alumnoSeccion = new UsuarioAutonomo();
               
                
                   
            }
            
        }catch (SQLException ex){
            
        }
        
        
        return misSecciones;
        
    }
    
    public List<UsuarioAutonomo> obtenerAlumnosSeccion(String nrcCruso){
        
        List<UsuarioAutonomo> usuariosSeccion = new ArrayList();
        
        
        return usuariosSeccion;
    }
    
}
