/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocios;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Cristhian Ubaldo Promotor
 */
public interface ISeccionDAO {
    
    public List <Seccion> obtenerSeccione(String numeroPersonalAsesor);
     public List<UsuarioAutonomo> obtenerAlumnosSeccion(String nrcCruso);
     public ArrayList<UsuarioAutonomo> buscarMisAlumnos(Asesor asesor, String palabraClave);
     
}
