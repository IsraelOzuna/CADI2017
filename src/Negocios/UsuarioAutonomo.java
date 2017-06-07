package Negocios;

/**
 *Almacena los datos de un Usuario Autónomo
 * @author Israel Reyes Ozuna
 * @author Cristhian Ubaldo Promotor
 * @version 4/06/2017
 */
public class UsuarioAutonomo extends Usuario {
    private String area;
    private String carrera;
    private String discapacidad;
    private String lenguaIndigena;
    private String matricula;

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getDiscapacidad() {
        return discapacidad;
    }

    public void setDiscapacidad(String discapacidad) {
        this.discapacidad = discapacidad;
    }

    public String getLenguaIndigena() {
        return lenguaIndigena;
    }

    public void setLenguaIndigena(String lenguaIndigena) {
        this.lenguaIndigena = lenguaIndigena;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    
}
