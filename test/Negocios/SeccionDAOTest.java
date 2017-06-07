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
 *Pruebas de SeccionDAO
 * @author Israel Reyes Ozuna
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
//obtener Secciones correctas de un usuario específico
    @Test
    public void testObtenerSeccione() {
        
        ArrayList<Seccion> misSecciones= new ArrayList();
        misSecciones = seccion.obtenerSeccione("00007");
        
        String nrcObtenido = misSecciones.get(1).getNrc();
        String nrcEsperado = "00025";
        assertEquals(nrcObtenido, nrcEsperado);
        
    }
    //Si el asesor no tiene secciones sus secciones deben ser 0
     @Test
    public void testAsesorSinSecciones() {
        
        ArrayList<Seccion> misSecciones= new ArrayList();
        misSecciones = seccion.obtenerSeccione("00002");
        
       int tamñoArrayObtenido = misSecciones.size();
        int tamañoArrayEsperado = 0;
        assertEquals(tamñoArrayObtenido, tamañoArrayEsperado);
        
    }
//obtiene un alumno especifico según la sección especificada
    @Test
    public void testObtenerAlumnosSeccion() {
        
        List<UsuarioAutonomo> alumnos = new ArrayList();
        alumnos = seccion.obtenerAlumnosSeccion("00025");
        
        String matriculaAlumnoObtenida = alumnos.get(0).getMatricula();
        String matriculaAlumnoEsperada = "s15011676";
        assertEquals(matriculaAlumnoEsperada, matriculaAlumnoObtenida);
        
    }
    
 //Si la seccion no tiene alumnos los alumnos de esa sección deben ser 0
    @Test
    public void testObtenerAlumnosSeccionSinAlumnos() {
        
        List<UsuarioAutonomo> alumnos = new ArrayList();
        alumnos = seccion.obtenerAlumnosSeccion("00022");
       
        int tamñoArrayObtenido = alumnos.size();
        int tamañoArrayEsperado = 0;
        assertEquals(tamñoArrayObtenido, tamañoArrayEsperado);
        
    }
//Encuentra un alumno según un asesor y una palabra tiene un resultado
    @Test
    public void testBuscarMisAlumnos() {
        
        List<UsuarioAutonomo> alumnos = new ArrayList();
        alumnos = seccion.buscarMisAlumnos(asesor, "di");
        
        String nombreAlumnoObtenido = alumnos.get(0).getNombre();
        String nombreAlumnoEsperado = "Diego";
        assertEquals(nombreAlumnoObtenido, nombreAlumnoEsperado);
        
    }
 //Si no hay alumnos segun la palabra buscada por el asesor tendra 0 resultados
    @Test
    public void testbuscarMisAlumnosSinCoicidencias() {
        
        List<UsuarioAutonomo> alumnos = new ArrayList();
        alumnos = seccion.buscarMisAlumnos(asesor, "dd");
        
        int tamañoArrayObtenido = alumnos.size();
        int tamañoArrayEsperado = 0;
        assertEquals(tamañoArrayObtenido, tamañoArrayEsperado);
        
    }
    
}
