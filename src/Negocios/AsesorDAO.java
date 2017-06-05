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

/**
 *
 * @author Cristhian Ubaldo Promotor
 */
public class AsesorDAO implements IAsesorDAO{
    @Override
    public Asesor obtenerAsesor(String usuario){
        
        Conexion conexion = new Conexion();
        PreparedStatement sentencia = null;
        ResultSet resultado = null;
        String consultaSQL = null;
        
        Asesor asesor = new Asesor();
        
        consultaSQL = "SELECT * FROM asesor WHERE usuario =?";
        
        try{
            
            sentencia = conexion.obtenerConexion().prepareStatement(consultaSQL);           
            sentencia.setString(1, usuario);
            resultado = sentencia.executeQuery();
            
            if(resultado.next()){
                
               asesor.setNumeroPersonal(resultado.getString(1));
               asesor.setUsuario(resultado.getString(2));
               asesor.setNombre(resultado.getString(4));
               asesor.setApellidos(resultado.getString(5));
               asesor.setCorreo(resultado.getString(6));
               asesor.setFechaNacimiento(resultado.getDate(7));
               asesor.setGenero(resultado.getString(8));
               asesor.setTelefono(resultado.getString(6));
               asesor.setCarreraEgresada(resultado.getString(6));
                   
            }
        }catch(SQLException ex){
            
        }finally{
            conexion.cerrarConexion();
        }
        
        return asesor;
        
    }
}
