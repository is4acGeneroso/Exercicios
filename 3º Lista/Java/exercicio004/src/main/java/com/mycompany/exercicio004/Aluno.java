/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio004;

/**
 *
 * @author isaac
 */
public class Aluno {
    private String nome;
    private int matricula;
    private float[] nota;

    public Aluno() {
        this.nota = new float[2];
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public float[] getNota() {
        return nota;
    }

    public void setNota(float nota1, float nota2) {
        this.nota[0] = nota1;
        this.nota[1] = nota2;
    }    
}
