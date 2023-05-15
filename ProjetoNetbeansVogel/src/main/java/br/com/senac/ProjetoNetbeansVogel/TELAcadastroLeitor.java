/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package br.com.senac.ProjetoNetbeansVogel;

import javax.swing.JOptionPane;

/**
 *
 * @author abner
 */
public class TELAcadastroLeitor extends javax.swing.JDialog {
    private biblioteca BIBLIOTECA;
   
    public TELAcadastroLeitor(java.awt.Frame parent) {
        super(parent);
        
        
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TEXTOemail = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TEXTOnome = new javax.swing.JTextField();
        BOTAOconfirmarLeitor = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Cadastro Leitor");

        jLabel2.setText("Nome Completo");

        TEXTOemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TEXTOemailActionPerformed(evt);
            }
        });

        jLabel3.setText("Email");

        TEXTOnome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TEXTOnomeActionPerformed(evt);
            }
        });

        BOTAOconfirmarLeitor.setText("Cadastrar");
        BOTAOconfirmarLeitor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOTAOconfirmarLeitorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(TEXTOnome, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(TEXTOemail, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112, Short.MAX_VALUE)
                                .addComponent(BOTAOconfirmarLeitor)))))
                .addGap(50, 50, 50))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(TEXTOnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TEXTOemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BOTAOconfirmarLeitor))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TEXTOnomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TEXTOnomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TEXTOnomeActionPerformed

    private void TEXTOemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TEXTOemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TEXTOemailActionPerformed

    private void BOTAOconfirmarLeitorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOTAOconfirmarLeitorActionPerformed
        String nomeLeitor = TEXTOnome.getText();
        String Email = TEXTOemail.getText();
        boolean Leitor_já_Existe = false;
        
        for(LEITOR leitor : biblioteca.getLeitores()){
            if(leitor.getNome().equals(nomeLeitor)){
                Leitor_já_Existe = true;
            }
        }
        
        if((!Leitor_já_Existe) && (!nomeLeitor.isEmpty()) && (!Email.isEmpty())){
            LEITOR leitor = new LEITOR(
            nomeLeitor,
            Email
            );
            biblioteca.addLeitor(leitor);
            JOptionPane.showMessageDialog(this, "O Leitor Foi Cadastrado com Sucesso :D !");
            this.dispose();
        }
         else if((!Leitor_já_Existe) && (nomeLeitor.isEmpty())){
            JOptionPane.showMessageDialog(this, "Ta faltando TUDo parça");
        }
         
        else if(Leitor_já_Existe){
            JOptionPane.showMessageDialog(this, "Este leitor já existe Parça");
        } 
        
        else if((!Leitor_já_Existe) && (nomeLeitor.isEmpty())){
            JOptionPane.showMessageDialog(this, "Ta faltando o NOME parça.");
        }
        
    }//GEN-LAST:event_BOTAOconfirmarLeitorActionPerformed

    
    public static void main(String args[]) {
     
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BOTAOconfirmarLeitor;
    private javax.swing.JTextField TEXTOemail;
    private javax.swing.JTextField TEXTOnome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
