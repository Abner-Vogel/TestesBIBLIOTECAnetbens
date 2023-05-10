/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.senac.biblioteca;

/**
 *
 * @author Aluno TDS
 */
public class Livroes {
    public String nome;
    public int cod;
    public String status;
    
    public Livroes(String nome, int cod, String status){
        
        this.nome = nome;
        this.cod = cod;
        this.status = status;
        
    }
     public String getNomeLivro(){
        return nome;
    }
      public String getCodLivro(){
        return cod;
    }
    
    public String getStatusLivro(){
        return status;
    }
}
