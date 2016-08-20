/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorio14;

import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class principal extends javax.swing.JFrame {

    /**
     * Creates new form principal
     */
    public principal() {
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

        jPanel1 = new javax.swing.JPanel();
        cmdborrar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cmdcalcular = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtvalor1 = new javax.swing.JTextField();
        txtresultado = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        cmdborrar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("VALOR HOTEL ");
        cmdborrar.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 160, 30));

        cmdcalcular.setText("CALCULAR");
        cmdcalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdcalcularActionPerformed(evt);
            }
        });
        cmdborrar.add(cmdcalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 110, 40));
        cmdcalcular.getAccessibleContext().setAccessibleName("cmdcalcular");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("INGRESE EL NUMERO DE DIAS EN EL HOTEL: ");
        cmdborrar.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 64, 240, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("SU MONTO A PAGAR ES DE: ");
        cmdborrar.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 180, 30));

        txtvalor1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtvalor1ActionPerformed(evt);
            }
        });
        txtvalor1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtvalor1KeyTyped(evt);
            }
        });
        cmdborrar.add(txtvalor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, 150, 30));

        txtresultado.setEditable(false);
        cmdborrar.add(txtresultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, 170, 30));

        jButton1.setText("BORRAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        cmdborrar.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 240, 100, 40));

        getContentPane().add(cmdborrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtvalor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtvalor1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtvalor1ActionPerformed

    private void cmdcalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdcalcularActionPerformed
        double valor1, op;

        if (txtvalor1.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor ingrese los dias de su estadia en el hotel", "Error", JOptionPane.ERROR_MESSAGE);
            txtvalor1.requestFocusInWindow();
            txtvalor1.selectAll();
        } else {

            valor1 = Double.parseDouble(txtvalor1.getText());

            if (valor1 == 0) {
                JOptionPane.showMessageDialog(this, "Ingrese un numero diferente de 0", "Error", JOptionPane.ERROR_MESSAGE);
                txtvalor1.requestFocusInWindow();
                txtvalor1.selectAll();
            } else {

                op = (valor1 - 1) * 200000 + 100000;

                txtresultado.setText(String.valueOf(op));
            }

        }
    }//GEN-LAST:event_cmdcalcularActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        txtvalor1.setText("");
        txtresultado.setText("");

        txtvalor1.requestFocusInWindow();


    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtvalor1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtvalor1KeyTyped
        char c = evt.getKeyChar();
        if(!Character.isDigit(c)){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtvalor1KeyTyped

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
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel cmdborrar;
    private javax.swing.JButton cmdcalcular;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtresultado;
    private javax.swing.JTextField txtvalor1;
    // End of variables declaration//GEN-END:variables
}
