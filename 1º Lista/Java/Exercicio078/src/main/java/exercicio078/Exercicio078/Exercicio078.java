/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package exercicio078.Exercicio078;

import java.util.Scanner;

/**
 *
 * @author isaac
 */
public class Exercicio078 {
    
    public static int valor[] = new int[15];

    public static void preencheVetor() {
        Scanner scanner = new Scanner(System.in);
        
        for(int i = 0; i < 15; i++) {
            System.out.format("USUARIO %d\n", i+1);
            System.out.print("DIGITE UM NUMERO: ");
            valor[i] = scanner.nextInt();
            
            System.out.println("");
        }
    }
    
    public static void main(String[] args) {
        preencheVetor();
        
        for(int i = 0; i < 15; i++) {
            if(valor[i] % 10 == 0) {
                System.out.format("[%d] ", valor[i]);
            } else {
                System.out.format("%d ", valor[i]);
            }
        }
    }
}
