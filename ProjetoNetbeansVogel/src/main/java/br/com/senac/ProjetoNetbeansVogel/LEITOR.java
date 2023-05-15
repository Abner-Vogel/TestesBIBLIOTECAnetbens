/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.senac.ProjetoNetbeansVogel;

/**
 *
 * @author abner
 */
public class LEITOR {
     private final String nome;
     private final String email;
     
     public LEITOR(
     String nome,
     String email
     ){
         this.nome = nome;
         this.email = email;
     }
     public String getNome(){
        return nome;
    }
      public String getEmail(){
        return email;
    }
}
