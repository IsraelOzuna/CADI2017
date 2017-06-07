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
 * @author Cristhian Ubaldo Promotor
 */
public class SeccionDAOTest {
    
    SeccionDAO seccion;
    Asesor asesor;
    
    public SeccionDAOTest() {
        seccion = new SeccionDAO();
        asesor = new Asesor();
        asesor.setNumeroPersonal("00007");
    }

    @Test
    public void testObtenerSeccione() {
        
        ArrayList<Seccion> misSecciones= new ArrayList();
        misSecciones = seccion.obtenerSeccione("00007");
        
        String nrcObtenido = misSecciones.get(1).getNrc();
        String nrcEsperado = "00025";
        assertEquals(nrcObtenido, nrcEsperado);
        
    }
    
     @Test
    public void testAsesorSinSecciones() {
        
        ArrayList<Seccion> misSecciones= new ArrayList();
        misSecciones = seccion.obtenerSeccione("00002");
        
       int tamñoArrayObtenido = misSecciones.size();
        int tamañoArrayEsperado = 0;
        assertEquals(tamñoArrayObtenido, tamañoArrayEsperado);
        
    }

    @Test
    public void testObtenerAlumnosSeccion() {
        
        List<UsuarioAutonomo> alumnos = new ArrayList();
        alumnos = seccion.obtenerAlumnosSeccion("00025");
        
        String matriculaAlumnoObtenida = alumnos.get(0).getMatricula();
        String matriculaAlumnoEsperada = "s15011676";
        assertEquals(matriculaAlumnoEsperada, matriculaAlumnoObtenida);
        
    }
    
    @Test
    public void testObtenerAlumnosSeccionSinAlumnos() {
        
        List<UsuarioAutonomo> alumnos = new ArrayList();
        alumnos = seccion.obtenerAlumnosSeccion("00022");
       
        int tamñoArrayObtenido = alumnos.size();
        int tamañoArrayEsperado = 0;
        assertEquals(tamñoArrayObtenido, tamañoArrayEsperado);
        
    }

    @Test
    public void testBuscarMisAlumnos() {
        
        List<UsuarioAutonomo> alumnos = new ArrayList();
        alumnos = seccion.buscarMisAlumnos(asesor, "di");
        
        String nombreAlumnoObtenido = alumnos.get(0).getNombre();
        String nombreAlumnoEsperado = "Diego";
        assertEquals(nombreAlumnoObtenido, nombreAlumnoEsperado);
        
    }
    
    @Test
    public void testObtenerMisAlumnosSinCoicidencias() {
        
        List<UsuarioAutonomo> alumnos = new ArrayList();
        alumnos = seccion.buscarMisAlumnos(asesor, "dd");
        
        int tamañoArrayObtenido = alumnos.size();
        int tamañoArrayEsperado = 0;
        assertEquals(tamañoArrayObtenido, tamañoArrayEsperado);
        
    }
    
}
