/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.UsuarioAutonomo;

import javax.swing.JOptionPane;

/**
 *
 * @author Ozuna
 */
public class ReservarActividad extends javax.swing.JFrame {
    private String usuario;
    /**
     * Creates new form ReservarActividad
     */
    public ReservarActividad(String usuario) {
        this.usuario = usuario;
        initComponents();
        setVisible(true);
        setLocationRelativeTo(null);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelReservarActividad = new javax.swing.JPanel();
        fechaReservacion = new javax.swing.JLabel();
        horarios = new javax.swing.JLabel();
        actividad = new javax.swing.JLabel();
        comboHoras = new javax.swing.JComboBox<>();
        comboActividades = new javax.swing.JComboBox<>();
        botonCancelar = new javax.swing.JButton();
        botonConfirmar = new javax.swing.JButton();
        panelConfirmar = new javax.swing.JPanel();
        confirmacionFecha = new javax.swing.JLabel();
        confirmacionActividad = new javax.swing.JLabel();
        confirmacionHora = new javax.swing.JLabel();
        confirmacionSala = new javax.swing.JLabel();
        confirmacionCaracter = new javax.swing.JLabel();
        confirmacionTipo = new javax.swing.JLabel();
        detallesReservacion = new javax.swing.JLabel();
        campoActividadConfirmada = new javax.swing.JTextField();
        campoHoraConfirmada = new javax.swing.JTextField();
        campoSalaConfirmada = new javax.swing.JTextField();
        campoCaracterConfirmado = new javax.swing.JTextField();
        campoTipoConfirmado = new javax.swing.JTextField();
        campoFechaConfirmada = new javax.swing.JTextField();
        comboFechas = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelReservarActividad.setBackground(new java.awt.Color(0, 102, 153));
        panelReservarActividad.setForeground(new java.awt.Color(255, 255, 255));
        panelReservarActividad.setPreferredSize(new java.awt.Dimension(635, 302));
        panelReservarActividad.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fechaReservacion.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        fechaReservacion.setForeground(new java.awt.Color(255, 255, 255));
        fechaReservacion.setText(" Fecha de reservación:");
        panelReservarActividad.add(fechaReservacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        horarios.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        horarios.setForeground(new java.awt.Color(255, 255, 255));
        horarios.setText("Horas disponibles:");
        panelReservarActividad.add(horarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        actividad.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        actividad.setForeground(new java.awt.Color(255, 255, 255));
        actividad.setText("Actividad para la reservación:");
        panelReservarActividad.add(actividad, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        comboHoras.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        panelReservarActividad.add(comboHoras, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 190, -1));

        comboActividades.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        panelReservarActividad.add(comboActividades, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 190, -1));

        botonCancelar.setBackground(new java.awt.Color(255, 255, 255));
        botonCancelar.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 12)); // NOI18N
        botonCancelar.setForeground(new java.awt.Color(255, 255, 255));
        botonCancelar.setText("Cancelar");
        botonCancelar.setBorder(null);
        botonCancelar.setBorderPainted(false);
        botonCancelar.setContentAreaFilled(false);
        botonCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelarActionPerformed(evt);
            }
        });
        panelReservarActividad.add(botonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, -1, -1));

        botonConfirmar.setBackground(new java.awt.Color(255, 255, 255));
        botonConfirmar.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 12)); // NOI18N
        botonConfirmar.setForeground(new java.awt.Color(255, 255, 255));
        botonConfirmar.setText("Confirmar");
        botonConfirmar.setBorder(null);
        botonConfirmar.setBorderPainted(false);
        botonConfirmar.setContentAreaFilled(false);
        botonConfirmar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonConfirmarActionPerformed(evt);
            }
        });
        panelReservarActividad.add(botonConfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 80, 30));

        panelConfirmar.setBackground(new java.awt.Color(1, 80, 160));
        panelConfirmar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        panelReservarActividad.add(panelConfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 80, 30));

        confirmacionFecha.setBackground(new java.awt.Color(255, 255, 255));
        confirmacionFecha.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 12)); // NOI18N
        confirmacionFecha.setForeground(new java.awt.Color(255, 255, 255));
        confirmacionFecha.setText("Fecha:");
        panelReservarActividad.add(confirmacionFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, -1, -1));

        confirmacionActividad.setBackground(new java.awt.Color(255, 255, 255));
        confirmacionActividad.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 12)); // NOI18N
        confirmacionActividad.setForeground(new java.awt.Color(255, 255, 255));
        confirmacionActividad.setText("Actividad:");
        panelReservarActividad.add(confirmacionActividad, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, -1, -1));

        confirmacionHora.setBackground(new java.awt.Color(255, 255, 255));
        confirmacionHora.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 12)); // NOI18N
        confirmacionHora.setForeground(new java.awt.Color(255, 255, 255));
        confirmacionHora.setText("Hora:");
        panelReservarActividad.add(confirmacionHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, -1, -1));

        confirmacionSala.setBackground(new java.awt.Color(255, 255, 255));
        confirmacionSala.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 12)); // NOI18N
        confirmacionSala.setForeground(new java.awt.Color(255, 255, 255));
        confirmacionSala.setText("Sala:");
        panelReservarActividad.add(confirmacionSala, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, -1, -1));

        confirmacionCaracter.setBackground(new java.awt.Color(255, 255, 255));
        confirmacionCaracter.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 12)); // NOI18N
        confirmacionCaracter.setForeground(new java.awt.Color(255, 255, 255));
        confirmacionCaracter.setText("Caracter:");
        panelReservarActividad.add(confirmacionCaracter, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, -1, -1));

        confirmacionTipo.setBackground(new java.awt.Color(255, 255, 255));
        confirmacionTipo.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 12)); // NOI18N
        confirmacionTipo.setForeground(new java.awt.Color(255, 255, 255));
        confirmacionTipo.setText("Tipo:");
        panelReservarActividad.add(confirmacionTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, -1, -1));

        detallesReservacion.setBackground(new java.awt.Color(255, 255, 255));
        detallesReservacion.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        detallesReservacion.setForeground(new java.awt.Color(255, 255, 255));
        detallesReservacion.setText("Detalles de la reservación");
        panelReservarActividad.add(detallesReservacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 40, -1, -1));

        campoActividadConfirmada.setEditable(false);
        campoActividadConfirmada.setBackground(new java.awt.Color(0, 102, 153));
        campoActividadConfirmada.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 11)); // NOI18N
        campoActividadConfirmada.setForeground(new java.awt.Color(255, 255, 255));
        campoActividadConfirmada.setBorder(null);
        panelReservarActividad.add(campoActividadConfirmada, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, 160, -1));

        campoHoraConfirmada.setEditable(false);
        campoHoraConfirmada.setBackground(new java.awt.Color(0, 102, 153));
        campoHoraConfirmada.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 11)); // NOI18N
        campoHoraConfirmada.setForeground(new java.awt.Color(255, 255, 255));
        campoHoraConfirmada.setBorder(null);
        panelReservarActividad.add(campoHoraConfirmada, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 140, 160, -1));

        campoSalaConfirmada.setEditable(false);
        campoSalaConfirmada.setBackground(new java.awt.Color(0, 102, 153));
        campoSalaConfirmada.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 11)); // NOI18N
        campoSalaConfirmada.setForeground(new java.awt.Color(255, 255, 255));
        campoSalaConfirmada.setBorder(null);
        panelReservarActividad.add(campoSalaConfirmada, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 170, 160, -1));

        campoCaracterConfirmado.setEditable(false);
        campoCaracterConfirmado.setBackground(new java.awt.Color(0, 102, 153));
        campoCaracterConfirmado.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 11)); // NOI18N
        campoCaracterConfirmado.setForeground(new java.awt.Color(255, 255, 255));
        campoCaracterConfirmado.setBorder(null);
        panelReservarActividad.add(campoCaracterConfirmado, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 200, 160, -1));

        campoTipoConfirmado.setEditable(false);
        campoTipoConfirmado.setBackground(new java.awt.Color(0, 102, 153));
        campoTipoConfirmado.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 11)); // NOI18N
        campoTipoConfirmado.setForeground(new java.awt.Color(255, 255, 255));
        campoTipoConfirmado.setBorder(null);
        panelReservarActividad.add(campoTipoConfirmado, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 230, 160, -1));

        campoFechaConfirmada.setEditable(false);
        campoFechaConfirmada.setBackground(new java.awt.Color(0, 102, 153));
        campoFechaConfirmada.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 11)); // NOI18N
        campoFechaConfirmada.setForeground(new java.awt.Color(255, 255, 255));
        campoFechaConfirmada.setBorder(null);
        campoFechaConfirmada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoFechaConfirmadaActionPerformed(evt);
            }
        });
        panelReservarActividad.add(campoFechaConfirmada, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 80, 160, -1));

        comboFechas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        panelReservarActividad.add(comboFechas, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 190, -1));

        getContentPane().add(panelReservarActividad, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonConfirmarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonConfirmarActionPerformed

    private void campoFechaConfirmadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoFechaConfirmadaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoFechaConfirmadaActionPerformed

    private void comboActividadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboActividadesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboActividadesActionPerformed

    private void botonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarActionPerformed
        dispose();      
    }//GEN-LAST:event_botonCancelarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel actividad;
    private javax.swing.JButton botonCancelar;
    private javax.swing.JButton botonConfirmar;
    private javax.swing.JTextField campoActividadConfirmada;
    private javax.swing.JTextField campoCaracterConfirmado;
    private javax.swing.JTextField campoFechaConfirmada;
    private javax.swing.JTextField campoHoraConfirmada;
    private javax.swing.JTextField campoSalaConfirmada;
    private javax.swing.JTextField campoTipoConfirmado;
    private javax.swing.JComboBox<String> comboActividades;
    private javax.swing.JComboBox<String> comboFechas;
    private javax.swing.JComboBox<String> comboHoras;
    private javax.swing.JLabel confirmacionActividad;
    private javax.swing.JLabel confirmacionCaracter;
    private javax.swing.JLabel confirmacionFecha;
    private javax.swing.JLabel confirmacionHora;
    private javax.swing.JLabel confirmacionSala;
    private javax.swing.JLabel confirmacionTipo;
    private javax.swing.JLabel detallesReservacion;
    private javax.swing.JLabel fechaReservacion;
    private javax.swing.JLabel horarios;
    private javax.swing.JPanel panelConfirmar;
    private javax.swing.JPanel panelReservarActividad;
    // End of variables declaration//GEN-END:variables
}
