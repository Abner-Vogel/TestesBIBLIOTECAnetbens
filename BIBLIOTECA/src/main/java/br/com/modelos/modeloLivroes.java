/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.modelos;

import br.com.classes.Livroes;
import javax.swing.table.AbstractTableModel;
import java.util.List;
/**
 *
 * @author abner
 */


public class modeloLivroes extends AbstractTableModel {
    private List<Livroes> itens;
    private String[] colunas = new String[]{
    "Códigos",
    "Titulos",
    "Autores",
    "Categorias",
    "Disponiveis",
    
};

    private Class[] Tipos = new Class [] {
        java.lang.Integer.class, 
        java.lang.String.class, 
        java.lang.String.class, 
        java.lang.String.class, 
        java.lang.Boolean.class
    };
    private boolean[] naoEdit = new boolean [] {
        false, 
        false, 
        false, 
        false, 
        false
    };
    
    public modeloLivroes(List<Livroes> itens){
    this.itens = itens;
}
    
    @Override
    public int getRowCount() {
        return itens.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
          Livroes item = itens.get(rowIndex);
        switch (columnIndex) {
            case 0: return item.getId();
            case 1: return item.getTitulo();
            case 2: return item.getAutor();
            case 3: return item.getCategoria();
            case 4: return item.isDisponivel();

    }
    return null;
}
@Override
    public Class getColumnClass(int columnIndex) {
        return Tipos[columnIndex];
    }
    
    @Override
    public String getColumnName(int coluna) {
        return colunas[coluna];
    }
    
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return naoEdit[columnIndex];
    }
    
    public void add(Livroes item) {
        itens.add(item);
        int row = itens.indexOf(item);
        fireTableRowsInserted(row, row);
    }
    
    public void remove(Livroes item) {
        if (itens.contains(item)) {
            int row = itens.indexOf(item);
            itens.remove(row);
            fireTableRowsDeleted(row, row);
        }
    }
    
    
}