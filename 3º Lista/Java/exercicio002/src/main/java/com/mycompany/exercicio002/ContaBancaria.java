/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio002;

/**
 *
 * @author isaac
 */
public class ContaBancaria {
    //Atributos
    private int numeroConta;
    private String nomeTitular;
    private double saldo;

    public ContaBancaria(int numeroConta, String nomeTitular) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
    }
    
    
    
    //Metodos Especiais
    public void depositar(double valor) {
        this.setSaldo(this.getSaldo() + valor);
        System.out.println("VALOR DEPOSITADO: " + this.getSaldo());
    }
        
    public void sacar(double valor) {
        if(valor > this.getSaldo()) {
            System.out.println("SALDO INSUFICIENTE");
        } else {
            this.setSaldo(this.getSaldo() - valor);
            System.out.println("SAQUE CONCLUIDO\nVALOR: " + this.getSaldo());
        }
    }
        
    //Metodos Acessores
    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
}
