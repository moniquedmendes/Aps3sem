/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package apresentacao;


import javax.swing.JOptionPane;
import modelo.*;

/**
 *
 * @author User
 */
public class frmPesquisaSatisfacao extends javax.swing.JDialog
{
    String satisfacao;
    String acertos;
    
    /**
     * Creates new form frmPergunta2
     */
    public frmPesquisaSatisfacao(java.awt.Frame parent, boolean modal)
    {
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
    private void initComponents() {

        gbtPesquisa = new javax.swing.ButtonGroup();
        btnRuim = new javax.swing.JButton();
        btnNeutro = new javax.swing.JButton();
        btnBom = new javax.swing.JButton();
        lblPergunta5 = new javax.swing.JLabel();
        rdbBom = new javax.swing.JRadioButton();
        rdbNeutro = new javax.swing.JRadioButton();
        rdbRuim = new javax.swing.JRadioButton();
        lblTotalRespo = new javax.swing.JLabel();
        lblResposta = new javax.swing.JLabel();
        btnContinuar = new javax.swing.JButton();
        lblFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1525, 790));
        setResizable(false);
        getContentPane().setLayout(null);

        btnRuim.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ruim.jpg"))); // NOI18N
        btnRuim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRuimActionPerformed(evt);
            }
        });
        getContentPane().add(btnRuim);
        btnRuim.setBounds(440, 330, 170, 140);

        btnNeutro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/neutro.jpg"))); // NOI18N
        btnNeutro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNeutroActionPerformed(evt);
            }
        });
        getContentPane().add(btnNeutro);
        btnNeutro.setBounds(650, 330, 170, 140);

        btnBom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bom.jpg"))); // NOI18N
        btnBom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBomActionPerformed(evt);
            }
        });
        getContentPane().add(btnBom);
        btnBom.setBounds(850, 330, 170, 140);

        lblPergunta5.setBackground(new java.awt.Color(74, 43, 23));
        lblPergunta5.setFont(new java.awt.Font("Eras Bold ITC", 0, 36)); // NOI18N
        lblPergunta5.setForeground(new java.awt.Color(164, 127, 85));
        lblPergunta5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPergunta5.setText("Como você avaliaria sua experiência ? ");
        getContentPane().add(lblPergunta5);
        lblPergunta5.setBounds(380, 200, 710, 60);

        gbtPesquisa.add(rdbBom);
        getContentPane().add(rdbBom);
        rdbBom.setBounds(930, 480, 19, 20);

        gbtPesquisa.add(rdbNeutro);
        rdbNeutro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbNeutroActionPerformed(evt);
            }
        });
        getContentPane().add(rdbNeutro);
        rdbNeutro.setBounds(720, 480, 19, 20);

        gbtPesquisa.add(rdbRuim);
        getContentPane().add(rdbRuim);
        rdbRuim.setBounds(518, 480, 30, 20);

        lblTotalRespo.setBackground(new java.awt.Color(74, 43, 23));
        lblTotalRespo.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblTotalRespo.setForeground(new java.awt.Color(164, 127, 85));
        getContentPane().add(lblTotalRespo);
        lblTotalRespo.setBounds(189, 692, 203, 0);

        lblResposta.setBackground(new java.awt.Color(74, 43, 23));
        lblResposta.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblResposta.setForeground(new java.awt.Color(164, 127, 85));
        getContentPane().add(lblResposta);
        lblResposta.setBounds(35, 588, 107, 0);

        btnContinuar.setBackground(new java.awt.Color(74, 43, 23));
        btnContinuar.setFont(new java.awt.Font("Eras Bold ITC", 0, 18)); // NOI18N
        btnContinuar.setForeground(new java.awt.Color(164, 127, 85));
        btnContinuar.setText("Continuar");
        btnContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinuarActionPerformed(evt);
            }
        });
        getContentPane().add(btnContinuar);
        btnContinuar.setBounds(1240, 670, 150, 60);

        lblFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/FundoGeral.jpg"))); // NOI18N
        lblFundo.setAlignmentY(0.0F);
        getContentPane().add(lblFundo);
        lblFundo.setBounds(0, 0, 1525, 790);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnContinuarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnContinuarActionPerformed
    {//GEN-HEADEREND:event_btnContinuarActionPerformed

  
        if(rdbBom.isSelected())
        {
            satisfacao = "bom";
            Estaticos.TOTALVISITANTES++;

            int somaAcertos = Estaticos.SOMAACERTOS;
            acertos = Integer.toString(somaAcertos);


            Controle controle = new Controle(Estaticos.NOME, Estaticos.RESP1, Estaticos.RESP2, Estaticos.RESP3, Estaticos.RESP4, Estaticos.RESP5, acertos, satisfacao);


            frmFinal frmF = new frmFinal(null, true);
            this.setVisible(false);
            frmF.setVisible(true);            
        }
        
        
        if(rdbNeutro.isSelected())
        {
            satisfacao = "neutro";
            Estaticos.TOTALVISITANTES++;

            int somaAcertos = Estaticos.SOMAACERTOS;
            acertos = Integer.toString(somaAcertos);


            Controle controle = new Controle(Estaticos.NOME, Estaticos.RESP1, Estaticos.RESP2, Estaticos.RESP3, Estaticos.RESP4, Estaticos.RESP5, acertos, satisfacao);


            frmFinal frmF = new frmFinal(null, true);
            this.setVisible(false);
            frmF.setVisible(true);            
        }
        if(rdbRuim.isSelected())
        {
            satisfacao = "ruim";
            Estaticos.TOTALVISITANTES++;

            int somaAcertos = Estaticos.SOMAACERTOS;
            acertos = Integer.toString(somaAcertos);


            Controle controle = new Controle(Estaticos.NOME, Estaticos.RESP1, Estaticos.RESP2, Estaticos.RESP3, Estaticos.RESP4, Estaticos.RESP5, acertos, satisfacao);


            frmFinal frmF = new frmFinal(null, true);
            this.setVisible(false);
            frmF.setVisible(true);
        }
        else
        {
           JOptionPane.showMessageDialog(null, "Escolha uma das opções");
        
        }
        
    }//GEN-LAST:event_btnContinuarActionPerformed

    private void rdbNeutroActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_rdbNeutroActionPerformed
    {//GEN-HEADEREND:event_rdbNeutroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdbNeutroActionPerformed

    private void btnRuimActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnRuimActionPerformed
    {//GEN-HEADEREND:event_btnRuimActionPerformed
         rdbRuim.setSelected(true);
    }//GEN-LAST:event_btnRuimActionPerformed

    private void btnNeutroActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnNeutroActionPerformed
    {//GEN-HEADEREND:event_btnNeutroActionPerformed
        rdbNeutro.setSelected(true);
    }//GEN-LAST:event_btnNeutroActionPerformed

    private void btnBomActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnBomActionPerformed
    {//GEN-HEADEREND:event_btnBomActionPerformed
        rdbBom.setSelected(true);
    }//GEN-LAST:event_btnBomActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        }
        catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(frmPergunta2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(frmPergunta2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(frmPergunta2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(frmPergunta2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                frmPergunta2 dialog = new frmPergunta2(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter()
                {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e)
                    {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBom;
    private javax.swing.JButton btnContinuar;
    private javax.swing.JButton btnNeutro;
    private javax.swing.JButton btnRuim;
    private javax.swing.ButtonGroup gbtPesquisa;
    private javax.swing.JLabel lblFundo;
    private javax.swing.JLabel lblPergunta5;
    private javax.swing.JLabel lblResposta;
    private javax.swing.JLabel lblTotalRespo;
    private javax.swing.JRadioButton rdbBom;
    private javax.swing.JRadioButton rdbNeutro;
    private javax.swing.JRadioButton rdbRuim;
    // End of variables declaration//GEN-END:variables
}
