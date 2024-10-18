/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio006;

/**
 *
 * @author isaac
 */
public class Numero {
    private int numero;
    private int antecessor;
    private int sucessor;

    public Numero(int numero) {
        this.setNumero(numero);
        this.setAntecessor();
        this.setSucessor();
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    
    public int getAntecessor() {
        return antecessor;
    }

    public void setAntecessor() {
        this.antecessor = this.numero - 1;
    }

    public int getSucessor() {
        return sucessor;
    }

    public void setSucessor() {
        this.sucessor = this.numero + 1;
    }
    
    
}
