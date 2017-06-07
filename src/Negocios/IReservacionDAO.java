/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocios;

import Recursos.MensajeBandera;
import java.util.List;



/**
 *
 * @author Ozuna
 */
public interface IReservacionDAO {
    public List<Reservacion> obtenerActividadesParaReservacion(UsuarioAutonomo alumno);
    public MensajeBandera reservarActividad(UsuarioAutonomo alumno, Reservacion actividadAReservar);
}
