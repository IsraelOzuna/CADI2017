/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocios;

import Datos.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ozuna
 */
public class ReservacionDAO implements IReservacionDAO {

    @Override
    public List<Reservacion> obtenerActividadesParaReservacion(UsuarioAutonomo alumno) {

        List<Reservacion> reservacionesDisponibles = new ArrayList();
        List<String> idIdiomas = new ArrayList();
        Conexion conexion = new Conexion();
        PreparedStatement sentencia = null;
        ResultSet resultados = null;
        
        idIdiomas = obtenerIdiomasUsurioAutonomo(alumno);
        conexion.obtenerConexion();
          String consultaSQL = "SELECT *FROM actividadOfertada, actividad WHERE estado = 'Disponible' and actividadOfertada.idActividad = activida.idActivida and "
                + " idIdioma = ?";

        for (int i = 0; i < idIdiomas.size(); i++) {

            try {

                sentencia = conexion.obtenerConexion().prepareStatement(consultaSQL);
                sentencia.setString(1, idIdiomas.get(i));
                resultados = sentencia.executeQuery();
                while(resultados.next()){
                    
                    Reservacion disponibles = new Reservacion();
                    disponibles.setIdReservacion(resultados.getString(1));
                    disponibles.setEstado(resultados.getString(2));
                    disponibles.setCupo(resultados.getInt(3));
                    disponibles.setHoraInicio(resultados.getTime(4));
                    disponibles.setHoraFin(resultados.getTime(5));
                    disponibles.setFecha(resultados.getDate(6));
                    disponibles.getActividad().setIdActividad(resultados.getString(7));
                    disponibles.setSala(resultados.getString(10));
                    disponibles.getActividad().setNombre(resultados.getString(12));
                    disponibles.getActividad().setDescripcion(resultados.getString(13));
                    disponibles.getActividad().setTipo(resultados.getString(14));
                    disponibles.getActividad().setObligatoria(resultados.getBoolean(15));
                    
                    reservacionesDisponibles.add(disponibles);
                }

            } catch (SQLException ex) {
                //bitacora
            }
            finally{
                conexion.cerrarConexion();
            }

        }

      
        

        return reservacionesDisponibles;
    }

    public List<String> obtenerIdiomasUsurioAutonomo(UsuarioAutonomo alumno) {

        List<String> idIdiomas = new ArrayList();
        Conexion conexion = new Conexion();
        PreparedStatement sentencia = null;
        ResultSet resultados = null;

        String consultaSQL = "SELECT idiomaAsignado from inscripcion,usuarioAutonomo, seccion where inscripcion.matricula = usuarioAutonomo.matricula and"
                + " inscripcion.nrc = seccion.nrc and usuarioAutonomo.matricula = ?";

        try {

            sentencia = conexion.obtenerConexion().prepareStatement(consultaSQL);
            sentencia.setString(1, alumno.getMatricula());
            resultados = sentencia.executeQuery();

            while (resultados.next()) {
                idIdiomas.add(resultados.getString(1));
            }

        } catch (SQLException ex) {

        }finally{
            conexion.cerrarConexion();
        }
        
        return idIdiomas;
    }

}
