/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.senac.ProjetoNetbeansVogel;

import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author abner
 */
public class biblioteca {
     private static final List<LEITOR> Leitores = new ArrayList<>();
      private static final List<LIVRO> livros = new ArrayList<>();
       private static final List<LIVRO> livrosAlugados = new ArrayList<>();
       

    public void addLeitor(LEITOR leitor){
        this.Leitores.add(leitor);
    }
    
        public void addLivro(LIVRO livro){
        this.livros.add(livro);
    }
    
    public static List<LEITOR> getLeitores() {
        return Leitores;
    }
   
    public static List<LIVRO> getLivrosAlugados() {
        return livrosAlugados;
    }
    
    public static List<LIVRO> getLivros() {
        return livros;
    }
    
    public static void finaLLIvro(String livro) {
        for(LIVRO livro1: getLivros()){
            if(livro1.GetName().equals(livro)){
                getLivros().remove(livro);
                break;
            }
        }
    }
}
