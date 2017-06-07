/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIAsesor;

import Negocios.Asesor;
import Negocios.Seccion;
import Negocios.SeccionDAO;
import Negocios.UsuarioAutonomo;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


/**
 *
 * @author Cristhian Ubaldo Promotor
 */
public class ConsultarMisGrupos extends javax.swing.JFrame {
    private Asesor asesor;
    ArrayList<Seccion> seccionesEncontradas;
    /**
     * Creates new form ConsultarMisGrupos
     */
    public ConsultarMisGrupos(Asesor asesor) {
        this.asesor = asesor;
        initComponents();
        setVisible(true);
        setLocationRelativeTo(null);
        SeccionDAO secciones = new SeccionDAO();
        
        ImageIcon imagen = new ImageIcon(getClass().getResource("/Recursos/fondo-menu-pantalla.jpg"));
        ImageIcon icono = new ImageIcon(imagen.getImage().getScaledInstance(fondoConsultarGrupos.getWidth(), fondoConsultarGrupos.getHeight(), Image.SCALE_DEFAULT));
        fondoConsultarGrupos.setIcon(icono);
        seccionesEncontradas = secciones.obtenerSeccione(asesor.getNumeroPersonal());
        
        crearCuadrosSecciones(seccionesEncontradas);
        
    }
    
    public void crearCuadrosSecciones(ArrayList<Seccion> misSecciones){
        
        ArrayList <CuadroSeccion> cuadros = new ArrayList();
        
        for(int i = 0; i < misSecciones.size(); i++){
            
            CuadroSeccion cuadro = new CuadroSeccion(misSecciones.get(i),panelAlumnos);
            cuadros.add(cuadro);
        }
    
        mostrarCuadrosSeccion(cuadros);
    }
    
    
    public void mostrarCuadrosSeccion(ArrayList<CuadroSeccion> cuadros){
        
        int x = 5;
        int y = 5;
        
        CuadroSeccion cuadro;
        
        for(int i=0; i < cuadros.size();i++){
            
            cuadro = cuadros.get(i);
            cuadro.setBounds(x, y, 187, 134);
            panelCursos.add(cuadro);
            y += 144;
        }
            
        
        panelCursos.repaint();
        panelCursos.revalidate();
        repaint();
        
    }
    
    public void crearCuadrosAlumnos(ArrayList<UsuarioAutonomo> alumnosEncontrados){
        
        ArrayList <CuadroAlumno> cuadros = new ArrayList();
        
        for(int i = 0; i < alumnosEncontrados.size(); i++){
            
            CuadroAlumno cuadro = new CuadroAlumno(alumnosEncontrados.get(i));
            cuadros.add(cuadro);
        }
    
        mostrarCuadrosAlumno(cuadros);
    }
    
    
    public void mostrarCuadrosAlumno(ArrayList<CuadroAlumno> cuadros){
        
        int x = 10;
        int y = 10;
        int contador = 0;
        CuadroAlumno cuadro;
        
        for(int i=0;i<cuadros.size();i++){
            
            cuadro = cuadros.get(i);
            
            if(contador < 2){
                cuadro.setBounds(x, y, 360, 170 );
                panelAlumnos.add(cuadro);
                x += 330;
                contador++;
            }else{
                y += 158;
                x = 10;
                contador = 0;
                cuadro.setBounds(x, y, 360, 170);
                panelAlumnos.add(cuadro);
                x += 215;
            }
        }
        panelAlumnos.repaint();
        panelAlumnos.revalidate();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonRegresar = new javax.swing.JButton();
        campoBusqueda = new javax.swing.JTextField();
        botonBuscar = new javax.swing.JButton();
        cursos = new javax.swing.JLabel();
        botonCancelar = new javax.swing.JButton();
        alumnos = new javax.swing.JLabel();
        indicacionBusqueda = new javax.swing.JLabel();
        panelCursos = new javax.swing.JPanel();
        panelAlumnos = new javax.swing.JPanel();
        fondoConsultarGrupos = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Consultar grupos");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonRegresar.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        botonRegresar.setForeground(new java.awt.Color(255, 255, 255));
        botonRegresar.setText("Regresar");
        botonRegresar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        botonRegresar.setContentAreaFilled(false);
        botonRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(botonRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 31, 90, 30));

