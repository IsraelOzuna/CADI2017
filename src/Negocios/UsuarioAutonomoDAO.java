package Negocios;

import Datos.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *Realiza conexiones con la base de datos
 * @author Israel Reyes Ozuna
 * @author Cristhian Ubaldo Promotor
 * @version 4/06/2017
 */
public class UsuarioAutonomoDAO implements IUsuarioAutonomoDAO {
    
    /**
     * A través de un usuario busca un usurio autonomo 
     * @param usuario Es el usuario a buscar en la base de datos
     * @return Regresa la infromacíon del usuario autónomo en un objeto del mismo tipo
     */
    @Override
    public UsuarioAutonomo obtenerUsuarioAutonomo(String usuario) {
        
        Conexion conexion = new Conexion();
        PreparedStatement sentencia = null;
        ResultSet resultado = null;
        String consultaSQL = null;
        
        UsuarioAutonomo  alumno = null;
        
        consultaSQL = "SELECT * FROM usuarioAutonomo WHERE usuario =?";
        
        try{
            
            sentencia = conexion.obtenerConexion().prepareStatement(consultaSQL);           
            sentencia.setString(1, usuario);
            resultado = sentencia.executeQuery();
            
            if(resultado.next()){
                
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
                   
            }
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioAutonomoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            conexion.cerrarConexion();
            
        }
        
        return alumno;
        
    }
    
}
