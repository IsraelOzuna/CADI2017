
package GUI;

import GUI.UsuarioAutonomo.MenuPrincipalUsuarioAutonomo;
import GUIAsesor.MenuPrincipalAsesor;
import Negocios.UsuarioDAO;
import Recursos.MensajeBandera;
import javax.swing.JOptionPane;

/**
 *
 * @author Ozuna
 */
public class IniciarSesion extends javax.swing.JFrame {

    /**
     * Creates new form IniciarSesionn
     */
    public IniciarSesion() {
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

        panelIniciarSesion = new javax.swing.JPanel();
        usuario = new javax.swing.JLabel();
        contraseña = new javax.swing.JLabel();
        separadorContrasena = new javax.swing.JSeparator();
        separadorUsuario = new javax.swing.JSeparator();
        campoContrasena = new javax.swing.JPasswordField();
        campoUsuario = new javax.swing.JTextField();
        botonCancelar = new javax.swing.JButton();
        campoPresentacion = new javax.swing.JLabel();
        botonIngresar = new javax.swing.JButton();
        panelIngresar = new javax.swing.JPanel();
        separadorCancelar = new javax.swing.JSeparator();
        panelPresentacion = new javax.swing.JPanel();
        escudoUV = new javax.swing.JLabel();
        titulo = new javax.swing.JLabel();
        titulo2 = new javax.swing.JLabel();
        UV = new javax.swing.JLabel();
        separador = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelIniciarSesion.setBackground(new java.awt.Color(0, 102, 153));
        panelIniciarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelIniciarSesionMouseClicked(evt);
            }
        });
        panelIniciarSesion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        usuario.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 18)); // NOI18N
        usuario.setForeground(new java.awt.Color(255, 255, 255));
        usuario.setText("Usuario");
        panelIniciarSesion.add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        contraseña.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 18)); // NOI18N
        contraseña.setForeground(new java.awt.Color(255, 255, 255));
        contraseña.setText("Contraseña");
        panelIniciarSesion.add(contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));

        separadorContrasena.setForeground(new java.awt.Color(255, 255, 255));
        panelIniciarSesion.add(separadorContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 270, 10));

        separadorUsuario.setForeground(new java.awt.Color(255, 255, 255));
        panelIniciarSesion.add(separadorUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 270, 10));

        campoContrasena.setBackground(new java.awt.Color(0, 102, 153));
        campoContrasena.setForeground(new java.awt.Color(255, 255, 255));
        campoContrasena.setBorder(null);
        campoContrasena.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        campoContrasena.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                campoContrasenaFocusGained(evt);
            }
        });
        campoContrasena.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                campoContrasenaMouseClicked(evt);
            }
        });
        campoContrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoContrasenaActionPerformed(evt);
            }
        });
        panelIniciarSesion.add(campoContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 270, -1));

        campoUsuario.setBackground(new java.awt.Color(0, 102, 153));
        campoUsuario.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        campoUsuario.setForeground(new java.awt.Color(255, 255, 255));
        campoUsuario.setBorder(null);
        campoUsuario.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        campoUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                campoUsuarioFocusGained(evt);
            }
        });
        campoUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                campoUsuarioMouseClicked(evt);
            }
        });
        campoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoUsuarioActionPerformed(evt);
            }
        });
        campoUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoUsuarioKeyTyped(evt);
            }
        });
        panelIniciarSesion.add(campoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 270, -1));

        botonCancelar.setBackground(new java.awt.Color(255, 255, 255));
        botonCancelar.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 12)); // NOI18N
        botonCancelar.setForeground(new java.awt.Color(255, 255, 255));
        botonCancelar.setText("Cancelar");
        botonCancelar.setBorder(null);
        botonCancelar.setBorderPainted(false);
        botonCancelar.setContentAreaFilled(false);
        botonCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonCancelar.setPreferredSize(new java.awt.Dimension(77, 23));
        botonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelarActionPerformed(evt);
            }
        });
        panelIniciarSesion.add(botonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 370, 110, 40));

        campoPresentacion.setBackground(new java.awt.Color(255, 255, 255));
        campoPresentacion.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        campoPresentacion.setForeground(new java.awt.Color(255, 255, 255));
        campoPresentacion.setText("Inicia Sesión en el portal");
        panelIniciarSesion.add(campoPresentacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 210, -1));

        botonIngresar.setBackground(new java.awt.Color(255, 255, 255));
        botonIngresar.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 12)); // NOI18N
        botonIngresar.setForeground(new java.awt.Color(255, 255, 255));
        botonIngresar.setText("Ingresar");
        botonIngresar.setBorder(null);
        botonIngresar.setBorderPainted(false);
        botonIngresar.setContentAreaFilled(false);
        botonIngresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIngresarActionPerformed(evt);
            }
        });
        panelIniciarSesion.add(botonIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 120, 40));

        panelIngresar.setBackground(new java.awt.Color(1, 80, 160));

        javax.swing.GroupLayout panelIngresarLayout = new javax.swing.GroupLayout(panelIngresar);
        panelIngresar.setLayout(panelIngresarLayout);
        panelIngresarLayout.setHorizontalGroup(
            panelIngresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );
        panelIngresarLayout.setVerticalGroup(
            panelIngresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        panelIniciarSesion.add(panelIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 120, 40));

        separadorCancelar.setForeground(new java.awt.Color(255, 255, 255));
        panelIniciarSesion.add(separadorCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 400, 80, 10));

        getContentPane().add(panelIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 0, 350, 470));

        panelPresentacion.setBackground(new java.awt.Color(12, 114, 45));
        panelPresentacion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        escudoUV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Flor1024x768SinFondo.png"))); // NOI18N
        panelPresentacion.add(escudoUV, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 120, 350, 310));

        titulo.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 36)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setText("Cento de Autoacceso");
        panelPresentacion.add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 350, 40));

        titulo2.setBackground(new java.awt.Color(255, 255, 255));
        titulo2.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 36)); // NOI18N
        titulo2.setForeground(new java.awt.Color(255, 255, 255));
        titulo2.setText("USBI Xalapa");
        panelPresentacion.add(titulo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, -1, -1));

        UV.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        UV.setForeground(new java.awt.Color(255, 255, 255));
        UV.setText("U n i v e r s i d a d  V e r a c r u z a n a");
        panelPresentacion.add(UV, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 440, 250, -1));

        separador.setForeground(new java.awt.Color(255, 255, 255));
        panelPresentacion.add(separador, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 300, 10));

        getContentPane().add(panelPresentacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoContrasenaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoContrasenaFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_campoContrasenaFocusGained

    private void campoContrasenaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campoContrasenaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_campoContrasenaMouseClicked

    private void campoContrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoContrasenaActionPerformed
        
    }//GEN-LAST:event_campoContrasenaActionPerformed

    private void campoUsuarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoUsuarioFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_campoUsuarioFocusGained

    private void campoUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campoUsuarioMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_campoUsuarioMouseClicked

    private void campoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoUsuarioActionPerformed
        
    }//GEN-LAST:event_campoUsuarioActionPerformed

    private void botonIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIngresarActionPerformed
        MensajeBandera mensaje = null;
        UsuarioDAO usuario = new UsuarioDAO();
        String []campoVacio = campoUsuario.getText().split(" ");
        if(campoContrasena.getText().isEmpty() || campoUsuario.getText().isEmpty() || campoVacio.length == 0)
            JOptionPane.showMessageDialog(null, "Algún campo está vacio");
        else{
            //En caso de no haber un campo vacío se verificará que tipo de usuario es
            //instanciando las partes a las que pueden acceder segun su tipo de usuario
            
            switch(usuario.iniciarSesion(campoUsuario.getText(), campoContrasena.getText())){
                case ERROR_CONEXION:
                    JOptionPane.showMessageDialog(null, "Error al conectar a la base de datos");
                break;
                
                case USUARIO_COORDINADOR:
                    
                    break;
                    
                case USUARIO_RECEPCIONISTA:
                    
                    break;
                    
                case USUARIO_ASESOR:
                    new MenuPrincipalAsesor(campoUsuario.getText());
                    dispose();
                    break;
                    
                case USUARIO_USUARIO_AUTONOMO:
                    new MenuPrincipalUsuarioAutonomo(campoUsuario.getText());
                    dispose();
                    break;
                    
                case USUARIO_INVALIDO:
                    JOptionPane.showMessageDialog(null, "Datos incorrectos");
                    break;
            }
            campoUsuario.setText("");
            campoContrasena.setText("");
         }
    }//GEN-LAST:event_botonIngresarActionPerformed

    private void panelIniciarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelIniciarSesionMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_panelIniciarSesionMouseClicked

    private void botonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_botonCancelarActionPerformed

    private void campoUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoUsuarioKeyTyped
        int limiteCaracteres = 20;
        if(campoUsuario.getText().length() >= limiteCaracteres){
            evt.consume();
        }
    }//GEN-LAST:event_campoUsuarioKeyTyped

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
            java.util.logging.Logger.getLogger(IniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IniciarSesion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel UV;
    private javax.swing.JButton botonCancelar;
    private javax.swing.JButton botonIngresar;
    private javax.swing.JPasswordField campoContrasena;
    private javax.swing.JLabel campoPresentacion;
    private javax.swing.JTextField campoUsuario;
    private javax.swing.JLabel contraseña;
    private javax.swing.JLabel escudoUV;
    private javax.swing.JPanel panelIngresar;
    private javax.swing.JPanel panelIniciarSesion;
    private javax.swing.JPanel panelPresentacion;
    private javax.swing.JSeparator separador;
    private javax.swing.JSeparator separadorCancelar;
    private javax.swing.JSeparator separadorContrasena;
    private javax.swing.JSeparator separadorUsuario;
    private javax.swing.JLabel titulo;
    private javax.swing.JLabel titulo2;
    private javax.swing.JLabel usuario;
    // End of variables declaration//GEN-END:variables
}
