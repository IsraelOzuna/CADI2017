/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocios;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Cristhian Ubaldo Promotor
 */
public class AsesorDAOTest {
     
    public AsesorDAOTest() {
       
    }

    @Test
    public void testObtenerAsesor() {
        
        AsesorDAO datosAsesor = new AsesorDAO();
        Asesor asesorEsperado = new Asesor();
        Asesor asesorObtenido = new Asesor();
        asesorEsperado.setNumeroPersonal("00007");
        asesorObtenido = datosAsesor.obtenerAsesor("edbenites");
        
        assertEquals(asesorEsperado.getNumeroPersonal(),asesorObtenido.getNumeroPersonal());
        
    }
    
}
