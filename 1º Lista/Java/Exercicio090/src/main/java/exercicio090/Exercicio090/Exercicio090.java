/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package exercicio090.Exercicio090;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author isaac
 */
public class Exercicio090 {

    public static int numero[] = new int[2];
    public static int resultado = 0;
    
    public static void solicitaValores() {
        Scanner scanner = new Scanner(System.in);
        
        for(int i = 0; i < 2; i++) {
            System.out.format("DIGITE O %dº NUMERO: ", i+1);
            numero[i] = scanner.nextInt();
        }
    }
    
    public static void somadorAutomatico(int n1, int n2) {
        resultado = n1+n2;
    }
    
    public static void exibicao(int n1, int n2) {
        System.out.format("\nA SOMA ENTRE %d + %d É: %d", n1, n2, resultado);
    }
    
    public static void main(String[] args) {
        Arrays.fill(numero, 0);
        solicitaValores();
        somadorAutomatico(numero[0], numero[1]);
        
        exibicao(numero[0], numero[1]);
    }
}
