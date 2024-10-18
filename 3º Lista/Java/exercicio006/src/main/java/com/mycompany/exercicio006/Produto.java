/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio006;

/**
 *
 * @author isaac
 */
public class Produto {
    //Atributos do Produto
    private int id;
    private String nomeProduto;
    private double precoProduto;
    private int qtdEstoque;
    private boolean disponibilidade;

    public Produto(int id, String nomeProduto, double precoProduto, int qtdEstoque) {
        this.id = id;
        this.nomeProduto = nomeProduto;
        this.precoProduto = precoProduto;
        this.qtdEstoque = qtdEstoque;
        
        setDisponibilidade(qtdEstoque > 0? true: false);
    }
    
    //Metodos Acessores
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public double getPrecoProduto() {
        return precoProduto;
    }

    public void setPrecoProduto(double precoProduto) {
        this.precoProduto = precoProduto;
    }

    public int getQtdEstoque() {
        return qtdEstoque;
    }

    public void setQtdEstoque(int qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }    
    
    public boolean isDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    @Override
    public String toString() {
        return "Produto{" + "id=" + id + ", nomeProduto=" + nomeProduto + ", precoProduto=" + precoProduto + ", qtdEstoque=" + qtdEstoque + ", disponibilidade=" + disponibilidade + '}';
    }
}
