/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package br.com.senac.biblioteca;

import br.com.classes.ClienteLeitor;
import br.com.classes.BibliotecaClasse;


public class TELAcadastrar extends javax.swing.JDialog {
    private BibliotecaClasse biblioteClasse;
 
    public TELAcadastrar(java.awt.Frame parent, BibliotecaClasse biblioteClasse) {
        super(parent);
        this.biblioteClasse = biblioteClasse;
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        senhaTEXTOlogin = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        botaoFINALIZARcadastro = new javax.swing.JButton();
        nomeTEXTO = new javax.swing.JTextField();
        emailTEXTO = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        senhaTEXTOlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                senhaTEXTOloginActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("Email:");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("Senha:");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("Nome:");

        botaoFINALIZARcadastro.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        botaoFINALIZARcadastro.setText("Finalizar");
        botaoFINALIZARcadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoFINALIZARcadastroActionPerformed(evt);
            }
        });

        nomeTEXTO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeTEXTOActionPerformed(evt);
            }
        });

        emailTEXTO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTEXTOActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel2.setText("Cadastro/leitor");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel6)
                        .addComponent(jLabel5)
                        .addComponent(senhaTEXTOlogin)
                        .addComponent(emailTEXTO)
                        .addComponent(nomeTEXTO, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(120, 120, 120)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botaoFINALIZARcadastro)
                .addGap(16, 16, 16))
            .addGroup(layout.createSequentialGroup()
                .addGap(151, 151, 151)
                .addComponent(jLabel2)
                .addContainerGap(155, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botaoFINALIZARcadastro)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(nomeTEXTO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(emailTEXTO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(senhaTEXTOlogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoFINALIZARcadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoFINALIZARcadastroActionPerformed
        ClienteLeitor clienteLeitor = new ClienteLeitor(
        nomeTEXTO.getText(),
        senhaTEXTOlogin.getText(),
        emailTEXTO.getText()
        );
        
        this.dispose();
    
    }//GEN-LAST:event_botaoFINALIZARcadastroActionPerformed

    private void nomeTEXTOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeTEXTOActionPerformed
      
    }//GEN-LAST:event_nomeTEXTOActionPerformed

    private void emailTEXTOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailTEXTOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailTEXTOActionPerformed

    private void senhaTEXTOloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_senhaTEXTOloginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_senhaTEXTOloginActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoFINALIZARcadastro;
    private javax.swing.JTextField emailTEXTO;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField nomeTEXTO;
    private javax.swing.JPasswordField senhaTEXTOlogin;
    // End of variables declaration//GEN-END:variables
}
