package Negocios;

import Datos.Conexion;
import Recursos.MensajeBandera;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Ozuna
 */
public class UsuarioDAO implements IUsuarioDAO{

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
                            
                            resultados = null;
                            
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
