package Datos;

import Recursos.MensajeBandera;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ozuna
 */
public class ConexionTest {
    Conexion conexion;
    
    public ConexionTest() {
        conexion = new Conexion();
    }

    @Test
    public void testObtenerConexion() {
        MensajeBandera mensajeEsperado = MensajeBandera.CONEXION_EXITOSA;
        conexion.obtenerConexion();
        assertEquals(mensajeEsperado, conexion.getMensaje());
    }
    
    @Test
    public void testCerrarConexion() {
        MensajeBandera mensajeEsperado = MensajeBandera.CONEXION_CERRADA;
        conexion.obtenerConexion();
        assertEquals(mensajeEsperado, conexion.cerrarConexion());
    }
    
}
