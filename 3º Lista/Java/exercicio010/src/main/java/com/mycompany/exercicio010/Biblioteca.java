package com.mycompany.exercicio010;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private String nome;
    private List<Livro> estante;
    private boolean disponibilidade;
    
    public Biblioteca(String nome) {
        this.nome = nome;
        this.estante = new ArrayList<>();
    }
    
    public void armazenarLivro(Livro livro) {
        this.estante.add(livro);
    }
    
    public boolean verificarDisponibilidade(String nomeLivro) {
        for(int i = 0; i < estante.size(); i++) {
            if(estante.get(i).getTitulo().equalsIgnoreCase(nomeLivro)) {
                this.setDisponibilidade(true);
            } else {
                this.setDisponibilidade(false);
            }
        }
        
        return isDisponibilidade();
    }
    
    public void emprestarLivro() {
        if(!this.isDisponibilidade()) {
            System.out.println("LIVRO NAO DISPONIVEL PARA EMPRESTAR");
        } else {
            System.out.println("LIVRO EMPRESTADO");
        }
    }
    
    public void devolverLivro() {
        if(!this.isDisponibilidade()) {
            System.out.println("NAO E POSSIVEL DEVOLVER O LIVRO");
        } else {
            System.out.println("LIVRO DEVOLVIDO");
        }
    }
    
    //Metodos Acessores
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Livro> getEstante() {
        return estante;
    }

    public void setEstante(List<Livro> estante) {
        this.estante = estante;
    }

    public boolean isDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }
}
