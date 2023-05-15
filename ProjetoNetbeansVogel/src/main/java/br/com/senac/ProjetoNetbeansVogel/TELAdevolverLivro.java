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
public class TELAdevolverLivro extends javax.swing.JDialog {
    private biblioteca BIBLIOTECA;
    /**
     * Creates new form TELAdevolverLivro
     */
    public TELAdevolverLivro(java.awt.Frame parent, biblioteca BIBLIOTECA) {
        super(parent);
        this.BIBLIOTECA = BIBLIOTECA;
        initComponents();
    }

    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TEXTOnomeLivroDevolver = new javax.swing.JTextField();
        BOTAOconfirmarDevolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Devolver Livro");

        jLabel2.setText("Digite o Nome Do Livro");

        TEXTOnomeLivroDevolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TEXTOnomeLivroDevolverActionPerformed(evt);
            }
        });

        BOTAOconfirmarDevolver.setText("Confirmar");
        BOTAOconfirmarDevolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOTAOconfirmarDevolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(TEXTOnomeLivroDevolver, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BOTAOconfirmarDevolver)
                    .addComponent(jLabel1))
                .addContainerGap(100, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(TEXTOnomeLivroDevolver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BOTAOconfirmarDevolver)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BOTAOconfirmarDevolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOTAOconfirmarDevolverActionPerformed
        String nomeLivro = TEXTOnomeLivroDevolver.getText();
        LIVRO praDevolver = null;
                for(LIVRO livro : biblioteca.getLivrosAlugados()){
                if(livro.GetName().equals(nomeLivro)){
                praDevolver = livro;
                break;
            }
        }
                if(praDevolver != null){
                    biblioteca.getLivros().add(praDevolver);
                    biblioteca.getLivrosAlugados().remove(praDevolver);
                    JOptionPane.showMessageDialog(this, "O livro foi devolvido com sucesso chefia! :D");
                    this.dispose();
                }
    }//GEN-LAST:event_BOTAOconfirmarDevolverActionPerformed

    private void TEXTOnomeLivroDevolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TEXTOnomeLivroDevolverActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TEXTOnomeLivroDevolverActionPerformed

    public static void main(String args[]) {
     
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BOTAOconfirmarDevolver;
    private javax.swing.JTextField TEXTOnomeLivroDevolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
