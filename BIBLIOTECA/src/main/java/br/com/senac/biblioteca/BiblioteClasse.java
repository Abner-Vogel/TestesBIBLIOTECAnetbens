/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.senac.biblioteca;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Aluno TDS
 */
public class BiblioteClasse {
    
    private final  List<ClienteLeitor> ClientesLeitores;
    private final  List<Livroes> livroes;
    
    public BiblioteClasse(){
        this.ClientesLeitores = new ArrayList<>();
        this.livroes = new ArrayList<>();
    }
    
    public void addLeitor(ClienteLeitor clienteLeitor){
        this.ClientesLeitores.add(clienteLeitor);
    }
    
    public void addLivroes(Livroes livroes1){
        this.livroes.add(livroes1);
    }
    
}
