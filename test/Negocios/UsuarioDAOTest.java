package Negocios;

import org.junit.Test;
import static org.junit.Assert.*;
import Recursos.MensajeBandera;

/**
 *Pruebas de la aisgnacion de roles y validación 
 * @author Israel Reyes Ozuna
 * @author Cristhian Ubaldo Promotor
 * @version 6/06/2017
 */
public class UsuarioDAOTest {
    UsuarioDAO usuarioDAO;
    
    public UsuarioDAOTest() {
        usuarioDAO = new UsuarioDAO();
    }

    @Test
    public void testIniciarSesionCoordinador() {
        MensajeBandera tipoUsuario = MensajeBandera.USUARIO_COORDINADOR;
        String usuarioEsperado = "jorgocha";
        String contrasenaEsperada = "coordochajor7492";
        assertEquals(tipoUsuario, usuarioDAO.iniciarSesion(usuarioEsperado, contrasenaEsperada));
    }

    @Test
    public void testIniciarSesionRecepcionista() {
        MensajeBandera tipoUsuario = MensajeBandera.USUARIO_RECEPCIONISTA;
        String usuarioEsperado = "gregohouse";
        String contrasenaEsperada = "housegreg";
        assertEquals(tipoUsuario, usuarioDAO.iniciarSesion(usuarioEsperado, contrasenaEsperada));
    }
    
    @Test
    public void testIniciarSesionAsesor() {
        MensajeBandera tipoUsuario = MensajeBandera.USUARIO_ASESOR;
        String usuarioEsperado = "elrevo";
        String contrasenaEsperada = "revojc34245";
        assertEquals(tipoUsuario, usuarioDAO.iniciarSesion(usuarioEsperado, contrasenaEsperada));
    }
    
    @Test
    public void testIniciarSesionUsuarioAutomomo() {
        MensajeBandera tipoUsuario = MensajeBandera.USUARIO_USUARIO_AUTONOMO;
        String usuarioEsperado = "isrozuna";
        String contrasenaEsperada = "israel124";
        assertEquals(tipoUsuario, usuarioDAO.iniciarSesion(usuarioEsperado, contrasenaEsperada));
    }
    
    @Test
    public void testIniciarSesionFallido() {
        MensajeBandera tipoUsuario = MensajeBandera.USUARIO_INVALIDO;
        String usuarioEsperado = "crizu";
        String contrasenaEsperada = "mysql123";
        assertEquals(tipoUsuario, usuarioDAO.iniciarSesion(usuarioEsperado, contrasenaEsperada));
    }
        
    @Test
    public void testCifrarContrasena() {
        String contrasenaEsperada = "1c632ab44c6718c2ed0e86e420e531a8c434a74c21e216d0bffa39e26c07d6cc";
        assertEquals(contrasenaEsperada, usuarioDAO.cifrarContrasena("coordochajor7492"));
    }

    @Test
    public void testObtenerRolCoordinador() {
        MensajeBandera mensajeEsperado = MensajeBandera.USUARIO_COORDINADOR;
        assertEquals(mensajeEsperado, usuarioDAO.obtenerRol(0));
    }
    
       @Test
    public void testObtenerRolRecepcionista() {
        MensajeBandera mensajeEsperado = MensajeBandera.USUARIO_RECEPCIONISTA;
        assertEquals(mensajeEsperado, usuarioDAO.obtenerRol(1));
    }
    
           @Test
    public void testObtenerRolAsesor() {
        MensajeBandera mensajeEsperado = MensajeBandera.USUARIO_ASESOR;
        assertEquals(mensajeEsperado, usuarioDAO.obtenerRol(2));
    }
    
           @Test
    public void testObtenerRolUsuarioAutonomo() {
        MensajeBandera mensajeEsperado = MensajeBandera.USUARIO_USUARIO_AUTONOMO;
        assertEquals(mensajeEsperado, usuarioDAO.obtenerRol(3));
    }
    
}
