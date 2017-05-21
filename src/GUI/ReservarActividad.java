/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 *
 * @author Ozuna
 */
public class ReservarActividad extends javax.swing.JFrame {

    /**
     * Creates new form ReservarActividad
     */
    public ReservarActividad() {
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

        jPanel1 = new javax.swing.JPanel();
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
        jDateChooser1 = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 153));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(635, 302));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fechaReservacion.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        fechaReservacion.setForeground(new java.awt.Color(255, 255, 255));
        fechaReservacion.setText(" Fecha de reservación:");
        jPanel1.add(fechaReservacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        horarios.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        horarios.setForeground(new java.awt.Color(255, 255, 255));
        horarios.setText("Horas disponibles:");
        jPanel1.add(horarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        actividad.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        actividad.setForeground(new java.awt.Color(255, 255, 255));
        actividad.setText("Actividad para la reservación:");
        jPanel1.add(actividad, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        comboHoras.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(comboHoras, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 190, -1));

        comboActividades.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(comboActividades, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 190, -1));

        botonCancelar.setBackground(new java.awt.Color(255, 255, 255));
        botonCancelar.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 12)); // NOI18N
        botonCancelar.setForeground(new java.awt.Color(255, 255, 255));
        botonCancelar.setText("Cancelar");
        botonCancelar.setBorder(null);
        botonCancelar.setBorderPainted(false);
        botonCancelar.setContentAreaFilled(false);
        botonCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(botonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, -1, -1));

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
        jPanel1.add(botonConfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 80, 30));

        panelConfirmar.setBackground(new java.awt.Color(1, 80, 160));
        panelConfirmar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(panelConfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 80, 30));

        confirmacionFecha.setBackground(new java.awt.Color(255, 255, 255));
        confirmacionFecha.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 12)); // NOI18N
        confirmacionFecha.setForeground(new java.awt.Color(255, 255, 255));
        confirmacionFecha.setText("Fecha:");
        jPanel1.add(confirmacionFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, -1, -1));

        confirmacionActividad.setBackground(new java.awt.Color(255, 255, 255));
        confirmacionActividad.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 12)); // NOI18N
        confirmacionActividad.setForeground(new java.awt.Color(255, 255, 255));
        confirmacionActividad.setText("Actividad:");
        jPanel1.add(confirmacionActividad, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, -1, -1));

        confirmacionHora.setBackground(new java.awt.Color(255, 255, 255));
        confirmacionHora.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 12)); // NOI18N
        confirmacionHora.setForeground(new java.awt.Color(255, 255, 255));
        confirmacionHora.setText("Hora:");
        jPanel1.add(confirmacionHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, -1, -1));

        confirmacionSala.setBackground(new java.awt.Color(255, 255, 255));
        confirmacionSala.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 12)); // NOI18N
        confirmacionSala.setForeground(new java.awt.Color(255, 255, 255));
        confirmacionSala.setText("Sala:");
        jPanel1.add(confirmacionSala, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, -1, -1));

        confirmacionCaracter.setBackground(new java.awt.Color(255, 255, 255));
        confirmacionCaracter.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 12)); // NOI18N
        confirmacionCaracter.setForeground(new java.awt.Color(255, 255, 255));
        confirmacionCaracter.setText("Caracter:");
        jPanel1.add(confirmacionCaracter, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, -1, -1));

        confirmacionTipo.setBackground(new java.awt.Color(255, 255, 255));
        confirmacionTipo.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 12)); // NOI18N
        confirmacionTipo.setForeground(new java.awt.Color(255, 255, 255));
        confirmacionTipo.setText("Tipo:");
        jPanel1.add(confirmacionTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, -1, -1));

        detallesReservacion.setBackground(new java.awt.Color(255, 255, 255));
        detallesReservacion.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        detallesReservacion.setForeground(new java.awt.Color(255, 255, 255));
        detallesReservacion.setText("Detalles de la reservación");
        jPanel1.add(detallesReservacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 40, -1, -1));

        campoActividadConfirmada.setEditable(false);
        campoActividadConfirmada.setBackground(new java.awt.Color(0, 102, 153));
        campoActividadConfirmada.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 11)); // NOI18N
        campoActividadConfirmada.setForeground(new java.awt.Color(255, 255, 255));
        campoActividadConfirmada.setBorder(null);
        jPanel1.add(campoActividadConfirmada, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, 160, -1));

        campoHoraConfirmada.setEditable(false);
        campoHoraConfirmada.setBackground(new java.awt.Color(0, 102, 153));
        campoHoraConfirmada.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 11)); // NOI18N
        campoHoraConfirmada.setForeground(new java.awt.Color(255, 255, 255));
        campoHoraConfirmada.setBorder(null);
        jPanel1.add(campoHoraConfirmada, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 140, 160, -1));

        campoSalaConfirmada.setEditable(false);
        campoSalaConfirmada.setBackground(new java.awt.Color(0, 102, 153));
        campoSalaConfirmada.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 11)); // NOI18N
        campoSalaConfirmada.setForeground(new java.awt.Color(255, 255, 255));
        campoSalaConfirmada.setBorder(null);
        jPanel1.add(campoSalaConfirmada, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 170, 160, -1));

        campoCaracterConfirmado.setEditable(false);
        campoCaracterConfirmado.setBackground(new java.awt.Color(0, 102, 153));
        campoCaracterConfirmado.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 11)); // NOI18N
        campoCaracterConfirmado.setForeground(new java.awt.Color(255, 255, 255));
        campoCaracterConfirmado.setBorder(null);
        jPanel1.add(campoCaracterConfirmado, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 200, 160, -1));

        campoTipoConfirmado.setEditable(false);
        campoTipoConfirmado.setBackground(new java.awt.Color(0, 102, 153));
        campoTipoConfirmado.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 11)); // NOI18N
        campoTipoConfirmado.setForeground(new java.awt.Color(255, 255, 255));
        campoTipoConfirmado.setBorder(null);
        jPanel1.add(campoTipoConfirmado, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 230, 160, -1));

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
        jPanel1.add(campoFechaConfirmada, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 80, 160, -1));
        jPanel1.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 190, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonConfirmarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonConfirmarActionPerformed

    private void campoFechaConfirmadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoFechaConfirmadaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoFechaConfirmadaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ReservarActividad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReservarActividad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReservarActividad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReservarActividad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReservarActividad().setVisible(true);
            }
        });
    }

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
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel panelConfirmar;
    // End of variables declaration//GEN-END:variables
}
