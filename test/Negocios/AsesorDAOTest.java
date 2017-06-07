
package Negocios;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *Prubas de AsesorDAO 
 * @author Israel Reyes Ozuna
 * @author Cristhian Ubaldo Promotor
 * @version 6/06/2017
 */
public class AsesorDAOTest {
     
    public AsesorDAOTest() {
       
    }
//Prueba que se obtenga el usuario correcto dado un usuario
    @Test
    public void testObtenerAsesor() {
        
        AsesorDAO datosAsesor = new AsesorDAO();
        Asesor asesorEsperado = new Asesor();
        Asesor asesorObtenido = new Asesor();
        asesorEsperado.setNumeroPersonal("00007");
        asesorObtenido = datosAsesor.obtenerAsesor("edbenites");
        
        assertEquals(asesorEsperado.getNumeroPersonal(),asesorObtenido.getNumeroPersonal());
        
    }
    @Test
    public void testObtenerAsesorNoExiste() {
        
        AsesorDAO datosAsesor = new AsesorDAO();
        Asesor asesorEsperado = null;
        Asesor asesorObtenido = new Asesor();
        asesorObtenido = datosAsesor.obtenerAsesor("edbenjnites");
        
        assertEquals(asesorEsperado,asesorObtenido);
        
    }
    
}
