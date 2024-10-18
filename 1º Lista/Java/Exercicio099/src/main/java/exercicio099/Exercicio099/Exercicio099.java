/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package exercicio099.Exercicio099;

import java.util.Scanner;

/**
 *
 * @author isaac
 */
public class Exercicio099 {

    public static int numero = 0;
    public static int resultado = 0;
    
    public static void solicitaNumero() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.format("DIGITE UM NUMERO PARA POTENCIAR AO QUADRADO: ");
        numero = scanner.nextInt();
    }
    
    public static void potencia() {
        resultado = (int)Math.pow(numero, 2);
    }
    
    public static void exibicao() {
        System.out.format("%d² = %d", numero, resultado);
    }
    
    public static void main(String[] args) {
        solicitaNumero();
        potencia();
        exibicao();
    }
}
