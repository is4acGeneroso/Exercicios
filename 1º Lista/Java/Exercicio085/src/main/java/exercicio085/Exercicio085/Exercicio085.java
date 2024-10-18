/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package exercicio085.Exercicio085;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author isaac
 */
public class Exercicio085 {

    public static String nome[] = new String[5];
    public static int sexo[] = new int[nome.length];
    public static double salario[] = new double[nome.length];
    
    public static void iniciaVetor() {
        Arrays.fill(nome, null);
        Arrays.fill(sexo, 0);
        Arrays.fill(salario, 0.0);
    }
    
    public static void preencheInformacoes() {
        Scanner scanner = new Scanner(System.in);
        
        for(int i = 0; i < nome.length; i++) {
            System.out.format("USUARIO: %d\n", i+1);
            System.out.format("NOME: ");
            nome[i] = scanner.next(); 
            System.out.format("[1]HOMEM\n[2]MULHER\nDIGITE O SEXO: ");
            sexo[i] = scanner.nextInt();
            System.out.print("DIGITE SEU SALARIO: ");
            salario[i] = scanner.nextDouble();
            
            System.out.println("");
        }
    }
    
    public static void exibicao() {
        System.out.println("EXIBINDO DADOS...");
        
        for(int i = 0; i < nome.length; i++) {
            if(sexo[i] == 2 && salario[i] > 5000) {
                System.out.format("NOME: %s\n", nome[i]);
                System.out.format("SALARIO: %.2f", salario[i]);
                
                System.out.println("");
            }
        }
    }
    
    public static void main(String[] args) {
        iniciaVetor();
        preencheInformacoes();
        exibicao();
    }
}
