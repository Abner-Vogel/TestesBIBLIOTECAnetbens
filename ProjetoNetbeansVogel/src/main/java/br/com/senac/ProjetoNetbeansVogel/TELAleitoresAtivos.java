/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package br.com.senac.ProjetoNetbeansVogel;
import java.awt.Graphics;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import br.com.senac.ProjetoNetbeansVogel.LIVRO;
/**
 *
 * @author abner
 */
public class TELAleitoresAtivos extends javax.swing.JDialog {
    private biblioteca BIBLIOTECA;
    /**
     * Creates new form TELAleitoresAtivos
     */
    public TELAleitoresAtivos(java.awt.Frame parent, biblioteca BIBLIOTECA) {
        super(parent);
        this.BIBLIOTECA = BIBLIOTECA;
        modeloTabela();
        initComponents();
        
    }
    
    public void modeloTabela(){
        DefaultTableModel TabelaLeitores = new DefaultTableModel();
        TabelaLeitores.addColumn("Nome");
        TabelaLeitores.addColumn("Email");
    
            for(LEITOR leitor : biblioteca.getLeitores()){
            TabelaLeitores.addRow(
                new Object[]{
                    leitor.getNome(), 
                    leitor.getEmail()
                }
            );
        }
            TABELAleitores.setModel(TabelaLeitores);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TABELAleitores = new javax.swing.JTable();
        BOTAOSAIR = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Leitores Cadastrados");

        TABELAleitores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(TABELAleitores);

        BOTAOSAIR.setText("Fechar");
        BOTAOSAIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOTAOSAIRActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(BOTAOSAIR)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BOTAOSAIR)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BOTAOSAIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOTAOSAIRActionPerformed
        this.dispose();
    }//GEN-LAST:event_BOTAOSAIRActionPerformed

   
    public static void main(String args[]) {
   
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BOTAOSAIR;
    private javax.swing.JTable TABELAleitores;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
