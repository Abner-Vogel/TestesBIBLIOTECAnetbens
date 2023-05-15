/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.senac.ProjetoNetbeansVogel;
import java.util.Objects;
/**
 *
 * @author abner
 */
public class LIVRO {
    private final String nome;
    private final String autor;
    private final String genero;
    
    public LIVRO (
            String nome, 
            String genero, 
            String autor){
        
        this.nome = nome;
        this.genero = genero;
        this.autor = autor;
    }
    
    public String GetName(){
        return nome;
    }
    
    public String GetGenero(){
        return genero;
    }
    
    public String GetAutorLivro(){
        return autor;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + Objects.hashCode(this.nome);
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
        final LIVRO other = (LIVRO) obj;
        return Objects.equals(this.nome, other.nome);
    }
    
    @Override
    public String toString(){
        return GetName();
    }
    
}
