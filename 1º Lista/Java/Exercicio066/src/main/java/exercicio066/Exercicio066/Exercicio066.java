/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package exercicio066.Exercicio066;

import java.util.*;

/**
 *
 * @author isaac
 */
public class Exercicio066 {

    public static void tabuada(int numero) {
        int produto = 0;
        
        for(int i = 1; i <= 10; i++) {
            produto = numero * i; 
            System.out.format("%d x %d = %d\n", numero, i, produto);
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = 0;
        
        System.out.print("DIGITE UM VALOR INTEIRO: ");
        numero = scanner.nextInt();
        
        System.out.println("");
        
        tabuada(numero);
    }
}
