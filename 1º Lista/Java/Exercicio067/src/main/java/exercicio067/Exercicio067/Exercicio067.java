/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package exercicio067.Exercicio067;

import java.util.*;

/**
 *
 * @author isaac
 */
public class Exercicio067 {

    public static void contagem(int numero) {
        for(int i = 0; i <= numero; i++) {
            System.out.print(i + " ");
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = 0;
        
        System.out.print("DIGITE UM VALOR INTEIRO: ");
        numero = scanner.nextInt();
        
        System.out.println("");
        
        contagem(numero);
        System.out.print("FIM");
    }
}
