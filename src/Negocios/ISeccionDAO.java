
package Negocios;

import java.util.ArrayList;
import java.util.List;

/**
 *Define los métodos que utilizrá la clase SeccionDAO
 * @author Israel Reyes Ozuna
 * @author Cristhian Ubaldo Promotr
 * @version 6/06/2017
 */
public interface ISeccionDAO {
    
    public List <Seccion> obtenerSeccionesDeAsesor(String numeroPersonalAsesor);
     public List<UsuarioAutonomo> obtenerAlumnosSeccion(String nrcCruso);
     public ArrayList<UsuarioAutonomo> buscarAlumnosAsesor(Asesor asesor, String palabraClave);
     
}
