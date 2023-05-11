/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.modelos;

public class modeloEmprestimo {
    private int id;
    private final String leitor;
    private String livrozes;
    private final String data;
    private boolean devolvidos;
       
    public modeloEmprestimo(String leitor, String data, boolean devolvido){
        this.leitor = leitor;
        this.livrozes = livrozes;
        this.data = data;
        this.devolvidos = false;
    }
    
    public int getID(){
        return id;
    }
    
    public String getLeitor(){
        return leitor;
    }
    
      public String getLivro(){
        return livrozes;
    }
      
        public String getData(){
        return data;
    }
    
    public boolean estaDevolvido(){
        return devolvidos;
    }
    
    public void setDevolvido(boolean devolvido) {
        this.devolvidos = devolvido;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final modeloEmprestimo other = (modeloEmprestimo) obj;
        return this.id == other.id;
    }
       
}
