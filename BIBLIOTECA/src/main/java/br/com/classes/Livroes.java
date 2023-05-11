/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.classes;
import java.util.Objects;
/**
 *
 * @author Aluno TDS
 */
public class Livroes {
       
 private String Titulo;
    private String Autor;
    private String Categoria;
    private boolean Disponivel;
    private int idCod;
    
    
    public Livroes (String titulo, String autor, String categoria) {
        this.Titulo = titulo;
        this.Autor = autor;
        this.Categoria = categoria;
        this.Disponivel = true;
   }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + this.idCod;
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
        final Livroes other = (Livroes) obj;
        return this.idCod == other.idCod;
    }
    
    public Livroes(int idCod){
         this.idCod = idCod;
    }
    public String getTitulo(){
        return Titulo;
    }
    
    public int getId() {
        return idCod;
    }
    
    public String getAutor() {
        return Autor;
    }
    
    public String getCategoria() {
        return Categoria;
    }
    
    public boolean isDisponivel() {
        return Disponivel;
    }

      public void setId(int idCod) {
        this.idCod = idCod;
    }
    
    public void setDisponivel(boolean Disponivel) {
        this.Disponivel = Disponivel;
    }
}

    
    
   