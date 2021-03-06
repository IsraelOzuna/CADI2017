package GUI.UsuarioAutonomo;

import GUI.IniciarSesion;
import Negocios.UsuarioAutonomo;
import Negocios.UsuarioAutonomoDAO;

/**
 *Interfaz gráfica del menú en el cual el alumno podrá realizar las actividades
 * que puede realizar
 * @author Israel Reyes Ozuna
 * @author Cristhian Ubaldo Promotor
 */
public class MenuPrincipalUsuarioAutonomo extends javax.swing.JFrame {
    private String usuario;
    private UsuarioAutonomo alumno;
    /**
     * Crea un ventana MenuPrincipal y obtiene el usuario del cuan trata
     * @param usuario recibira un alumno el cual será el que accedio al sistema
     */
    public MenuPrincipalUsuarioAutonomo(String usuario) {  
        initComponents();
        setVisible(true);
        setLocationRelativeTo(null);
        
        this.usuario = usuario;      
        UsuarioAutonomoDAO alumno = new UsuarioAutonomoDAO();
        this.alumno = alumno.obtenerUsuarioAutonomo(usuario);    
        nombreUsuarioAutonomo.setText(this.alumno.getNombre()+" "+this.alumno.getApellidos());
        
    }
    /**
     * Usado cuando ya se tiene un usuario
     * evitando el consultarlo de nuevo
     * @param usuario el usuario autónomo elcual ya no se tiene que consultar
     */
    public MenuPrincipalUsuarioAutonomo(UsuarioAutonomo usuario){
        
        initComponents();
        setVisible(true);
        setLocationRelativeTo(null);
        alumno = usuario;
        nombreUsuarioAutonomo.setText(this.alumno.getNombre()+" "+this.alumno.getApellidos());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        panelMenu = new javax.swing.JPanel();
        descripcionAvisos = new javax.swing.JLabel();
        panelReservarActividad = new javax.swing.JPanel();
        botonReservarActividad = new javax.swing.JButton();
        botonConsultarMisAvances = new javax.swing.JButton();
        botonConsultarCalendarioActividades = new javax.swing.JButton();
        botonVerAvisos = new javax.swing.JButton();
        botonCerrarSesion = new javax.swing.JButton();
        nombreUsuarioAutonomo = new javax.swing.JLabel();
        panelAvisos = new javax.swing.JPanel();
        panleCalendarioActividades = new javax.swing.JPanel();
        panelMisAvances = new javax.swing.JPanel();
        descripcionCalendarioActividades = new javax.swing.JLabel();
        descripcionMisAvances = new javax.swing.JLabel();
        descripcionReservarActividad1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelMenu.setBackground(new java.awt.Color(0, 102, 153));
        panelMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        descripcionAvisos.setBackground(new java.awt.Color(65, 167, 19));
        descripcionAvisos.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 12)); // NOI18N
        descripcionAvisos.setForeground(new java.awt.Color(255, 255, 255));
        descripcionAvisos.setText("Debes estar atento a los avisos que sean publicados en el portal ");
        panelMenu.add(descripcionAvisos, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 420, 20));

        panelReservarActividad.setBackground(new java.awt.Color(102, 225, 47));

        javax.swing.GroupLayout panelReservarActividadLayout = new javax.swing.GroupLayout(panelReservarActividad);
        panelReservarActividad.setLayout(panelReservarActividadLayout);
        panelReservarActividadLayout.setHorizontalGroup(
            panelReservarActividadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
        );
        panelReservarActividadLayout.setVerticalGroup(
            panelReservarActividadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        panelMenu.add(panelReservarActividad, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 420, 10));

        botonReservarActividad.setBackground(new java.awt.Color(65, 167, 19));
        botonReservarActividad.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        botonReservarActividad.setForeground(new java.awt.Color(255, 255, 255));
        botonReservarActividad.setText("Reservar actividad");
        botonReservarActividad.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        botonReservarActividad.setBorderPainted(false);
        botonReservarActividad.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonReservarActividad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonReservarActividadActionPerformed(evt);
            }
        });
        panelMenu.add(botonReservarActividad, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 170, 60));

        botonConsultarMisAvances.setBackground(new java.awt.Color(0, 153, 153));
        botonConsultarMisAvances.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        botonConsultarMisAvances.setForeground(new java.awt.Color(255, 255, 255));
        botonConsultarMisAvances.setText("Mis avances");
        botonConsultarMisAvances.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonConsultarMisAvances.setBorderPainted(false);
        botonConsultarMisAvances.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelMenu.add(botonConsultarMisAvances, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 170, 60));

        botonConsultarCalendarioActividades.setBackground(new java.awt.Color(51, 153, 102));
        botonConsultarCalendarioActividades.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        botonConsultarCalendarioActividades.setForeground(new java.awt.Color(255, 255, 255));
        botonConsultarCalendarioActividades.setText("Calendario de actividades");
        botonConsultarCalendarioActividades.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonConsultarCalendarioActividades.setBorderPainted(false);
        botonConsultarCalendarioActividades.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelMenu.add(botonConsultarCalendarioActividades, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 170, 60));

        botonVerAvisos.setBackground(new java.awt.Color(0, 153, 51));
        botonVerAvisos.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        botonVerAvisos.setForeground(new java.awt.Color(255, 255, 255));
        botonVerAvisos.setText("Avisos");
        botonVerAvisos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonVerAvisos.setBorderPainted(false);
        botonVerAvisos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonVerAvisos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVerAvisosActionPerformed(evt);
            }
        });
        panelMenu.add(botonVerAvisos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 170, 60));

        botonCerrarSesion.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 12)); // NOI18N
        botonCerrarSesion.setForeground(new java.awt.Color(255, 255, 255));
        botonCerrarSesion.setText("Cerrar sesión");
        botonCerrarSesion.setBorder(null);
        botonCerrarSesion.setBorderPainted(false);
        botonCerrarSesion.setContentAreaFilled(false);
        botonCerrarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCerrarSesionActionPerformed(evt);
            }
        });
        panelMenu.add(botonCerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 10, -1, -1));

        nombreUsuarioAutonomo.setBackground(new java.awt.Color(255, 255, 255));
        nombreUsuarioAutonomo.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 18)); // NOI18N
        nombreUsuarioAutonomo.setForeground(new java.awt.Color(255, 255, 255));
        panelMenu.add(nombreUsuarioAutonomo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 230, 30));

        panelAvisos.setBackground(new java.awt.Color(18, 209, 82));

        javax.swing.GroupLayout panelAvisosLayout = new javax.swing.GroupLayout(panelAvisos);
        panelAvisos.setLayout(panelAvisosLayout);
        panelAvisosLayout.setHorizontalGroup(
            panelAvisosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
        );
        panelAvisosLayout.setVerticalGroup(
            panelAvisosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        panelMenu.add(panelAvisos, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 420, 10));

        panleCalendarioActividades.setBackground(new java.awt.Color(88, 209, 148));

        javax.swing.GroupLayout panleCalendarioActividadesLayout = new javax.swing.GroupLayout(panleCalendarioActividades);
        panleCalendarioActividades.setLayout(panleCalendarioActividadesLayout);
        panleCalendarioActividadesLayout.setHorizontalGroup(
            panleCalendarioActividadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
        );
        panleCalendarioActividadesLayout.setVerticalGroup(
            panleCalendarioActividadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        panelMenu.add(panleCalendarioActividades, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, 420, 10));

        panelMisAvances.setBackground(new java.awt.Color(19, 211, 211));

        javax.swing.GroupLayout panelMisAvancesLayout = new javax.swing.GroupLayout(panelMisAvances);
        panelMisAvances.setLayout(panelMisAvancesLayout);
        panelMisAvancesLayout.setHorizontalGroup(
            panelMisAvancesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
        );
        panelMisAvancesLayout.setVerticalGroup(
            panelMisAvancesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        panelMenu.add(panelMisAvances, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 380, 420, 10));

        descripcionCalendarioActividades.setBackground(new java.awt.Color(65, 167, 19));
        descripcionCalendarioActividades.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 12)); // NOI18N
        descripcionCalendarioActividades.setForeground(new java.awt.Color(255, 255, 255));
        descripcionCalendarioActividades.setText("Mira todas las actividades que son ofertadas en el periodo escolar");
        panelMenu.add(descripcionCalendarioActividades, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, 420, 20));

        descripcionMisAvances.setBackground(new java.awt.Color(65, 167, 19));
        descripcionMisAvances.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 12)); // NOI18N
        descripcionMisAvances.setForeground(new java.awt.Color(255, 255, 255));
        descripcionMisAvances.setText("Verifica las actividades y evidencias que haz realizado en el presente periodo");
        panelMenu.add(descripcionMisAvances, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 400, 430, 20));

        descripcionReservarActividad1.setBackground(new java.awt.Color(65, 167, 19));
        descripcionReservarActividad1.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 12)); // NOI18N
        descripcionReservarActividad1.setForeground(new java.awt.Color(255, 255, 255));
        descripcionReservarActividad1.setText("Aquí podrás reservar las actividades que son ofertadas a lo largo del periodo");
        panelMenu.add(descripcionReservarActividad1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 84, 420, 20));

        getContentPane().add(panelMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonReservarActividadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonReservarActividadActionPerformed
        new ReservarActividad(alumno);
        dispose();
    }//GEN-LAST:event_botonReservarActividadActionPerformed

    private void botonVerAvisosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVerAvisosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonVerAvisosActionPerformed

    private void botonCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCerrarSesionActionPerformed
        new IniciarSesion ();
        dispose();
    }//GEN-LAST:event_botonCerrarSesionActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCerrarSesion;
    private javax.swing.JButton botonConsultarCalendarioActividades;
    private javax.swing.JButton botonConsultarMisAvances;
    private javax.swing.JButton botonReservarActividad;
    private javax.swing.JButton botonVerAvisos;
    private javax.swing.JLabel descripcionAvisos;
    private javax.swing.JLabel descripcionCalendarioActividades;
    private javax.swing.JLabel descripcionMisAvances;
    private javax.swing.JLabel descripcionReservarActividad1;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JLabel nombreUsuarioAutonomo;
    private javax.swing.JPanel panelAvisos;
    private javax.swing.JPanel panelMenu;
    private javax.swing.JPanel panelMisAvances;
    private javax.swing.JPanel panelReservarActividad;
    private javax.swing.JPanel panleCalendarioActividades;
    // End of variables declaration//GEN-END:variables
}
