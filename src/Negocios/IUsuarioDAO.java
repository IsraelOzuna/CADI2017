package Negocios;

import Recursos.MensajeBandera;
import java.sql.SQLException;

/**
 * Describe los métodos que realizará la clase UsuarioDAO
 * @author Israel Reyes Ozuna
 * @author Cristhian Ubaldo Promotor
 * @version 4/06/2017
 */
public interface IUsuarioDAO {
    public MensajeBandera iniciarSesion(String usuario, String contrasena);
    public String cifrarContrasena(String contrasena);
    public MensajeBandera obtenerRol(int posicionRol);
}
