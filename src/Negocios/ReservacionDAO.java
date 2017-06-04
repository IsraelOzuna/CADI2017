/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocios;

import Datos.Conexion;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ozuna
 */
public class ReservacionDAO implements IReservacionDAO{

    @Override
    public List<Reservacion> obtenerActividadesParaReservacion(UsuarioAutonomo alumno) {
        
               
       List<Reservacion> reservacionesDisponibles = new ArrayList();
        
        Conexion conexion = new Conexion();
        
        conexion.obtenerConexion();
        
        String consultaSQL = "SELECT *FROM reservacion WHERE estado = 'Disponible' ";
        
                
        
        
        return reservacionesDisponibles;
    }
    
    public String obtenerIdiomaUsurioAutonomo(UsuarioAutonomo alumno){
        String idIdioma = null;
        Conexion conexion = new Conexion();
        PreparedStatement sentencia = null;
        
        
        
        
        return idIdioma;
    }
    
}
