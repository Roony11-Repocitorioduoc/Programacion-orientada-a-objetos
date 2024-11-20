package vista;

import controlador.RegistroProducto;
import modelo.Producto;

public class VentanaIngresoProducto extends javax.swing.JFrame {

    /**
     * Creates new form VentanaIngresoProducto
     */
    public VentanaIngresoProducto() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnGrabarProducto = new javax.swing.JButton();
        chkDescontinuado = new javax.swing.JCheckBox();
        txtCodigo = new javax.swing.JTextField();
        txtNombreProducto = new javax.swing.JTextField();
        txtDescripcionProducto = new javax.swing.JTextField();
        txtValorUnitario = new javax.swing.JTextField();
        rdOferta = new javax.swing.JRadioButton();
        rdPrecioNormal = new javax.swing.JRadioButton();
        cmbStock = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Ingreso de Producto");

        jLabel2.setText("Código: ");

        jLabel3.setText("Nombre Producto:");

        jLabel4.setText("Descripción Producto:");

        jLabel5.setText("Valor Unitario: $");

        jLabel6.setText("Oferta:");

        jLabel7.setText("Stock:");

        btnGrabarProducto.setText("Grabar");
        btnGrabarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrabarProductoActionPerformed(evt);
            }
        });

        chkDescontinuado.setText("Descontinuado");
        chkDescontinuado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkDescontinuadoActionPerformed(evt);
            }
        });

        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdOferta);
        rdOferta.setText("Oferta");
        rdOferta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdOfertaActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdPrecioNormal);
        rdPrecioNormal.setSelected(true);
        rdPrecioNormal.setText("Precio Normal");

        cmbStock.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        cmbStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbStockActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                                .addComponent(txtNombreProducto)
                                .addComponent(txtDescripcionProducto)
                                .addComponent(txtValorUnitario))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rdOferta)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rdPrecioNormal))
                            .addComponent(cmbStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chkDescontinuado)
                            .addComponent(btnGrabarProducto))))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtDescripcionProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtValorUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(rdOferta)
                    .addComponent(rdPrecioNormal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cmbStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkDescontinuado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnGrabarProducto)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGrabarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrabarProductoActionPerformed
        Producto producto = new Producto();
        
        producto.setCodigo(this.txtCodigo.getText().trim().toUpperCase());
        producto.setNombreProducto(this.txtNombreProducto.getText().trim().toUpperCase());
        producto.setDescripcionProducto(this.txtDescripcionProducto.getText().trim().toUpperCase());
        producto.setValorUnitario(Integer.parseInt(this.txtValorUnitario.getText().trim()));
        // Radio button
        if (this.rdOferta.isSelected())
            producto.setOferta(true);
        // Combo box
        producto.setStock(Integer.parseInt(this.cmbStock.getSelectedItem().toString()));
        // Check box
        producto.setDescontinuado(this.chkDescontinuado.isSelected());
        
        if (new RegistroProducto().agregarProducto(producto))
            javax.swing.JOptionPane.showMessageDialog(this, "GRABO");
        else
            if (!(new RegistroProducto().validarCodigo(producto.getCodigo())))
                javax.swing.JOptionPane.showMessageDialog(this, "NO GRABO (Ya existe ese código)");
            else
                javax.swing.JOptionPane.showMessageDialog(this, "NO GRABO");
    }//GEN-LAST:event_btnGrabarProductoActionPerformed

    private void chkDescontinuadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkDescontinuadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkDescontinuadoActionPerformed

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoActionPerformed

    private void rdOfertaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdOfertaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdOfertaActionPerformed

    private void cmbStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbStockActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbStockActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaIngresoProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaIngresoProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaIngresoProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaIngresoProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaIngresoProducto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGrabarProducto;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox chkDescontinuado;
    private javax.swing.JComboBox<String> cmbStock;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JRadioButton rdOferta;
    private javax.swing.JRadioButton rdPrecioNormal;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDescripcionProducto;
    private javax.swing.JTextField txtNombreProducto;
    private javax.swing.JTextField txtValorUnitario;
    // End of variables declaration//GEN-END:variables
}