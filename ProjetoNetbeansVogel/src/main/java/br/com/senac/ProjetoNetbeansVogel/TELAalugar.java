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
public class TELAalugar extends javax.swing.JDialog {
    private biblioteca BIBLIOTECA;
    /**
     * Creates new form TELAalugar
     */
    public TELAalugar(java.awt.Frame parent, biblioteca BIBLIOTECA) {
        super(parent);
        this.BIBLIOTECA = BIBLIOTECA;
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TEXTOnomeLivroAlugar = new javax.swing.JTextField();
        BOTAOconfirmarAlugar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Alugar Livro");

        jLabel2.setText("Digite o Nome Do Livro");

        TEXTOnomeLivroAlugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TEXTOnomeLivroAlugarActionPerformed(evt);
            }
        });

        BOTAOconfirmarAlugar.setText("Confirmar");
        BOTAOconfirmarAlugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOTAOconfirmarAlugarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(TEXTOnomeLivroAlugar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BOTAOconfirmarAlugar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jLabel1)))
                .addContainerGap(88, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(TEXTOnomeLivroAlugar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BOTAOconfirmarAlugar)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BOTAOconfirmarAlugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOTAOconfirmarAlugarActionPerformed
       String NomeLivro = TEXTOnomeLivroAlugar.getText();
       LIVRO PraAlugar = null;
               for (LIVRO livro : biblioteca.getLivros()){
               if(livro.GetName().equals(NomeLivro)){
               PraAlugar = livro;
               break;
           }
       }
               if(PraAlugar != null){
                   biblioteca.getLivrosAlugados().add(PraAlugar);
                   biblioteca.getLivros().remove(PraAlugar);
                    JOptionPane.showMessageDialog(this, "O livro foi alugado com sucesso! :D ");
                    this.dispose();
               }
    }//GEN-LAST:event_BOTAOconfirmarAlugarActionPerformed

    private void TEXTOnomeLivroAlugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TEXTOnomeLivroAlugarActionPerformed
       
    }//GEN-LAST:event_TEXTOnomeLivroAlugarActionPerformed

    
    public static void main(String args[]) {
     
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BOTAOconfirmarAlugar;
    private javax.swing.JTextField TEXTOnomeLivroAlugar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
