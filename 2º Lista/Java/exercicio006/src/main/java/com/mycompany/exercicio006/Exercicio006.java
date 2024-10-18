/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio006;

/**
 *
 * @author isaac
 */
public class Exercicio006 {

    public static void main(String[] args) {
        Numero numero = new Numero(1);
        System.out.println(String.format("Numero: %d", numero.getNumero()));
        System.out.println(String.format("Antecessor: %d", numero.getAntecessor()));
        System.out.println(String.format("Sucessor: %d", numero.getSucessor()));
    }
}
