/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio004;

/**
 *
 * @author isaac
 */
public class Exercicio004 {

    public static void main(String[] args) {
        SistemaEscolar aluno1 = new SistemaEscolar();
        aluno1.setNota(10, 10);
        System.out.println(aluno1.calcularMedia());
        System.out.println(aluno1.verificaSituacao());
    }
}
