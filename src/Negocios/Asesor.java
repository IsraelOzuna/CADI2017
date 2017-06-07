package Negocios;

/**
 *Contiene infromación de un asesor
 * @author Israel Reyes Ozuna
 * @author Cristhian Ubaldo Promotor
 */
public class Asesor extends Usuario{
    private String carreraEgresada;
    private String numeroPersonal;

    public String getCarreraEgresada() {
        return carreraEgresada;
    }

    public void setCarreraEgresada(String carreraEgresada) {
        this.carreraEgresada = carreraEgresada;
    }

    public String getNumeroPersonal() {
        return numeroPersonal;
    }

    public void setNumeroPersonal(String numeroPersonal) {
        this.numeroPersonal = numeroPersonal;
    }
    
    
    
}
