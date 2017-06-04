package Negocios;

import Datos.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Ozuna
 */
public class UsuarioAutonomoDAO implements IUsuarioAutonomoDAO {

    @Override
    public String obtenerUsuario(String usuario) {
        
        Conexion conexion = new Conexion();
        PreparedStatement sentencia = null;
        ResultSet resultado = null;
        String consultaSQL = null;
        String nombreUsuarioAutonomo = null;
        
        consultaSQL = "SELECT nombreUsuarioAutonomo, apellidosUsuarioAutonomo FROM usuarioAutonomo WHERE usuario =?";
        
        try{
            
            sentencia = conexion.obtenerConexion().prepareStatement(consultaSQL);
            
            sentencia.setString(1, usuario);
            
            resultado = sentencia.executeQuery();
            
            if(resultado.next())
                nombreUsuarioAutonomo = resultado.getString(1)+ " "+ resultado.getString(2);
            
        }catch(SQLException ex){
            
        }finally{
            conexion.cerrarConexion();
        }
        
        return nombreUsuarioAutonomo;
        
    }
    
}
