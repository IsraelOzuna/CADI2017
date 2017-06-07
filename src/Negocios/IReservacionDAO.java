
package Negocios;

import Recursos.MensajeBandera;
import java.util.List;



/**
 *Define los métodos que utilizrá la clase ReservacioDAO
 * @author Israel Reyes Ozuna
 * @author Cristhian Ubaldo Promotr
 * @version 6/06/2017
 */
public interface IReservacionDAO {
    public List<Reservacion> obtenerActividadesParaReservacion(UsuarioAutonomo alumno);
    public MensajeBandera reservarActividad(UsuarioAutonomo alumno, Reservacion actividadAReservar);
    public List<String> obtenerIdiomasUsurioAutonomo(UsuarioAutonomo alumno);
}
