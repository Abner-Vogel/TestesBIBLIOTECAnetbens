/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.classes;
import br.com.classes.BibliotecaClasse;
import br.com.classes.Livroes;


public class Dadosclasse {
    private BibliotecaClasse biblioteca;

    public Dadosclasse() {
        initDados();
    }
    private void initDados(){
        // Inicializa biblioteca
        this.biblioteca = new BibliotecaClasse("Biblioteca Municipal");
        this.biblioteca.addLivroes(new Livroes("Biblia","Não informado","Religião"));
        this.biblioteca.addLivroes(new Livroes("Turma da Mônica","Maurício de Souza","Infantil"));
        this.biblioteca.addLivroes(new Livroes("Harry Potter","J.K. Rownling","Fantasia"));
        this.biblioteca.addLivroes(new Livroes("O Código Da Vinci","Dan Brown","Ficção"));
        this.biblioteca.addLivroes(new Livroes("Vinte mil léguas submarinas","Julio Verne","Ficção"));
    }
    
    public BibliotecaClasse getBiblioteca(){
        return this.biblioteca;
    }
    
}
