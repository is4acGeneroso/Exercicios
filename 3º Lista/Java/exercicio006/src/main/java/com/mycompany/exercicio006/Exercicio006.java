package com.mycompany.exercicio006;

import java.net.IDN;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio006 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String resposta = "";
        int id = 0;
        String nomeProduto = "";
        double precoProduto = 0.0;
        int qtdEstoque = 0;
        List<Produto> produtos = new ArrayList<>();
        double precoTotalProdutos = 0.0;
        String indiceNomeProduto = "", mensagemDisponibilidade = "";
        
        do {
            System.out.print("DIGITE O NOME DO PRODUTO: ");
            nomeProduto = scanner.next();
            System.out.print("DIGITE O PRECO DO PRODUTO: ");
            precoProduto = scanner.nextDouble();
            System.out.print("DIGITE A QUANTIDADE DISPONIVEL: ");
            qtdEstoque = scanner.nextInt();
            
            Produto produto = new Produto(id, nomeProduto, precoProduto, qtdEstoque);
            
            produtos.add(produto);
            
            System.out.print("CADASTRAR OUTRO PRODUTO[S/N]: ");
            resposta = scanner.next();
            id++;
            
            System.out.println("");
        } while(!resposta.equalsIgnoreCase("N"));
        
        System.out.println("");
        
        System.out.print("DIGITE O NOME DO PRODUTO QUE QUER VERFICIAR A DISPONIBILIDADE: ");
        indiceNomeProduto = scanner.next();
        
        for(int i = 0; i < id; i++) {
            if(produtos.get(i).getNomeProduto().equalsIgnoreCase(indiceNomeProduto)) {
                mensagemDisponibilidade = "PRODUTO: ";
                mensagemDisponibilidade += produtos.get(i).getNomeProduto();
                mensagemDisponibilidade += "\nDISPONIBILIDADE: "; 
                mensagemDisponibilidade += (produtos.get(i).isDisponibilidade() == true)? "disponivel": "indisponivel";
            }
        }
        
        //Soma valores inseridos
        for(int i = 0; i < id; i++) {
            precoTotalProdutos += produtos.get(i).getPrecoProduto();
        }
        
        System.out.println(mensagemDisponibilidade);
        System.out.format("PREÇO TOTAL DOS PRODUTOS SOMADOS: %.2f", precoTotalProdutos);
    }
}
