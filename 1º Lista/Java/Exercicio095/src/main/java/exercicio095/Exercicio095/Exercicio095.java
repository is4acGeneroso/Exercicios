/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package exercicio095.Exercicio095;

import java.util.Scanner;

/**
 *
 * @author isaac
 */
public class Exercicio095 {
    
    public static int numero[] = new int[2];
    public static int totSoma = 0;
    
    public static void solicitaNumero() {
        Scanner scanner = new Scanner(System.in);
        
        for(int i = 0; i < 2; i++) {
            System.out.format("DIGITE O %dº NUMERO: ", i+1);
            numero[i] = scanner.nextInt();
        }
    }
    
    public static int somador(int n1, int n2) {
        int resultado = 0;
        
        resultado = n1+n2;
        
        return resultado;
    }
    
    public static void exibicao(int n1, int n2) {
        System.out.format("A SOMA ENTRE %d + %d É: %d", n1, n2, totSoma);
    }
    
    public static void main(String[] args) {
        solicitaNumero();
        totSoma = somador(numero[0], numero[1]);
        exibicao(numero[0], numero[1]);
    }
}
