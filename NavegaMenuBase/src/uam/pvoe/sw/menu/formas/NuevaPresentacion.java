package uam.pvoe.sw.menu.formas;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Equipo de trabajo
 */
public class NuevaPresentacion extends javax.swing.JInternalFrame {

    /**
     * Creates new form NuevaPresentacion
     */
    public NuevaPresentacion() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblBienvenido = new javax.swing.JLabel();
        separador = new javax.swing.JSeparator();
        lblFecha = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        pnlContenedor = new javax.swing.JPanel();
        lblTituloPresentacion = new javax.swing.JLabel();
        txtTituloPresentacion = new javax.swing.JTextField();
        lblCongreso = new javax.swing.JLabel();
        cmbCongreso = new javax.swing.JComboBox();
        lblEstadoPresentacion = new javax.swing.JLabel();
        rbtnPresentado = new javax.swing.JRadioButton();
        rBtnAceptado = new javax.swing.JRadioButton();
        rBtonProceso = new javax.swing.JRadioButton();
        lblFechaPresentacion = new javax.swing.JLabel();
        txtDia = new javax.swing.JTextField();
        txtMes = new javax.swing.JTextField();
        txtAnnio = new javax.swing.JTextField();
        lblProyecto = new javax.swing.JLabel();
        cmbProyecto = new javax.swing.JComboBox();
        btnRegistrar = new javax.swing.JButton();

        setTitle("NuevaPresentacion");
        setMaximumSize(new java.awt.Dimension(800, 600));
        setMinimumSize(new java.awt.Dimension(800, 600));

        lblBienvenido.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblBienvenido.setText("Bienvenido ");

        lblFecha.setText("fecha");

        lblTitulo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTitulo.setText("Agregar Presentación en Congreso");

        pnlContenedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos"));

        lblTituloPresentacion.setText("Título");

        lblCongreso.setText("Congreso");

        cmbCongreso.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblEstadoPresentacion.setText("Estado");

        rbtnPresentado.setText("Presentado");

        rBtnAceptado.setText("Aceptado");

        rBtonProceso.setText("En Proceso");

        lblFechaPresentacion.setText("Fecha de Presentación");

        lblProyecto.setText("Proyecto Asociado");

        cmbProyecto.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnRegistrar.setText("Registrar Presentación");

        javax.swing.GroupLayout pnlContenedorLayout = new javax.swing.GroupLayout(pnlContenedor);
        pnlContenedor.setLayout(pnlContenedorLayout);
        pnlContenedorLayout.setHorizontalGroup(
            pnlContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContenedorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblTituloPresentacion)
                    .addComponent(txtTituloPresentacion)
                    .addComponent(lblCongreso)
                    .addComponent(cmbCongreso, 0, 714, Short.MAX_VALUE)
                    .addComponent(lblEstadoPresentacion)
                    .addGroup(pnlContenedorLayout.createSequentialGroup()
                        .addComponent(rbtnPresentado)
                        .addGap(63, 63, 63)
                        .addComponent(rBtnAceptado)
                        .addGap(60, 60, 60)
                        .addComponent(rBtonProceso))
                    .addGroup(pnlContenedorLayout.createSequentialGroup()
                        .addGroup(pnlContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlContenedorLayout.createSequentialGroup()
                                .addComponent(txtDia, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtMes))
                            .addComponent(lblFechaPresentacion, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(18, 18, 18)
                        .addComponent(txtAnnio, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblProyecto)
                    .addComponent(cmbProyecto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlContenedorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRegistrar)
                .addContainerGap())
        );
        pnlContenedorLayout.setVerticalGroup(
            pnlContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContenedorLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lblTituloPresentacion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtTituloPresentacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblCongreso)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbCongreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(lblEstadoPresentacion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtnPresentado)
                    .addComponent(rBtnAceptado)
                    .addComponent(rBtonProceso))
                .addGap(30, 30, 30)
                .addComponent(lblFechaPresentacion)
                .addGap(18, 18, 18)
                .addGroup(pnlContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAnnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(lblProyecto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmbProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(btnRegistrar)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblBienvenido)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblFecha))
                    .addComponent(separador)
                    .addComponent(lblTitulo)
                    .addComponent(pnlContenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBienvenido)
                    .addComponent(lblFecha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separador, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlContenedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JComboBox cmbCongreso;
    private javax.swing.JComboBox cmbProyecto;
    private javax.swing.JLabel lblBienvenido;
    private javax.swing.JLabel lblCongreso;
    private javax.swing.JLabel lblEstadoPresentacion;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblFechaPresentacion;
    private javax.swing.JLabel lblProyecto;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTituloPresentacion;
    private javax.swing.JPanel pnlContenedor;
    private javax.swing.JRadioButton rBtnAceptado;
    private javax.swing.JRadioButton rBtonProceso;
    private javax.swing.JRadioButton rbtnPresentado;
    private javax.swing.JSeparator separador;
    private javax.swing.JTextField txtAnnio;
    private javax.swing.JTextField txtDia;
    private javax.swing.JTextField txtMes;
    private javax.swing.JTextField txtTituloPresentacion;
    // End of variables declaration//GEN-END:variables
}