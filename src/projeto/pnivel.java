package projeto;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author 20171174010010
 */
public class pnivel extends javax.swing.JFrame {

    /**
     * Creates new form pnivel
     */
    private String user;
    Questoes3 q3 = new Questoes3();

    public void user(String u) {
        user = u;
    }

    public pnivel() {
        initComponents();
        buttonGroup2.add(rA);
        buttonGroup2.add(rB);
        buttonGroup2.add(rC);
        buttonGroup2.add(rD);
        buttonGroup2.add(rE);

        
        int numeroSorteado = q3.randomizar();
        Questao q = q3.questao.get(numeroSorteado);
        enunciado3.setText(q.enunciado);
        rA.setText(q.getA());
        rB.setText(q.getB());
        rC.setText(q.getC());
        rD.setText(q.getD());
        rE.setText(q.getE());
        txtUser.setText(user);
        System.out.println(user);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        Questãolbl = new javax.swing.JLabel();
        enunciado3 = new javax.swing.JLabel();
        rA = new javax.swing.JRadioButton();
        rB = new javax.swing.JRadioButton();
        rC = new javax.swing.JRadioButton();
        rD = new javax.swing.JRadioButton();
        rE = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        qRespondida = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtUser = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 51, 153));
        jPanel1.setLayout(null);

        Questãolbl.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Questãolbl.setForeground(new java.awt.Color(255, 255, 255));
        Questãolbl.setText("Questão:");
        Questãolbl.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                QuestãolblAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jPanel1.add(Questãolbl);
        Questãolbl.setBounds(355, 25, 96, 29);

        enunciado3.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        enunciado3.setForeground(new java.awt.Color(255, 255, 255));
        enunciado3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        enunciado3.setText("ENUNCIADO3");
        jPanel1.add(enunciado3);
        enunciado3.setBounds(120, 100, 670, 166);

        rA.setBackground(new java.awt.Color(0, 51, 153));
        rA.setForeground(new java.awt.Color(255, 255, 255));
        rA.setText("A");
        rA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rAActionPerformed(evt);
            }
        });
        jPanel1.add(rA);
        rA.setBounds(220, 300, 43, 23);

        rB.setBackground(new java.awt.Color(0, 51, 153));
        rB.setForeground(new java.awt.Color(255, 255, 255));
        rB.setText("B");
        jPanel1.add(rB);
        rB.setBounds(320, 300, 43, 23);

        rC.setBackground(new java.awt.Color(0, 51, 153));
        rC.setForeground(new java.awt.Color(255, 255, 255));
        rC.setText("C");
        jPanel1.add(rC);
        rC.setBounds(420, 300, 43, 23);

        rD.setBackground(new java.awt.Color(0, 51, 153));
        rD.setForeground(new java.awt.Color(255, 255, 255));
        rD.setText("D");
        jPanel1.add(rD);
        rD.setBounds(520, 300, 43, 23);

        rE.setBackground(new java.awt.Color(0, 51, 153));
        rE.setForeground(new java.awt.Color(255, 255, 255));
        rE.setText("E");
        jPanel1.add(rE);
        rE.setBounds(620, 300, 43, 23);

        jButton1.setBackground(new java.awt.Color(51, 153, 0));
        jButton1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Confirmar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(700, 290, 120, 40);

        qRespondida.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        qRespondida.setForeground(new java.awt.Color(255, 0, 0));
        qRespondida.setText("0");
        qRespondida.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                qRespondidaAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jPanel1.add(qRespondida);
        qRespondida.setBounds(240, 460, 70, 50);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Questões respondidas:");
        jLabel1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jLabel1AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jPanel1.add(jLabel1);
        jLabel1.setBounds(24, 474, 310, 30);

        txtUser.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtUser.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtUser);
        txtUser.setBounds(624, 464, 180, 50);

        jButton2.setBackground(new java.awt.Color(255, 0, 0));
        jButton2.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jButton2.setText("Desistir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(810, 10, 70, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 890, 560);

        setSize(new java.awt.Dimension(905, 618));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void QuestãolblAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_QuestãolblAncestorAdded


    }//GEN-LAST:event_QuestãolblAncestorAdded
    int x = 0;
    ArrayList<String> enunciado = new ArrayList<>();
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if (x < q3.questao.size()) {
            int numeroSorteado = q3.randomizar();
        Questao q = q3.questao.get(numeroSorteado);
        enunciado3.setText(q.enunciado);
        rA.setText(q.getA());
        rB.setText(q.getB());
        rC.setText(q.getC());
        rD.setText(q.getD());
        rE.setText(q.getE());
            qRespondida.setText(String.valueOf(++x));
        }else{
                        JOptionPane.showMessageDialog(null, "Limite de questoes atingidas");

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void rAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rAActionPerformed

    private void jLabel1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLabel1AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel1AncestorAdded

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new Quiz().setVisible(true);      
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void qRespondidaAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_qRespondidaAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_qRespondidaAncestorAdded

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
            java.util.logging.Logger.getLogger(pnivel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pnivel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pnivel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pnivel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pnivel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Questãolbl;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel enunciado3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel qRespondida;
    private javax.swing.JRadioButton rA;
    private javax.swing.JRadioButton rB;
    private javax.swing.JRadioButton rC;
    private javax.swing.JRadioButton rD;
    private javax.swing.JRadioButton rE;
    private javax.swing.JLabel txtUser;
    // End of variables declaration//GEN-END:variables

}
