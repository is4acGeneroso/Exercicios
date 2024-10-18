/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio003;

/**
 *
 * @author Isaac
 */
public class Exercicio003 {

    public static void main(String[] args) {
        Conta conta = new Conta(100);
        System.out.print(String.format("SALARIO INICIAL: %.2f\nSALARIO COM REAJUSTE: %.2f", 
                conta.getSaldo(), conta.reajuste()));
    }
}
