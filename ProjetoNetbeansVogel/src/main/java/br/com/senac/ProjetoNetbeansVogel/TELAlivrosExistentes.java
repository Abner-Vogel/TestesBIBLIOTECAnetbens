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
public class TELAlivrosExistentes extends javax.swing.JDialog {
    private biblioteca BIBLIOTECA;
  
    public TELAlivrosExistentes(java.awt.Frame parent,biblioteca BIBLIOTECA) {
        super(parent);
        
        initComponents();
        modeloTabela();
    }
    
    public void modeloTabela(){
        DefaultTableModel TABELAlivrosCOD = new DefaultTableModel();
        TABELAlivrosCOD.addColumn("Titulo");
        TABELAlivrosCOD.addColumn("Autor");
        TABELAlivrosCOD.addColumn("Genero");
        
        
        
        for(LIVRO livro : BIBLIOTECA.getLivros()){
                    TABELAlivrosCOD.addRow(
                    new Object[]{
                    livro.GetName(), 
                    livro.GetAutorLivro(), 
                    livro.GetGenero()
                }
            );
        }
//        for(LIVRO livro : BIBLIOTECA.getLivrosAlugados()){
//                    TABELAlivrosCOD.addRow(
//                    new Object[]{
//                    livro.GetName(), 
//                    livro.GetAutorLivro(), 
//                    livro.GetGenero()
//                }
//            );
//        }
        TABELAlivros.setModel(TABELAlivrosCOD);
//        TABELAlivrosAlugados.setModel(TABELAlivrosCOD);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        books_scroll1 = new javax.swing.JScrollPane();
        TABELAlivros = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Livros registrados");

        TABELAlivros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        TABELAlivros.setFocusable(false);
        books_scroll1.setViewportView(TABELAlivros);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Livros |Cadastrados:");

        jButton1.setText("Fechar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(books_scroll1, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(52, 52, 52)
                        .addComponent(jLabel1)))
                .addContainerGap(29, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(37, 37, 37))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(37, 37, 37))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)))
                .addComponent(books_scroll1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
      
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TABELAlivros;
    private javax.swing.JScrollPane books_scroll1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
