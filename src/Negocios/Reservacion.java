package Negocios;

import java.sql.Date;
import java.sql.Time;

/**
 *
 * @author Ozuna
 */
public class Reservacion {
    private String idReservacion;
    private boolean asistencia;
    private float calificacion;
    private String estado;
    private String observaciones;
    private String recomendaciones;
    private Date fecha;
    private Time horaInicio;
    private Time horaFin;
    private Actividad actividad;
    private UsuarioAutonomo alumno;
    private int cupo;
    private Asesor asesorAsignado;
    private String sala;
    
    public Reservacion() {
        actividad = new Actividad();
        asesorAsignado = new Asesor();
    }

    public String getIdReservacion() {
        return idReservacion;
    }

    public void setIdReservacion(String idReservacion) {
        this.idReservacion = idReservacion;
    }

    

    public boolean isAsistencia() {
        return asistencia;
    }

    public void setAsistencia(boolean asistencia) {
        this.asistencia = asistencia;
    }

    public float getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(float calificacion) {
        this.calificacion = calificacion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getRecomendaciones() {
        return recomendaciones;
    }

    public void setRecomendaciones(String recomendaciones) {
        this.recomendaciones = recomendaciones;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Time getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(Time horaInicio) {
        this.horaInicio = horaInicio;
    }

    public Time getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(Time horaFin) {
        this.horaFin = horaFin;
    }

    public Actividad getActividad() {
        return actividad;
    }

    public void setActividad(Actividad actividad) {
        this.actividad = actividad;
    }

    public UsuarioAutonomo getAlumno() {
        return alumno;
    }

    public void setAlumno(UsuarioAutonomo alumno) {
        this.alumno = alumno;
    }

    public int getCupo() {
        return cupo;
    }

    public void setCupo(int cupo) {
        this.cupo = cupo;
    }

    public Asesor getAsesorAsignado() {
        return asesorAsignado;
    }

    public void setAsesorAsignado(Asesor asesorAsignado) {
        this.asesorAsignado = asesorAsignado;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }
    
    
    
}