        campoBusqueda.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        campoBusqueda.setText("Ingrese nombre o matricula");
        campoBusqueda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                campoBusquedaMouseClicked(evt);
            }
        });
        getContentPane().add(campoBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 190, 30));

        botonBuscar.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        botonBuscar.setForeground(new java.awt.Color(255, 255, 255));
        botonBuscar.setText("Buscar");
        botonBuscar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        botonBuscar.setContentAreaFilled(false);
        botonBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(botonBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, 80, 30));

        cursos.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 18)); // NOI18N
        cursos.setForeground(new java.awt.Color(255, 255, 255));
        cursos.setText("Cursos");
        getContentPane().add(cursos, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, -1, -1));

        botonCancelar.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        botonCancelar.setForeground(new java.awt.Color(255, 255, 255));
        botonCancelar.setText("Cancelar búsqueda");
        botonCancelar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        botonCancelar.setContentAreaFilled(false);
        botonCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(botonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 30, 160, 30));

        alumnos.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 18)); // NOI18N
        alumnos.setForeground(new java.awt.Color(255, 255, 255));
        alumnos.setText("Alumnos");
        getContentPane().add(alumnos, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 100, -1, -1));

        indicacionBusqueda.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 18)); // NOI18N
        indicacionBusqueda.setForeground(new java.awt.Color(255, 255, 255));
        indicacionBusqueda.setText("Buscar:");
        getContentPane().add(indicacionBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 30, 60, 30));

        panelCursos.setBackground(new java.awt.Color(255, 255, 255));
        panelCursos.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        panelCursos.setOpaque(false);
        getContentPane().add(panelCursos, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 220, 540));

        panelAlumnos.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        panelAlumnos.setOpaque(false);
        getContentPane().add(panelAlumnos, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, 710, 540));

        fondoConsultarGrupos.setBackground(new java.awt.Color(153, 153, 255));
        fondoConsultarGrupos.setOpaque(true);
        getContentPane().add(fondoConsultarGrupos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegresarActionPerformed
        new MenuPrincipalAsesor(asesor);
        dispose();
    }//GEN-LAST:event_botonRegresarActionPerformed

    private void botonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarActionPerformed
        
       panelCursos.removeAll();
       panelAlumnos.removeAll();
       crearCuadrosSecciones(seccionesEncontradas);
        
    }//GEN-LAST:event_botonCancelarActionPerformed

    private void campoBusquedaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campoBusquedaMouseClicked
        
        campoBusqueda.setText("");
        
    }//GEN-LAST:event_campoBusquedaMouseClicked

    private void botonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarActionPerformed
        
        if(campoBusqueda.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "No hay nada para buscar");
        }else{
            
            SeccionDAO busqueda = new SeccionDAO();
            panelCursos.removeAll();
            panelAlumnos.removeAll();
            repaint();
            crearCuadrosAlumnos(busqueda.obtenerMisAlumnos(asesor, campoBusqueda.getText()));
        }
        

    }//GEN-LAST:event_botonBuscarActionPerformed

   
    
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel alumnos;
    private javax.swing.JButton botonBuscar;
    private javax.swing.JButton botonCancelar;
    private javax.swing.JButton botonRegresar;
    private javax.swing.JTextField campoBusqueda;
    private javax.swing.JLabel cursos;
    private javax.swing.JLabel fondoConsultarGrupos;
    private javax.swing.JLabel indicacionBusqueda;
    private javax.swing.JPanel panelAlumnos;
    private javax.swing.JPanel panelCursos;
    // End of variables declaration//GEN-END:variables
}
