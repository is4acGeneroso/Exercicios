package com.mycompany.exercicio009;

import java.util.ArrayList;
import java.util.List;

public class Paciente {
    private String nome;
    private int idade;
    private List<String> consultas;

    public Paciente(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        this.consultas = new ArrayList<>();
    }

    public void adicionarNovaConsulta(String novaConsulta) {
        this.consultas.add(novaConsulta);
        System.out.println("Consulta Adicionada!");
    }
        
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public List<String> getConsultas() {
        return consultas;
    }

    @Override
    public String toString() {
        return "Paciente{" + "nome=" + nome + ", idade=" + idade + ", consultas=" + consultas + '}';
    }
}
