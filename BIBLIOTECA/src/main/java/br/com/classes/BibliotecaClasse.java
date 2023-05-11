/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.classes;
import java.util.List;
import java.util.ArrayList;


public class BibliotecaClasse {
    private final String nome;
    private final  List<ClienteLeitor> ClientesLeitores;
    private final  List<Livroes> livroes;
    private int idContador = 0;
    
    public BibliotecaClasse(String nome){
        this.nome = nome;
        this.ClientesLeitores = new ArrayList<>();
        this.livroes = new ArrayList<>();
        
    }

    public BibliotecaClasse() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public String getNome() {
        return nome;
    }

    public List<Livroes> getLivros() {
        return livroes;
    }
    
    
    public void addLeitor(ClienteLeitor clienteLeitor){
        this.ClientesLeitores.add(clienteLeitor);
    }
    
    public void addLivroes(Livroes livro){
        this.livroes.add(livro);
        livro.setId(++this.idContador);
        this.livroes.add(livro);
    }
    
    public void editarLivro(Livroes livro){
        if(livro.getId()>0){
            int index = this.livroes.indexOf(livro);
            if(index>= 0)
               this.livroes.set(index, livro);
         }else{
            addLivroes(livro);
        }
    }
    
    public void removerLivro(Livroes livro){
            this.livroes.remove(livro);
    }
    
    public Livroes getLivroPorIdCode(int id){
        int index = this.livroes.indexOf(new Livroes(id));
        return this.livroes.get(index);
    }
    
    public List<Livroes> findLivro(String Titulo, String Autor, String Categoria){
        List<Livroes> resultados = new ArrayList<>();
        for (Livroes livro : this.livroes) {
        if(livro.isDisponivel()){
        if(!Titulo.isEmpty() && livro.getTitulo().toUpperCase().contains(Titulo.toUpperCase()))
           resultados.add(livro);
        else if(!Autor.isEmpty() && livro.getAutor().toUpperCase().contains(Autor.toUpperCase()))
           resultados.add(livro);
        else if(!Categoria.isEmpty() && livro.getCategoria().toUpperCase().contains(Categoria.toUpperCase()))
           resultados.add(livro);
            }
        }
        return resultados;
    }
}
