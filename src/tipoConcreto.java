


import java.awt.Dimension;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author paula
 */
public class tipoConcreto extends javax.swing.JFrame {
      
     Vehiculos vehiculos = new Vehiculos();
     public tipoConcreto() {
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

        jLabel1 = new javax.swing.JLabel();
        CocheMotoComboBox = new javax.swing.JComboBox<>();
        matriculacionLabel = new javax.swing.JLabel();
        KMLabel = new javax.swing.JLabel();
        matriculacionTF = new javax.swing.JTextField();
        KMTF = new javax.swing.JTextField();
        PrecioLabel = new javax.swing.JLabel();
        precioTF = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        seleccionaComboBox = new javax.swing.JComboBox<>();
        BuscarButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Tipo vehiculo:");

        CocheMotoComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Automovil", "Motocicleta" }));
        CocheMotoComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CocheMotoComboBoxActionPerformed(evt);
            }
        });

        matriculacionLabel.setText("El año de matriculacion:");

        KMLabel.setText("El kilometraje:");

        KMTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KMTFActionPerformed(evt);
            }
        });

        PrecioLabel.setText("El precio");

        precioTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precioTFActionPerformed(evt);
            }
        });

        jButton1.setText("Comprar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jLabel2.setText("Selecciona el coche deseado:");

        BuscarButton.setText("Buscar");
        BuscarButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BuscarButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(PrecioLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(KMLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(matriculacionLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(CocheMotoComboBox, 0, 100, Short.MAX_VALUE)
                                    .addComponent(matriculacionTF)
                                    .addComponent(KMTF)
                                    .addComponent(precioTF)))
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(seleccionaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(BuscarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(114, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(CocheMotoComboBox, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(matriculacionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(matriculacionTF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(KMLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(KMTF, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PrecioLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(precioTF, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(BuscarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(seleccionaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CocheMotoComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CocheMotoComboBoxActionPerformed

    }//GEN-LAST:event_CocheMotoComboBoxActionPerformed

    private void KMTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KMTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_KMTFActionPerformed

    private void precioTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precioTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_precioTFActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        Compra Compra = new Compra ();
        Compra.setVisible(true);
    }//GEN-LAST:event_jButton1MouseClicked

    private void BuscarButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BuscarButtonMouseClicked
        vehiculos.rellenarVehiculos();
        String tipo= (String) CocheMotoComboBox.getSelectedItem();
        String km =(String) KMTF.getText();
        String matricula= (String) matriculacionTF.getText();
        String precio= (String) precioTF.getText();
        
        int matrInt =Integer.parseInt(matricula);
        int precioInt =Integer.parseInt(precio);
        int n = vehiculos.getVehiculosLista().size();
        if (tipo.equals("Automovil")){
            for (int i=0; i<=n; ++i){
                int kmCoche = Integer.parseInt( vehiculos.getVehiculosLista().get(i).get(7));
                int precioCoche= Integer.parseInt(vehiculos.getVehiculosLista().get(i).get(8));
                int matriculaCoche= Integer.parseInt(vehiculos.getVehiculosLista().get(i).get(6));
                if(vehiculos.getVehiculosLista().get(i).get(0).equals(tipo)){
                    if (Integer.parseInt(km)>=kmCoche || km.equals("")){
                        if (precioInt>= precioCoche|| precio.equals("")){
                            if (matrInt >= matriculaCoche|| matricula.equals("")){
                                seleccionaComboBox.addItem(vehiculos.getVehiculosLista().get(i).get(3));   
                            }
                        }
                    }  
                }        
            }
        }
        else{
            for (int i=0; i<=n; ++i){
                int kmCoche = Integer.parseInt( vehiculos.getVehiculosLista().get(i).get(7));
                int precioCoche= Integer.parseInt(vehiculos.getVehiculosLista().get(i).get(8));
                int matriculaCoche= Integer.parseInt(vehiculos.getVehiculosLista().get(i).get(6));
                if(vehiculos.getVehiculosLista().get(i).get(0).equals(tipo)){
                   if (Integer.parseInt(km)>=kmCoche || km.equals("")){
                        if (precioInt>= precioCoche|| precio.equals("")){
                            if (matrInt >= matriculaCoche|| matricula.equals("")){
                                seleccionaComboBox.addItem(vehiculos.getVehiculosLista().get(i).get(3));   
                            }
                        }
                    }  
                }  
            }    
        }
    }//GEN-LAST:event_BuscarButtonMouseClicked

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
            java.util.logging.Logger.getLogger(tipoConcreto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tipoConcreto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tipoConcreto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tipoConcreto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tipoConcreto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BuscarButton;
    private javax.swing.JComboBox<String> CocheMotoComboBox;
    private javax.swing.JLabel KMLabel;
    private javax.swing.JTextField KMTF;
    private javax.swing.JLabel PrecioLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel matriculacionLabel;
    private javax.swing.JTextField matriculacionTF;
    private javax.swing.JTextField precioTF;
    private javax.swing.JComboBox<String> seleccionaComboBox;
    // End of variables declaration//GEN-END:variables
}
