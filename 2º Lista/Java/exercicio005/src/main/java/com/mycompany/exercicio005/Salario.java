/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio005;

/**
 *
 * @author isaac
 */
public class Salario implements CalculaSalarioMinimos{
    private double valorSalarioMinimo;
    private double valorSalarioFuncionario;

    public Salario(double valorSalarioMinimo, double valorSalarioFuncionario) {
        setValorSalarioMinimo(valorSalarioMinimo);
        setValorSalarioFuncionario(valorSalarioFuncionario);
    }

    public double getValorSalarioMinimo() {
        return valorSalarioMinimo;
    }

    public void setValorSalarioMinimo(double valorSalarioMinimo) {
        this.valorSalarioMinimo = valorSalarioMinimo;
    }

    public double getValorSalarioFuncionario() {
        return valorSalarioFuncionario;
    }

    public void setValorSalarioFuncionario(double valorSalarioFuncionario) {
        this.valorSalarioFuncionario = valorSalarioFuncionario;
    }

    @Override
    public int calculaQuantidadeSalarioMin() {
        int qtdSalMin = 0;
        double salarioFuncionario = this.getValorSalarioFuncionario();
        double salarioMinimo = this.getValorSalarioMinimo();
        
        while(salarioFuncionario >= salarioMinimo) {
            qtdSalMin++;
            salarioFuncionario -= salarioMinimo;
        }
        
        return qtdSalMin;
    }
}
