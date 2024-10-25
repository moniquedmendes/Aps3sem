/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package apresentacao;

import java.util.ArrayList;
import java.util.List;
import modelo.*;

import javax.swing.JOptionPane;
import modelo.Controle;

/**
 *
 * @author User
 */
public class frmPergunta1 extends javax.swing.JDialog
{

    /**
     * Creates new form frmPergunta1
     */
    public frmPergunta1(java.awt.Frame parent, boolean modal)
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
    private void initComponents()
    {

        gbtVF = new javax.swing.ButtonGroup();
        lblTitulo = new javax.swing.JLabel();
        rbdVerdadeiro = new javax.swing.JRadioButton();
        rbdFalso = new javax.swing.JRadioButton();
        btnProximo = new javax.swing.JButton();
        lblPergunta1 = new javax.swing.JLabel();
        lblPergunta2 = new javax.swing.JLabel();
        lblFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1525, 790));
        setPreferredSize(new java.awt.Dimension(1525, 790));
        setResizable(false);
        getContentPane().setLayout(null);

        lblTitulo.setBackground(new java.awt.Color(74, 43, 23));
        lblTitulo.setFont(new java.awt.Font("Eras Bold ITC", 0, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(164, 127, 85));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Vamos começar o questionario!");
        lblTitulo.setToolTipText("");
        getContentPane().add(lblTitulo);
        lblTitulo.setBounds(520, 150, 506, 28);

        rbdVerdadeiro.setBackground(new java.awt.Color(74, 43, 23));
        gbtVF.add(rbdVerdadeiro);
        rbdVerdadeiro.setFont(new java.awt.Font("Eras Bold ITC", 0, 18)); // NOI18N
        rbdVerdadeiro.setForeground(new java.awt.Color(164, 127, 85));
        rbdVerdadeiro.setText("Verdadeiro");
        rbdVerdadeiro.setFocusPainted(false);
        getContentPane().add(rbdVerdadeiro);
        rbdVerdadeiro.setBounds(520, 340, 140, 30);

        rbdFalso.setBackground(new java.awt.Color(74, 43, 23));
        gbtVF.add(rbdFalso);
        rbdFalso.setFont(new java.awt.Font("Eras Bold ITC", 0, 18)); // NOI18N
        rbdFalso.setForeground(new java.awt.Color(164, 127, 85));
        rbdFalso.setText("Falso");
        rbdFalso.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                rbdFalsoActionPerformed(evt);
            }
        });
        getContentPane().add(rbdFalso);
        rbdFalso.setBounds(840, 340, 100, 30);

        btnProximo.setBackground(new java.awt.Color(74, 43, 23));
        btnProximo.setFont(new java.awt.Font("Eras Bold ITC", 0, 18)); // NOI18N
        btnProximo.setForeground(new java.awt.Color(164, 127, 85));
        btnProximo.setText("Continuar");
        btnProximo.setBorder(null);
        btnProximo.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnProximoActionPerformed(evt);
            }
        });
        getContentPane().add(btnProximo);
        btnProximo.setBounds(1310, 640, 160, 70);

        lblPergunta1.setBackground(new java.awt.Color(74, 43, 23));
        lblPergunta1.setFont(new java.awt.Font("Eras Bold ITC", 0, 18)); // NOI18N
        lblPergunta1.setForeground(new java.awt.Color(196, 168, 136));
        lblPergunta1.setText("A missão de exploração mais longa realizada por uma sonda veicular durou 6 anos. ");
        lblPergunta1.setPreferredSize(new java.awt.Dimension(1105, 21));
        getContentPane().add(lblPergunta1);
        lblPergunta1.setBounds(390, 260, 780, 50);

        lblPergunta2.setBackground(new java.awt.Color(74, 43, 23));
        lblPergunta2.setFont(new java.awt.Font("Eras Bold ITC", 0, 18)); // NOI18N
        lblPergunta2.setForeground(new java.awt.Color(196, 168, 136));
        lblPergunta2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPergunta2.setText("Pergunta 1: A afirmação a seguir é verdadeira ou falsa? ");
        lblPergunta2.setPreferredSize(new java.awt.Dimension(1105, 21));
        getContentPane().add(lblPergunta2);
        lblPergunta2.setBounds(390, 220, 770, 50);

        lblFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/FundoGeral.jpg"))); // NOI18N
        lblFundo.setAlignmentY(0.0F);
        lblFundo.setFocusable(false);
        getContentPane().add(lblFundo);
        lblFundo.setBounds(0, 0, 1525, 790);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnProximoActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnProximoActionPerformed
    {//GEN-HEADEREND:event_btnProximoActionPerformed
        Estaticos.SOMAACERTOS = 0;

        
        if(rbdVerdadeiro.isSelected()){
            Estaticos.RESP1 = "acerto";
            Estaticos.SOMAACERTOS++; 
        }
        else
        {
            Estaticos.RESP1 = "erro";
        }
        
        frmPergunta2 frmP2 = new frmPergunta2(null, true);
        this.setVisible(false);
        frmP2.setVisible(true);        


    }//GEN-LAST:event_btnProximoActionPerformed

    private void rbdFalsoActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_rbdFalsoActionPerformed
    {//GEN-HEADEREND:event_rbdFalsoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbdFalsoActionPerformed
   
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
            java.util.logging.Logger.getLogger(frmPergunta1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(frmPergunta1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(frmPergunta1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(frmPergunta1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                frmPergunta1 dialog = new frmPergunta1(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnProximo;
    private javax.swing.ButtonGroup gbtVF;
    private javax.swing.JLabel lblFundo;
    private javax.swing.JLabel lblPergunta1;
    private javax.swing.JLabel lblPergunta2;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JRadioButton rbdFalso;
    private javax.swing.JRadioButton rbdVerdadeiro;
    // End of variables declaration//GEN-END:variables
}
