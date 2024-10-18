/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package exercicio092.Exercicio092;

import java.util.Scanner;

/**
 *
 * @author isaac
 */
public class Exercicio092 {
    
    public static int numero = 0;
    public static String tipo = null;
    
    public static void solicitaNumero() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("DIGITE UM NUMERO: ");
        numero = scanner.nextInt();
    }
    
    public static void parOuImpar() {
        if(numero % 2 == 0) {
            tipo = "PAR";
        } else {
            tipo = "IMPAR";
        }
    }
    
    public static void exibicao() {
        System.out.format("\nO NUMERO %d É %s", numero, tipo);
    }
    
    public static void main(String[] args) {
        solicitaNumero();
        parOuImpar();
        exibicao();
    }
}
