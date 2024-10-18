/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package exercicio084.Exercicio084;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author isaac
 */
public class Exercicio084 {

    public static String nome[] = new String[9];
    public static int idade[] = new int[nome.length];
     
    public static void preencheInformacoes() {
        Scanner scanner = new Scanner(System.in);
        
        for(int i = 0; i < nome.length; i++) {
            System.out.format("USUARIO: %d\n", i+1);
            System.out.print("DIGITE SEU NOME: ");
            nome[i] = scanner.next();
            System.out.print("DIGITE SUA IDADE: ");
            idade[i] = scanner.nextInt();
            
            System.out.println("");
        }
    }
    
    public static void exibicao() {
        System.out.println("EXIBICAO DOS MENORES DE IDADE");
        
        for(int i = 0; i < nome.length; i++) {
            if(idade[i] < 18) {
                System.out.format("NOME: %s\n", nome[i]);
                System.out.format("IDADE: %d", idade[i]);
                
                System.out.println("");
            }
        }
    }
    
    public static void main(String[] args) {
        Arrays.fill(nome, null);
        Arrays.fill(idade, 0);
        
        preencheInformacoes();
        exibicao();
    }
}
