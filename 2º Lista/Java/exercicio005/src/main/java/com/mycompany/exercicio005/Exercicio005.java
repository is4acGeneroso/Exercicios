/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio005;

/**
 *
 * @author isaac
 */
public class Exercicio005 {

    public static void main(String[] args) {
        Salario salarioMinimo = new Salario(1435.00, 4305.00);
        System.out.println("Quantidade de salarios minimos = " + 
                salarioMinimo.calculaQuantidadeSalarioMin());
        System.out.println(salarioMinimo.calculaQuantidadeSalarioMin() + "SM = " +
                salarioMinimo.getValorSalarioMinimo());
    }
}
