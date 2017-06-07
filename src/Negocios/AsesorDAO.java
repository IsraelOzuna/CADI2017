
package Negocios;

import Datos.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Permite acceder ala base de datos para obtener un asesor
 * @author Israel Reyes Ozuna
 * @author Cristhian Ubaldo Promotor
 * @version 5/06/2017
 */
public class AsesorDAO implements IAsesorDAO{
    
    /**
     * Obtiene la iformación de un asesor según el usuario especificado
     * @param usuario Es el usuario con el cual inicio sesión
     * @return Retorna todos los datos del asesor 
     */
    @Override
    public Asesor obtenerAsesor(String usuario){
        
        Conexion conexion = new Conexion();
        PreparedStatement sentencia = null;
        ResultSet resultado = null;
        String consultaSQL = null;
        
        Asesor asesor = new Asesor();
        
        consultaSQL = "SELECT * FROM asesor WHERE usuario =?";
        
        try{
            
            sentencia = conexion.obtenerConexion().prepareStatement(consultaSQL);           
            sentencia.setString(1, usuario);
            resultado = sentencia.executeQuery();
            
            if(resultado.next()){
                
               asesor.setNumeroPersonal(resultado.getString(1));
               asesor.setUsuario(resultado.getString(2));
               asesor.setNombre(resultado.getString(4));
               asesor.setApellidos(resultado.getString(5));
               asesor.setCorreo(resultado.getString(6));
               asesor.setFechaNacimiento(resultado.getDate(7));
               asesor.setGenero(resultado.getString(8));
               asesor.setTelefono(resultado.getString(6));
               asesor.setCarreraEgresada(resultado.getString(6));
                   
            }else{
                asesor = null;
            }
        }catch(SQLException ex){
            ex.printStackTrace();
        }finally{
            conexion.cerrarConexion();
        }
        
        return asesor;
        
    }
}
