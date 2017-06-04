/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIAsesor;

import Negocios.UsuarioAutonomo;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Cristhian Ubaldo Promotor
 */
public class cuadroAlumno extends javax.swing.JPanel {

    /**
     * Creates new form cuadroAlumno
     */
    public cuadroAlumno(UsuarioAutonomo alumno) {
       
        initComponents();
        
        if(alumno.getGenero() == "Masculino"){
            fotoGenero.setIcon(colocarImagenesEnEtiquetas("/Recursos/iconoHombre.png",fotoGenero));
        }else if (alumno.getGenero()=="Femenino"){
            fotoGenero.setIcon(colocarImagenesEnEtiquetas("/Recursos/iconoMujer.png",fotoGenero));
        }
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fotoGenero = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        datosEstudiante = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 255), new java.awt.Color(0, 0, 255), new java.awt.Color(0, 0, 255), new java.awt.Color(0, 0, 255)));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fotoGenero.setBackground(new java.awt.Color(204, 204, 204));
        fotoGenero.setOpaque(true);
        add(fotoGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 120, 140));

        jScrollPane1.setBorder(null);

        datosEstudiante.setEditable(false);
        datosEstudiante.setColumns(20);
        datosEstudiante.setRows(5);
        datosEstudiante.setOpaque(false);
        jScrollPane1.setViewportView(datosEstudiante);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 220, 140));
    }// </editor-fold>//GEN-END:initComponents
public ImageIcon colocarImagenesEnEtiquetas(String urlImagen, JLabel etiqueta){
        ImageIcon imagen = new ImageIcon(getClass().getResource(urlImagen));
        ImageIcon icono = new ImageIcon(imagen.getImage().getScaledInstance(etiqueta.getWidth(),etiqueta.getHeight(),Image.SCALE_DEFAULT));
        return icono;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea datosEstudiante;
    private javax.swing.JLabel fotoGenero;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
