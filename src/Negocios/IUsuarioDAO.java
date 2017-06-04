package Negocios;

import Recursos.MensajeBandera;
import java.sql.SQLException;

/**
 *
 * @author Ozuna
 */
public interface IUsuarioDAO {
    public MensajeBandera iniciarSesion(String usuario, String contrasena) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException;
}
