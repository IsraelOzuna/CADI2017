package Negocios;

import Datos.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Ozuna
 */
public class UsuarioAutonomoDAO implements IUsuarioAutonomoDAO {

    @Override
    public UsuarioAutonomo obtenerUsuario(String usuario) {
        
        Conexion conexion = new Conexion();
        UsuarioAutonomo usuarioAutonomo = new UsuarioAutonomo();
        PreparedStatement sentencia;
        ResultSet resultado;
        String consultaSQL;
        
                
        
        return usuarioAutonomo;
        
    }
    
}
