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
        this.BIBLIOTECA = BIBLIOTECA;
        modeloTabela();
        initComponents();
    }
    
    public void modeloTabela(){
        DefaultTableModel TABELAlivros = new DefaultTableModel();
        TABELAlivros.addColumn("Titulo");
        TABELAlivros.addColumn("Autor");
        TABELAlivros.addColumn("Genero");
        
        DefaultTableModel TABELAlivrosAlugados = new DefaultTableModel();
        TABELAlivrosAlugados.addColumn("Titulo");
        TABELAlivrosAlugados.addColumn("Autor");
        TABELAlivrosAlugados.addColumn("Genero");
        
        for(LIVRO livro : BIBLIOTECA.getLivros()){
                    TABELAlivros.addRow(
                    new Object[]{
                    livro.GetName(), 
                    livro.GetAutorLivro(), 
                    livro.GetGenero()
                }
            );
        }
        for(LIVRO livro : BIBLIOTECA.getLivrosAlugados()){
                    TABELAlivrosAlugados.addRow(
                    new Object[]{
                    livro.GetName(), 
                    livro.GetAutorLivro(), 
                    livro.GetGenero()
                }
            );
        }
        this.TABELAlivros.setModel(TABELAlivros);
        this.TABELAlivrosAlugados.setModel(TABELAlivrosAlugados);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        books_scroll1 = new javax.swing.JScrollPane();
        TABELAlivros = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        books_scroll2 = new javax.swing.JScrollPane();
        TABELAlivrosAlugados = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();

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
        jLabel2.setText("Livros Livres");

        TABELAlivrosAlugados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        TABELAlivrosAlugados.setFocusable(false);
        books_scroll2.setViewportView(TABELAlivrosAlugados);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Livros Alugados");

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
                        .addComponent(jLabel1))
                    .addComponent(books_scroll2, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap(29, Short.MAX_VALUE))
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
                .addComponent(books_scroll1, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                .addGap(12, 12, 12)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(books_scroll2, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
      
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TABELAlivros;
    private javax.swing.JTable TABELAlivrosAlugados;
    private javax.swing.JScrollPane books_scroll1;
    private javax.swing.JScrollPane books_scroll2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
