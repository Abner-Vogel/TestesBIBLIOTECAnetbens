    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package br.com.senac.biblioteca;
import br.com.classes.Dadosclasse;
import br.com.modelos.modeloEmprestimo;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.TableModel;

public class TELAalugar extends javax.swing.JDialog {
    private final Dadosclasse servico;
    private 
    
    public TELAalugar(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabelLivro = new javax.swing.JLabel();
        jLabelLeitor = new javax.swing.JLabel();
        jTextFieldLeitor = new javax.swing.JTextField();
        jTextFieldLivro = new javax.swing.JTextField();
        jCheckBoxDevolvido = new javax.swing.JCheckBox();
        jLabelData = new javax.swing.JLabel();
        BOTAOSalvar = new javax.swing.JButton();
        jTextFieldData = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCatalogo = new javax.swing.JTable();
        BOTAOBuscar = new javax.swing.JButton();
        jLabelId = new javax.swing.JLabel();
        jTextFieldId = new javax.swing.JTextField();

        jLabel5.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabelLivro.setText("Livro");

        jLabelLeitor.setText("Leitor");

        jCheckBoxDevolvido.setText("Devolvido");

        jLabelData.setText("Data");

        BOTAOSalvar.setText("Salvar");
        BOTAOSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOTAOSalvarActionPerformed(evt);
            }
        });

        jTableCatalogo.setModel(initTable());
        jTableCatalogo.setColumnSelectionAllowed(true);
        jScrollPane1.setViewportView(jTableCatalogo);

        BOTAOBuscar.setText("Buscar");
        BOTAOBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOTAOBuscarActionPerformed(evt);
            }
        });

        jLabelId.setText("Código");

        jTextFieldId.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabelData)
                .addContainerGap(590, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelLivro)
                            .addComponent(jLabelLeitor)
                            .addComponent(jLabelId))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTextFieldData, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(52, 52, 52)
                                        .addComponent(jCheckBoxDevolvido)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BOTAOSalvar))
                            .addComponent(jTextFieldLeitor)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextFieldLivro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BOTAOBuscar))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelId)
                    .addComponent(jTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelLivro)
                    .addComponent(jTextFieldLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BOTAOBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelLeitor)
                    .addComponent(jTextFieldLeitor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jCheckBoxDevolvido)
                        .addComponent(jTextFieldData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BOTAOSalvar))
                    .addComponent(jLabelData))
                .addGap(6, 6, 6)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BOTAOSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOTAOSalvarActionPerformed
        
    }//GEN-LAST:event_BOTAOSalvarActionPerformed

    private void BOTAOBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOTAOBuscarActionPerformed
       
    }//GEN-LAST:event_BOTAOBuscarActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BOTAOBuscar;
    private javax.swing.JButton BOTAOSalvar;
    private javax.swing.JCheckBox jCheckBoxDevolvido;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelData;
    private javax.swing.JLabel jLabelId;
    private javax.swing.JLabel jLabelLeitor;
    private javax.swing.JLabel jLabelLivro;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableCatalogo;
    private javax.swing.JTextField jTextFieldData;
    private javax.swing.JTextField jTextFieldId;
    private javax.swing.JTextField jTextFieldLeitor;
    private javax.swing.JTextField jTextFieldLivro;
    // End of variables declaration//GEN-END:variables
}
