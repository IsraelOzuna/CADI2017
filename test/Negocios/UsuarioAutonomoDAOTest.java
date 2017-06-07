/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocios;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *Comprueba que el usuario autónomo que se obtine sea el esperado
 * según su usuario.
 * @author Israel Reyes Ozuna
 * @author Cristhian Ubaldo Promotor
 * @version 6/06/2017
 */
public class UsuarioAutonomoDAOTest {
    
    public UsuarioAutonomoDAOTest() {
        
    }

    @Test
    public void testObtenerUsuarioAutonomo() {                        
        UsuarioAutonomoDAO datosUsuarioAutonomo = new UsuarioAutonomoDAO();
        UsuarioAutonomo usuarioAutonomoEsperado = new UsuarioAutonomo();
        UsuarioAutonomo usuarioAutonomoObtenido = new UsuarioAutonomo();
        usuarioAutonomoEsperado.setMatricula("s15011651");
        usuarioAutonomoObtenido = datosUsuarioAutonomo.obtenerUsuarioAutonomo("isrozuna");
        
        assertEquals(usuarioAutonomoEsperado.getMatricula(),usuarioAutonomoObtenido.getMatricula());
    }
    
}
