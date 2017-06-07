package Negocios;

import Datos.Conexion;
import Recursos.MensajeBandera;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *Esta clase se encarga de consultar con la base de datos
 * obteniendo datos de ésta.
 * @author Israel Reyes Ozuna
 * @author Cristhian Ubaldo Promotor
 * @version 4/06/2017
 */
public class UsuarioDAO implements IUsuarioDAO{
    /**
     * Compruba que exista el usuario especificado
     * @param usuario Es el usuario con el cual se inició sesión
     * @param contrasena Es la contraseña con la cual se inició sesión
     * @return nos regresa un mensaje de si existe, y en ese caso de que tipo es, o si no esxite
     * tambien nos podría informar de errores con la base de datos.
     */
    @Override
    public MensajeBandera iniciarSesion(String usuario, String contrasena){
        
        Conexion datos = new Conexion();
        MensajeBandera mensaje = null;
        Connection conexion;
        
        conexion = datos.obtenerConexion();
            
        switch(datos.getMensaje()){
            
            case CONEXION_EXITOSA:

                String consultaSQL = null;
                ResultSet resultados = null;
                PreparedStatement sentencia =  null;
                String contrasenaCifrada = cifrarContrasena(contrasena);
        
                try {

                    for (int posicionRol = 0; posicionRol < 4; posicionRol++) {
                        
                        String roles[] = {"COORDINADOR","RECEPCIONISTA","ASESOR","USUARIOAUTONOMO"};                        
                        boolean encontrado = false;                        
                        consultaSQL = "SELECT contrasena FROM " + roles[posicionRol]+  " WHERE usuario = ? ";

                        if (encontrado == false) {
                                                        
                            sentencia = conexion.prepareStatement(consultaSQL);                            
                            sentencia.setString(1, usuario);                                           
                            resultados = sentencia.executeQuery();
                                                        
                            if(resultados.next()) {
                                
                                if (resultados.getString(1).equals(contrasenaCifrada)) {

                                    mensaje = obtenerRol(posicionRol);
                                    encontrado = true;
                                    break;
                                }
                            }
                        } else {
                            
                            break;
                        }

                    }
                    
                    if(mensaje == null)
                        
                        mensaje = MensajeBandera.USUARIO_INVALIDO;
                    
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }finally{
                    
                    datos.cerrarConexion();
                }

                break;
                
            case ERROR_CONEXION:
                
                mensaje = MensajeBandera.ERROR_CONEXION;
                break;
        } 
        return mensaje;
    }
    /**
     * Crea una contraseña cifrada la cual despues será comparada con la de la base
     * de datos.
     * @param contrasena Es la contraseña que se cifrará
     * @return Retorna la cotraseña cifrada
     */
    @Override
    public String cifrarContrasena(String contrasena){
        
        ResultSet resultados;
        PreparedStatement sentencia;
        Connection conexion;
        Conexion conexionAux = new Conexion();
        
        String contrasenaCifrada = null;

        conexion = conexionAux.obtenerConexion();
        
        try {

            sentencia = conexion.prepareStatement("select sha2(?,256)");            
            sentencia.setString(1, contrasena);
            resultados = sentencia.executeQuery();

            if (resultados.next()) {

                contrasenaCifrada = resultados.getString(1);

            }

        } catch (SQLException ex) {
            
            ex.printStackTrace();
            
        }finally{
            conexionAux.cerrarConexion();
        }
        
        return contrasenaCifrada;
    }
    
    /**
     * Determina un rol dependiendo de un índice utilizado
     * @param posicionRol Es la posicion de la que determinará que rol se le asignará
     * @return Un MensajeBandeja el cual nos especifica que rol se le asignó
     */
    @Override
    public MensajeBandera obtenerRol(int posicionRol){
        MensajeBandera mensaje = null;
        
        switch(posicionRol){
            
            case 0:
                
                mensaje = MensajeBandera.USUARIO_COORDINADOR;
                break;
            case 1:
                
                mensaje = MensajeBandera.USUARIO_RECEPCIONISTA;
                break;
            case 2:
                
                mensaje = MensajeBandera.USUARIO_ASESOR;
                break;
            case 3:
                
                mensaje = MensajeBandera.USUARIO_USUARIO_AUTONOMO;
                break;
                
        }
        
        return mensaje;
    }
}
