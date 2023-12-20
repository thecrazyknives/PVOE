/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uam.pvoe.sw.otros.formas;

import java.awt.Color;
import java.util.LinkedList;



/**
 *
 * @author josue
 */
public class FrmOtrosElementos extends javax.swing.JFrame {

    /**
     * Creates new form FrmOtrosElementos
     */
    public FrmOtrosElementos() {
        initComponents();
        configurarSliderTemp();
        configurarSliderPres();
        configurarSliderProf();
        txtStatus.setBackground(Color.GREEN);
  

    }
    
    public void configurarSliderTemp(){
        sldrTemperatura.setMinimum(0);
        sldrTemperatura.setMaximum(20);
        sldrTemperatura.setValue(0);
        
        sldrTemperatura.setMinorTickSpacing(1);
        sldrTemperatura.setMajorTickSpacing(1);
        
        sldrTemperatura.setPaintTicks(true);
        sldrTemperatura.setPaintLabels(true);
        sldrTemperatura.setPaintTrack(true);
        
        sldrTemperatura.setSnapToTicks(false);
    }
    
      public void configurarSliderPres(){
        sldrPresion.setMinimum(0);
        sldrPresion.setMaximum(20);
        sldrPresion.setValue(0);
        
        sldrPresion.setMinorTickSpacing(1);
        sldrPresion.setMajorTickSpacing(1);
        
        sldrPresion.setPaintTicks(true);
        sldrPresion.setPaintLabels(true);
        sldrPresion.setPaintTrack(true);
        
        sldrPresion.setSnapToTicks(false);
    }
      
        public void configurarSliderProf(){
        sldrProfundidad.setMinimum(0);
        sldrProfundidad.setMaximum(20);
        sldrProfundidad.setValue(0);
        
        sldrProfundidad.setMinorTickSpacing(1);
        sldrProfundidad.setMajorTickSpacing(1);
        
        sldrProfundidad.setPaintTicks(true);
        sldrProfundidad.setPaintLabels(true);
        sldrProfundidad.setPaintTrack(true);
        
        sldrProfundidad.setSnapToTicks(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnLeer = new javax.swing.JButton();
        sldrTemperatura = new javax.swing.JSlider();
        lblSliderConfigurable = new javax.swing.JLabel();
        txtTemperatura = new javax.swing.JTextField();
        lblPresion = new javax.swing.JLabel();
        sldrPresion = new javax.swing.JSlider();
        txtPresion = new javax.swing.JTextField();
        lblProfundidad = new javax.swing.JLabel();
        sldrProfundidad = new javax.swing.JSlider();
        txtProfundidad = new javax.swing.JTextField();
        lblStatus = new javax.swing.JLabel();
        txtStatus = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Otros Elementos de Selección");

        btnLeer.setText("Leer Datos");

        sldrTemperatura.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sldrTemperaturaStateChanged(evt);
            }
        });

        lblSliderConfigurable.setText("Temperatura");

        lblPresion.setText("Presión");

        sldrPresion.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sldrPresionStateChanged(evt);
            }
        });

        lblProfundidad.setText("Profundidad");

        sldrProfundidad.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sldrProfundidadStateChanged(evt);
            }
        });

        lblStatus.setText("Status");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(1144, Short.MAX_VALUE)
                .addComponent(btnLeer)
                .addGap(12, 12, 12))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(lblPresion))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(sldrProfundidad, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 542, Short.MAX_VALUE)
                                        .addComponent(sldrPresion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(11, 11, 11)
                                        .addComponent(lblSliderConfigurable))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(16, 16, 16)
                                        .addComponent(lblProfundidad))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(sldrTemperatura, javax.swing.GroupLayout.PREFERRED_SIZE, 542, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(85, 85, 85)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTemperatura, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                            .addComponent(txtPresion)
                            .addComponent(txtProfundidad))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblStatus)
                    .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(lblSliderConfigurable)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sldrTemperatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(txtTemperatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(72, 72, 72)
                .addComponent(lblPresion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sldrPresion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPresion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(lblProfundidad)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(sldrProfundidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(txtProfundidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(45, 45, 45)
                .addComponent(lblStatus)
                .addGap(18, 18, 18)
                .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(btnLeer)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sldrTemperaturaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sldrTemperaturaStateChanged
        int t = sldrTemperatura.getValue();
        txtTemperatura.setText(""+t);
        if(t <= 10){
           txtTemperatura.setBackground(Color.green);
        } else if(t > 10 && t <= 15){
           txtTemperatura.setBackground(Color.yellow);
        } else {
            txtTemperatura.setBackground(Color.red);
        }        
        cambioEstadoNave();
    }//GEN-LAST:event_sldrTemperaturaStateChanged

    private void sldrPresionStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sldrPresionStateChanged
        int p = sldrPresion.getValue();
        txtPresion.setText(""+p);
        if(p <= 5){
           txtPresion.setBackground(Color.green);
        } else if(p > 5 && p <= 12){
           txtPresion.setBackground(Color.yellow);
        } else {
            txtPresion.setBackground(Color.red);
        }           
        cambioEstadoNave();
    }//GEN-LAST:event_sldrPresionStateChanged

    private void sldrProfundidadStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sldrProfundidadStateChanged
        int p = sldrProfundidad.getValue();
        txtProfundidad.setText(""+p);
        if(p <= 10){
           txtProfundidad.setBackground(Color.green);
        } else if(p > 10 && p <= 18){
           txtProfundidad.setBackground(Color.yellow);
        } else {
            txtProfundidad.setBackground(Color.red);
        } 
        cambioEstadoNave();
    }//GEN-LAST:event_sldrProfundidadStateChanged

    private void cambioEstadoNave(){
        
        LinkedList<Color> lst = new LinkedList();
        lst.add(txtProfundidad.getBackground());
        lst.add(txtPresion.getBackground());
        lst.add(txtTemperatura.getBackground());
        
        int r=0,v=0,a=0;
        for (Color color : lst) {
            if(color.equals(Color.red)){
                r++;
            } else if(color.equals(Color.green)){
                v++;
            } else {
                a++;
            }
        }
        
        if(v >= 2){
            txtStatus.setBackground(Color.green);
        } else if(r >= 2){
            txtStatus.setBackground(Color.red);
        } else if(a >= 2){
            txtStatus.setBackground(Color.yellow);
        } else{
            txtStatus.setBackground(Color.gray);
        }
    }
 
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
            java.util.logging.Logger.getLogger(FrmOtrosElementos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmOtrosElementos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmOtrosElementos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmOtrosElementos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmOtrosElementos().setVisible(true);
            }
        });
    }

    

    
    
    
  
    
   
    
 
    
   
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLeer;
    private javax.swing.JLabel lblPresion;
    private javax.swing.JLabel lblProfundidad;
    private javax.swing.JLabel lblSliderConfigurable;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JSlider sldrPresion;
    private javax.swing.JSlider sldrProfundidad;
    private javax.swing.JSlider sldrTemperatura;
    private javax.swing.JTextField txtPresion;
    private javax.swing.JTextField txtProfundidad;
    private javax.swing.JTextField txtStatus;
    private javax.swing.JTextField txtTemperatura;
    // End of variables declaration//GEN-END:variables
}
