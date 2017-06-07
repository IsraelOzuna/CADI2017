package Datos;

import Recursos.MensajeBandera;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 * Permita la conexxion remota dentro de una misma red 
 * a una base de datos, especificamente MYSQL
 * @author Israel Reyes ozuna
 * @author Cristhian Ubaldo Promotor
 * @version 3/06/2017
 */
public class Conexion {
    
    private Connection conexionBD;
    private MensajeBandera mensaje;

    /**
     * Constructor de conexion
     */
    public Conexion() {
    }

    
    /**
     * Obtener el el atributo de tipo Connection de la clase.
     * @return Una conexión para utilizarce individualmente
     */
    public Connection getConexionBD() {
        return conexionBD;
    }

    /**
     * Sirve para obtener el mansaje máspreciso de que 
     * es lo que pasó al realizar la conexión.
     * @return un mensaje Bandera que nos especifica que ocurrió con más claridad
     */
    public MensajeBandera getMensaje() {
        return mensaje;
    }
    
    /**
     * Nos permite una conexión con una base de datos especifica,
     * dentro de un misma red
     * @return Un objeto de tipo Connection que tambien sirve como
     * conexión a la base de datos
     */
    public Connection obtenerConexion(){        
                
        try{
            
            Class.forName("com.mysql.jdbc.Driver").newInstance();

        }catch(ClassNotFoundException | InstantiationException | IllegalAccessException driverExcep){
            
           driverExcep.printStackTrace();
        }
        
        try{
            
            conexionBD = DriverManager.getConnection("jdbc:mysql://127.0.0.1/cadi?user=SAIUser&password=sai2017cadi");
            
            mensaje = MensajeBandera.CONEXION_EXITOSA;
            
        }catch(SQLException conexionExcep){
            
            conexionExcep.printStackTrace();
            mensaje = MensajeBandera.ERROR_CONEXION;
            
        }
            
        return conexionBD;
    }
    
    /**
     * Sirve para cerrar las conexiones realizadas, evitando que se desperdicien recursos,
     * debe ir despues de haber llamado al método obtenerConexion
     * @return Retorna un MensajeBandera que nos da información mas presisa
     */
    public MensajeBandera cerrarConexion (){
        
        MensajeBandera mensaje= null;
        
        try{
            
            conexionBD.close();
            mensaje = MensajeBandera.CONEXION_CERRADA;
            
        }  catch (SQLException errorCerrar) {
            
            errorCerrar.printStackTrace();
           mensaje = MensajeBandera.ERROR_CERRAR_CONEXION;
           
        }
        
        return mensaje;
    }
}
