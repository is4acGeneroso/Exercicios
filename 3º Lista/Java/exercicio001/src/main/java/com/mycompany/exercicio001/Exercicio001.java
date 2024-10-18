/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio001;

/**
 *
 * @author isaac
 */
public class Exercicio001 {

    public static void main(String[] args) {
        Circulo circulo = new Circulo();
        circulo.setRaio(5);
        System.out.format("%.2f", circulo.calcularArea());
    }
}
