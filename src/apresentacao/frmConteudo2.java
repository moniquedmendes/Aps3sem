/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package apresentacao;

/**
 *
 * @author powji
 */
public class frmConteudo2 extends javax.swing.JDialog {

    /**
     * Creates new form frmConteuro
     */
    public frmConteudo2(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        btnContinuar = new javax.swing.JButton();
        lblFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1525, 790));
        setResizable(false);
        getContentPane().setLayout(null);

        btnContinuar.setBackground(new java.awt.Color(74, 43, 23));
        btnContinuar.setFont(new java.awt.Font("Eras Bold ITC", 0, 24)); // NOI18N
        btnContinuar.setForeground(new java.awt.Color(164, 127, 85));
        btnContinuar.setText("Continuar");
        btnContinuar.setBorder(null);
        btnContinuar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnContinuarActionPerformed(evt);
            }
        });
        getContentPane().add(btnContinuar);
        btnContinuar.setBounds(1275, 633, 180, 70);

        lblFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Conteudo 2.png"))); // NOI18N
        lblFundo.setAlignmentY(0.0F);
        getContentPane().add(lblFundo);
        lblFundo.setBounds(0, 0, 1525, 790);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinuarActionPerformed
        // TODO add your handling code here:
        frmPergunta1 frmP1 = new frmPergunta1(null,true);
        this.setVisible(false);
        frmP1.setVisible(true);
    }//GEN-LAST:event_btnContinuarActionPerformed

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
            java.util.logging.Logger.getLogger(frmConteudo1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmConteudo1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmConteudo1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmConteudo1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                frmConteudo1 dialog = new frmConteudo1(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnContinuar;
    private javax.swing.JLabel lblFundo;
    // End of variables declaration//GEN-END:variables
}
