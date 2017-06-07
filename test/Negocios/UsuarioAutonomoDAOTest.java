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
 * @author Ozuna
 */
public class UsuarioAutonomoDAOTest {
    
    public UsuarioAutonomoDAOTest() {
        
    }

    @Test
    public void testObtenerUsuario() {                        
        UsuarioAutonomoDAO datosUsuarioAutonomo = new UsuarioAutonomoDAO();
        UsuarioAutonomo usuarioAutonomoEsperado = new UsuarioAutonomo();
        UsuarioAutonomo usuarioAutonomoObtenido = new UsuarioAutonomo();
        usuarioAutonomoEsperado.setMatricula("s15011651");
        usuarioAutonomoObtenido = datosUsuarioAutonomo.obtenerUsuario("isrozuna");
        
        assertEquals(usuarioAutonomoEsperado.getMatricula(),usuarioAutonomoObtenido.getMatricula());
    }
    
}
