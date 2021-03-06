
package GUIAsesor;

import Negocios.Seccion;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author Cristhian Ubaldo Promotor
 */
public class CuadroSeccion extends javax.swing.JPanel {
    private Seccion seccion;
    private JPanel panelAlumnos;
    /**
     * Creates new form CuadroSeccion
     * @param seccion Es una seccion la cual tiene entre otros datos
     * una lista de 
     * @param panelAlumnos es el componente en el cual dibujará los componentes creados
     */
    public CuadroSeccion(Seccion seccion, JPanel panelAlumnos) {
        this.seccion = seccion;
        this.panelAlumnos = panelAlumnos;
        initComponents();
        nombreSeccion.setText(seccion.getNombre());
        nrc.setText("NRC: "+seccion.getNrc());
        
    }
  
    /**
     * Este metodo crea los cuadros(paneles) de los alumnos segun el numero de alumnos tenga la sección
     */
    public void crearCuadrosAlumnos(){
        
        ArrayList <CuadroAlumno> cuadros = new ArrayList();
        
        for(int i = 0 ; i < seccion.getAlumnosSeccion().size(); i++ ){
            
            CuadroAlumno cuadro = new CuadroAlumno(seccion.getAlumnosSeccion().get(i));
            cuadros.add(cuadro);
            
        }
        
        mostrarCuadrosAlumnos(cuadros);
       
    }
    
    /**
     * Muestra los cuadros previamente creados en el panel que se recibio en el constructor
     * @param cuadros Es una lista de componente los cuales se colocarán en el panel
     */
    public void mostrarCuadrosAlumnos(ArrayList<CuadroAlumno> cuadros){
        panelAlumnos.removeAll();
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

        nombreSeccion = new javax.swing.JLabel();
        nrc = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 2, true));
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        nombreSeccion.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N

        nrc.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 18)); // NOI18N
        nrc.setText("NRC: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nombreSeccion, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nrc, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(nombreSeccion, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(nrc)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        
        crearCuadrosAlumnos();
        
    }//GEN-LAST:event_formMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel nombreSeccion;
    private javax.swing.JLabel nrc;
    // End of variables declaration//GEN-END:variables
}
