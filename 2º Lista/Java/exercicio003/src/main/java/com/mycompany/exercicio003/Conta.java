/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio003;

/**
 *
 * @author Isaac
 */
public class Conta {
    private double saldo;

    public Conta(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public double reajuste() {
        double porcento = this.saldo * 0.01;
        double reajuste = this.saldo + porcento;
        
        setSaldo(reajuste);
        
        return getSaldo();
    }
}
