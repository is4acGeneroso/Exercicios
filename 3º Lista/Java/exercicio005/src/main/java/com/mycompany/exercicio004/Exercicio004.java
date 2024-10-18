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
        Sistema funcionario1 = new Sistema("isaac", 1320.00, "ADS");
        funcionario1.calcularSalarioLiquido();
        System.out.println(funcionario1.toString());
    }
}
