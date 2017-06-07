/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocios;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

/**
 * Guarda la informacion de las una seccion
 * así como los alumnos que se encuentran
 * en dicha sección.
 * @author Israel Reyes Ozuna
 * @author Cristhian Ubaldo Promotor
 */
public class Seccion {
    
    private String nrc;
    private String nombre;
    private int cupo;    
    private Date fechaInicio;
    private Date fechaFin;
    private List<UsuarioAutonomo> alumnosSeccion;

    public Seccion() {
        alumnosSeccion = new ArrayList();
    }

    
    public String getNrc() {
        return nrc;
    }

    public void setNrc(String nrc) {
        this.nrc = nrc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    public int getCupo() {
        return cupo;
    }

    public void setCupo(int cupo) {
        this.cupo = cupo;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }


    public List<UsuarioAutonomo> getAlumnosSeccion() {
        return alumnosSeccion;
    }

    public void setAlumnosSeccion(List<UsuarioAutonomo> alumnosSeccion) {
        this.alumnosSeccion = alumnosSeccion;
    }
    
    
    
}
