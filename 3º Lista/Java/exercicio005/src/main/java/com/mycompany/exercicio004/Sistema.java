    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio004;

/**
 *
 * @author isaac
 */
public class Sistema extends Funcionario {

    public Sistema(String nome, double salario, String cargoFuncionario) {
        this.setNome(nome);
        this.setSalario(salario);
        this.setCargoFuncionario(cargoFuncionario);        
    }
    
    public double calcularSalarioLiquido() {
        float inss = 0.075f;
        
        setSalarioLiquido(getSalario() - (getSalario() * inss));
        
        return getSalarioLiquido();
    }
    
    @Override
    public String toString() {
        return "Funcionario{" + "nome=" + getNome() + ", salario=" + getSalario() + 
                ", salarioLiquido=" + getSalarioLiquido() + ", cargoFuncionario=" + getCargoFuncionario() + '}';
    }
}
