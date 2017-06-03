package Negocios;

import java.sql.SQLException;

/**
 *
 * @author Ozuna
 */
public interface IUsuarioDAO {
    //public boolean iniciarSesion(String usuario, char [] contrasena) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException;
    public void cerrarSesion();
}
