package uam.pvoe.emergene.forma;

import javax.swing.JOptionPane;

public class FrmBase extends javax.swing.JFrame {

    public FrmBase() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAviso = new javax.swing.JButton();
        btnConfirmación = new javax.swing.JButton();
        btnCapturaUnDato = new javax.swing.JButton();
        btnComboBox = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnAviso.setText("Aviso Básico");
        btnAviso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvisoActionPerformed(evt);
            }
        });

        btnConfirmación.setText("Confirmación");
        btnConfirmación.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmaciónActionPerformed(evt);
            }
        });

        btnCapturaUnDato.setText("Captura de un Dato");
        btnCapturaUnDato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapturaUnDatoActionPerformed(evt);
            }
        });

        btnComboBox.setText("Combo Box");
        btnComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComboBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAviso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnConfirmación, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCapturaUnDato, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnComboBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(468, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(btnAviso)
                .addGap(48, 48, 48)
                .addComponent(btnConfirmación)
                .addGap(58, 58, 58)
                .addComponent(btnCapturaUnDato)
                .addGap(55, 55, 55)
                .addComponent(btnComboBox)
                .addContainerGap(123, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCapturaUnDatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapturaUnDatoActionPerformed
        String entrada;
        // entrada = JOptionPane.showInputDialog(this, "Escribe algo aqui: ");
        entrada = JOptionPane.showInputDialog(this,
                                            "Nombre",
                                            "Escribe tu nombre o lo que quieras aqui",
                                            JOptionPane.QUESTION_MESSAGE);
        System.out.println(entrada);
    }//GEN-LAST:event_btnCapturaUnDatoActionPerformed

    private void btnAvisoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvisoActionPerformed
        // JOptionPane.showMessageDialog(this, "Aviso, este es un mensaje");
        JOptionPane.showMessageDialog(this,
                                            "Aviso, este es un mensaje más complejo", 
                                            "Mensaje importante", 
                                            JOptionPane.INFORMATION_MESSAGE, 
                                            null);
    }//GEN-LAST:event_btnAvisoActionPerformed

    private void btnConfirmaciónActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmaciónActionPerformed
        int option;
        // option = JOptionPane.showConfirmDialog(this, "Estas seguro de que quieres continuar...?");

        /*option = JOptionPane.showConfirmDialog(this, 
                                            "Esta seguro de que quires continuar...? ", 
                                            "Mensaje de confirmacion", 
                                            JOptionPane.YES_NO_OPTION, 
                                            JOptionPane.WARNING_MESSAGE, 
                                            null);*/
        
        String [] opciones = {"Bueno va","Me da miedo"};
        option = JOptionPane.showOptionDialog(this, 
                                            "Esta seguro de que quires continuar...? ", 
                                            "Mensaje de confirmacion", 
                                            0, 
                                            JOptionPane.WARNING_MESSAGE, 
                                            null,
                                            opciones,
                                            opciones[0]);       
                
        System.out.println("opcion : " + option);
    }//GEN-LAST:event_btnConfirmaciónActionPerformed

    private void btnComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComboBoxActionPerformed
        String [] SeleccionesCMB = {"Opcion1","Opcion2","Opcion3"};
        String seleccion = (String)JOptionPane.showInputDialog(this,
                                                        "Escoge una opcion: ", 
                                                        "Titulo chido",
                                                        JOptionPane.QUESTION_MESSAGE, 
                                                        null,
                                                        SeleccionesCMB,
                                                        SeleccionesCMB[0]);
        System.out.println("Opcion : " + seleccion);
    }//GEN-LAST:event_btnComboBoxActionPerformed

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
            java.util.logging.Logger.getLogger(FrmBase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmBase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmBase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmBase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmBase().setVisible(true);
            }
        });
    }
    
    
    
    
    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAviso;
    private javax.swing.JButton btnCapturaUnDato;
    private javax.swing.JButton btnComboBox;
    private javax.swing.JButton btnConfirmación;
    // End of variables declaration//GEN-END:variables
}
