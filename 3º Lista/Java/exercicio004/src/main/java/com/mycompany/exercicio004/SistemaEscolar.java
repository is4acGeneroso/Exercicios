/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio004;

/**
 *
 * @author isaac
 */
public class SistemaEscolar extends Aluno {
    private float mediaAluno;
    private String situacaoAluno;

    public float calcularMedia() {
        float[] notas = new float[this.getNota().length];
        notas = this.getNota();
        
        this.setMediaAluno((notas[0] + notas[1]) / notas.length);
        
        return this.getMediaAluno();
    }
    
    public String verificaSituacao() {
        String situacao = "";
        
        if(this.getMediaAluno() < 6f) {
            situacao = "REPROVADO";
        } else {
            situacao = "APROVADO";
        }
        
        this.setSituacaoAluno(situacao);
        
        return this.getSituacaoAluno();
    }
    
    public float getMediaAluno() {
        return mediaAluno;
    }

    public void setMediaAluno(float mediaAluno) {
        this.mediaAluno = mediaAluno;
    }

    public String getSituacaoAluno() {
        return situacaoAluno;
    }

    public void setSituacaoAluno(String situacaoAluno) {
        this.situacaoAluno = situacaoAluno;
    } 
}
