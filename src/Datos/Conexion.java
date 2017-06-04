package Datos;

import Recursos.MensajeBandera;
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
    private MensajeBandera mensaje;

    public Connection getConexionBD() {
        return conexionBD;
    }

    public MensajeBandera getMensaje() {
        return mensaje;
    }
    
    public Connection obtenerConexion(){        
        
        
        try{
            
            Class.forName("com.mysql.jdbc.Driver").newInstance();

        }catch(ClassNotFoundException | InstantiationException | IllegalAccessException driverExcep){
            
           //Enviara  bitacora            
        }
        
        try{
            
            conexionBD = DriverManager.getConnection("jdbc:mysql://127.0.0.1/cadi?user=SAIUser&password=sai2017cadi");
            
            mensaje = MensajeBandera.CONEXION_EXITOSA;
            
        }catch(SQLException conexionExcep){
            
            mensaje = MensajeBandera.ERROR_CONEXION;
            
        }
            
        return conexionBD;
    }
    
    public MensajeBandera cerrarConexion (){
        MensajeBandera mensaje= null;
        
        try{
            
            conexionBD.close();
            
            mensaje = MensajeBandera.CONEXION_CERRADA;
            
        }  catch (SQLException errorCerrar) {
            
           //Enviar a bitacora
           mensaje = MensajeBandera.ERROR_CERRAR_CONEXION;
           
        }
        
        return mensaje;
    }
}
