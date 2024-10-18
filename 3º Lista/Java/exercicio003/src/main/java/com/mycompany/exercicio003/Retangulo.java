/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio003;

/**
 *
 * @author isaac
 */
public class Retangulo {
    private float altura;
    private float largura;
    
    public float calculaPerimetro() {
        return (this.getAltura() + this.getLargura()) * 2;
    }
    
    public float calculaArea() {
        return (this.getAltura() * this.getLargura());
    }
    
    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getLargura() {
        return largura;
    }

    public void setLargura(float largura) {
        this.largura = largura;
    }
}
