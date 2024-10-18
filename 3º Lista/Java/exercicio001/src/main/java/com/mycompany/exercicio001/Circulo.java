/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio001;

/**
 *
 * @author isaac
 */
public class Circulo {
    //Atributos
    private float raio;
    
    //Metodos Especiais
    public float calcularArea() {
        final float pi = (float) Math.PI; // Use Math.PI for better precision
        return pi * (float) Math.pow(this.getRaio(), 2);
    }

    public float calcularPerimetro() {
        final float pi = (float) Math.PI;
        return 2 * pi * this.getRaio();
    }
    
    //Metodos Acessores
    public float getRaio() {
        return raio;
    }

    public void setRaio(float raio) {
        this.raio = raio;
    }
}
