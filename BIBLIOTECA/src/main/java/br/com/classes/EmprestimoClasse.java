/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.classes;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import br.com.modelos.modeloEmprestimo;
import br.com.modelos.modeloLivroes;

public class EmprestimoClasse extends AbstractTableModel {
    private List<EmprestimoClasse> itens;
    private String[] columns = new String[]{
        "Códigos",
        "Leitores",
        "Livros",
        "Datas",
        "Disponívelis"
    };
    private Class[] Tipos = new Class[]{
        java.lang.Integer.class, 
        java.lang.String.class, 
        java.lang.String.class, 
        java.lang.String.class, 
        java.lang.Boolean.class
            };
            
    private boolean[] editar = new boolean[]{
        false, 
        false, 
        false, 
        false, 
        false
            };
            
    public EmprestimoClasse(List<EmprestimoClasse> itens){
        this.itens = itens;
    }
    
    
    public int getRowCount() {
        return itens.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        modeloEmprestimo itemsEmprestimo = itens.get(rowIndex);
        switch(columnIndex) {
            case 0: return itemsEmprestimo.getID();
            case 1: return itemsEmprestimo.getLeitor();
            case 2: return itemsEmprestimo.getLivro();
            case 3: return itemsEmprestimo.getData();
            case 4: return itemsEmprestimo.estaDevolvido();
            
        }
        return null;
}
    @Override
    public Class getColumnClass(int columnIndex) {
        return Tipos[columnIndex];
    }

    @Override
    public String getColumnName(int column) {
        return columns[column];
    }
    
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return editar[columnIndex];
    }
    
    public void add(EmprestimoClasse item) {
        itens.add(item);
        int row = itens.indexOf(item);
        fireTableRowsInserted(row, row);
    }
    
    public void remove(EmprestimoClasse item) {
        if (itens.contains(item)) {
            int row = itens.indexOf(item);
            itens.remove(row);
            fireTableRowsDeleted(row, row);
        }
    }
}