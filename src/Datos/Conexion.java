package Datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Ozuna
 */
public class Conexion {
    private Connection conexionBD;
    private Statement declaracionSQL;
        
    public Conexion(){
        conexionBD = null;
        declaracionSQL = null;
    }
    
    public Connection obtenerConexion() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{        
        Class.forName("com.mysql.jdbc.Driver").newInstance();
        
        conexionBD = DriverManager.getConnection("jdbc:mysql://127.0.0.1/cadi?user=SAIUser&password=sai2017cadi");
               
        return conexionBD;
    }
    
    public void cerrarConexion (){    
        try{
            conexionBD.close();
        }  catch (SQLException errorCerrar) {
           //Enviar a bitacora
           
        }
    }
}
