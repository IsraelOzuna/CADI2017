/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
        assertEquals(mensajeEsperado, conexion.obtenerConexion());
    }

    @Test
    public void testCerrarConexion() {
        
    }
    
}
