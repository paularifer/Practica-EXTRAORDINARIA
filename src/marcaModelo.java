
import javax.swing.JComboBox;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author paula
 */
public class marcaModelo extends javax.swing.JFrame {
    
    
    
    
     
    /**
     * Creates new form marcaModelo
     */
    public marcaModelo() {
       
        initComponents();
        
    }

    public JComboBox<String> getModeloComboBox() {
        return modeloComboBox;
    }

    public void setModeloComboBox(JComboBox<String> modeloComboBox) {
        this.modeloComboBox = modeloComboBox;
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MarcaLabel = new javax.swing.JLabel();
        MarcaComboBox = new javax.swing.JComboBox<>();
        ModeloLabel = new javax.swing.JLabel();
        ComprarButton = new javax.swing.JButton();
        modeloComboBox = new javax.swing.JComboBox<>();
        visualizarVehiculoButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MarcaLabel.setText("Marca:");

        MarcaComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Honda", "Fiat", "Toyota", "KIA", "BMW" }));
        MarcaComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MarcaComboBoxActionPerformed(evt);
            }
        });

        ModeloLabel.setText("Modelo:");

        ComprarButton.setText("Comprar");
        ComprarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComprarButtonActionPerformed(evt);
            }
        });

        modeloComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                modeloComboBoxItemStateChanged(evt);
            }
        });
        modeloComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modeloComboBoxActionPerformed(evt);
            }
        });

        visualizarVehiculoButton.setText("Visualizar vehiculo");
        visualizarVehiculoButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                visualizarVehiculoButtonMouseClicked(evt);
            }
        });
        visualizarVehiculoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                visualizarVehiculoButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(MarcaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(MarcaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ComprarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47)
                                .addComponent(visualizarVehiculoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ModeloLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(modeloComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 37, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MarcaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MarcaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ModeloLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modeloComboBox))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(visualizarVehiculoButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ComprarButton, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    private void MarcaComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MarcaComboBoxActionPerformed
       String marca= (String) MarcaComboBox.getSelectedItem();
       switch(marca){
           default:  //Honda por defecto
               modeloComboBox.addItem("Super sport");
               modeloComboBox.addItem("Sport touring");
               ComprarButton.setEnabled(true);
         
               break;
           case "BMW":
              modeloComboBox.removeAllItems();
               modeloComboBox.addItem("HP4 Race");
               modeloComboBox.addItem("S 100 RR");
               ComprarButton.setEnabled(true);
               break;
           case "KIA":
               modeloComboBox.removeAllItems();
               modeloComboBox.addItem("Picanto");
               modeloComboBox.addItem("Rio");
               ComprarButton.setEnabled(true);
               break;
           case "Fiat":
               modeloComboBox.removeAllItems();
               modeloComboBox.addItem("500");
               modeloComboBox.addItem("500 C");
               ComprarButton.setEnabled(true);
               break;
           case "Toyota":
               modeloComboBox.removeAllItems();
               modeloComboBox.addItem("Land cruiser");
               modeloComboBox.addItem("RAV 4");
               ComprarButton.setEnabled(true);
               break;
               
               
       
       
               
               
           
       }
    }//GEN-LAST:event_MarcaComboBoxActionPerformed

    private void modeloComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modeloComboBoxActionPerformed
      
        
      
    }//GEN-LAST:event_modeloComboBoxActionPerformed

    private void ComprarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComprarButtonActionPerformed
        ComprarButton.setEnabled(true);
        Compra Compra = new Compra ();
        Compra.setVisible(true);
        
    }//GEN-LAST:event_ComprarButtonActionPerformed

    private void visualizarVehiculoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_visualizarVehiculoButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_visualizarVehiculoButtonActionPerformed

    private void visualizarVehiculoButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_visualizarVehiculoButtonMouseClicked
      
        
        visualizarVehiculos visualizarVehiculos = new visualizarVehiculos ();
        visualizarVehiculos.txt = modeloComboBox.getSelectedItem().toString();
       visualizarVehiculos.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_visualizarVehiculoButtonMouseClicked

    private void modeloComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_modeloComboBoxItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_modeloComboBoxItemStateChanged
   
    
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
            java.util.logging.Logger.getLogger(marcaModelo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(marcaModelo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(marcaModelo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(marcaModelo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new marcaModelo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ComprarButton;
    private javax.swing.JComboBox<String> MarcaComboBox;
    private javax.swing.JLabel MarcaLabel;
    private javax.swing.JLabel ModeloLabel;
    private javax.swing.JComboBox<String> modeloComboBox;
    private javax.swing.JButton visualizarVehiculoButton;
    // End of variables declaration//GEN-END:variables
}
