/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.senac.biblioteca;

import br.com.classes.BibliotecaClasse;

public class MENUprincipal extends javax.swing.JFrame {
private  final BibliotecaClasse biblioteClasse = new BibliotecaClasse();
    /**
     * Creates new form menuPRINCIPAL
     */
    public MENUprincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botaoVENDAS = new javax.swing.JButton();
        botaoVENDER = new javax.swing.JButton();
        botaoCADASTRO = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        botaoEmprestimo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        botaoVENDAS.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        botaoVENDAS.setText("Vendas");
        botaoVENDAS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVENDASActionPerformed(evt);
            }
        });

        botaoVENDER.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        botaoVENDER.setText("Devolver");
        botaoVENDER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVENDERActionPerformed(evt);
            }
        });

        botaoCADASTRO.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        botaoCADASTRO.setText("cadastro");
        botaoCADASTRO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCADASTROActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setText("The Biblioteca");

        botaoEmprestimo.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        botaoEmprestimo.setText("Emprestimo");
        botaoEmprestimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEmprestimoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(botaoEmprestimo, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                            .addComponent(botaoVENDAS, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                            .addComponent(botaoVENDER, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botaoCADASTRO, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(jLabel1)))
                .addGap(0, 98, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addGap(43, 43, 43)
                .addComponent(botaoEmprestimo)
                .addGap(18, 18, 18)
                .addComponent(botaoVENDER)
                .addGap(18, 18, 18)
                .addComponent(botaoVENDAS)
                .addGap(18, 18, 18)
                .addComponent(botaoCADASTRO)
                .addContainerGap(115, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoEmprestimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEmprestimoActionPerformed
    TELAalugar telaAlugar = new TELAalugar(this, true);
     telaAlugar.setVisible(true);       
    }//GEN-LAST:event_botaoEmprestimoActionPerformed

    private void botaoCADASTROActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCADASTROActionPerformed
     TELAcadastrar telaDeCadastro = new TELAcadastrar(this, this.biblioteClasse);
     telaDeCadastro.setVisible(true);
    }//GEN-LAST:event_botaoCADASTROActionPerformed

    private void botaoVENDASActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVENDASActionPerformed
    TELAvendas telaDeVendas = new TELAvendas(this, true);
     telaDeVendas.setVisible(true);       // TODO add your handling code here:
    }//GEN-LAST:event_botaoVENDASActionPerformed

    private void botaoVENDERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVENDERActionPerformed
    TELAdevolver telaDeDevolver = new TELAdevolver(this, true);
     telaDeDevolver.setVisible(true);       // TODO add your handling code here:
    }//GEN-LAST:event_botaoVENDERActionPerformed


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
            java.util.logging.Logger.getLogger(MENUprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MENUprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MENUprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MENUprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MENUprincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCADASTRO;
    private javax.swing.JButton botaoEmprestimo;
    private javax.swing.JButton botaoVENDAS;
    private javax.swing.JButton botaoVENDER;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
