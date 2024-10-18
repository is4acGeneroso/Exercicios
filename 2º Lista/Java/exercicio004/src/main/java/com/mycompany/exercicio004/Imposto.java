/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio004;

/**
 *
 * @author Isaac
 */
public class Imposto {
    
    public double calcularImposto(double vlrProduto1, int qtdProduto1, double vlrProduto2, int qtdProduto2) {
        double totProduto = (vlrProduto1 * qtdProduto1) + (vlrProduto2 * qtdProduto2);
        double porcentagem = totProduto * (0.10 + 1);
        double totValor = totProduto + porcentagem;
        
        return totValor;
    }
}
