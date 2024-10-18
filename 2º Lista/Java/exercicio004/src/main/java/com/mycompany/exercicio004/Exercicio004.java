/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio004;

/**
 *
 * @author Isaac
 */
public class Exercicio004 {

    public static void main(String[] args) {
        Produto produto1 = new Produto(1234, 10, 1);
        Produto produto2 = new Produto(4321, 20, 1);
        Imposto imposto = new Imposto();
        
        System.out.println(String.format("VALOR TOTAL DE IMPOSTO A SER PAGO R$%.2f",
                imposto.calcularImposto(produto1.getValor(), produto1.getQuantidade(), produto2.getValor(), produto2.getQuantidade())));
    }
}
