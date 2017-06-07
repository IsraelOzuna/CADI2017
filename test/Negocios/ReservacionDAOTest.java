/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocios;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ozuna
 */
public class ReservacionDAOTest {
    UsuarioAutonomo usuarioAutonomo;
    ReservacionDAO reservacion;

    public ReservacionDAOTest() {
        usuarioAutonomo = new UsuarioAutonomo();
        reservacion = new ReservacionDAO();
        usuarioAutonomo.setMatricula("s15011651");
    }

    @Test
    public void testObtenerActividadesParaReservacion() {
        List<Reservacion> reservaciones = new ArrayList();
        reservaciones = reservacion.obtenerActividadesParaReservacion(usuarioAutonomo);

        String actividadObtenida = reservaciones.get(0).getActividad().getIdActividad();
        String actividadEsperada = "00001";
        assertEquals(actividadObtenida, actividadEsperada);
    }

    @Test
    public void testObtenerIdiomasUsurioAutonomo() {
    }

    @Test
    public void testReservarActividad() {
    }

}
