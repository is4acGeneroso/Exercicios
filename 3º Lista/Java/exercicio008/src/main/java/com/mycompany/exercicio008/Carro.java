package com.mycompany.exercicio008;

public class Carro {
    private String marca;
    private String modelo;
    private int velocidadeAtual;

    public Carro(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadeAtual = 0;
    }
    
    public void acelerar() {
        this.setVelocidadeAtual(this.getVelocidadeAtual() + 5);
        
        System.out.println("ACELERANDO...");
    }
    
    public void frear() {
        if(this.getVelocidadeAtual() > 0) {
            this.setVelocidadeAtual(this.getVelocidadeAtual() - 5);
            System.out.println("FREIANDO...");
        } else {
            System.out.println("CARRO PARADO");
        }
    }
    
    public void exibirVelocidadeAtual() {
        System.out.println("VELOCIDADE ATUAL: " + this.getVelocidadeAtual() + "km");
    }
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(int velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }
}
