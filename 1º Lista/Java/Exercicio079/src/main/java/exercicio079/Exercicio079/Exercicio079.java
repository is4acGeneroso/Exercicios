/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package exercicio079.Exercicio079;

import java.util.Scanner;

/**
 *
 * @author isaac
 */
public class Exercicio079 {

    public static int numero[] = new int[10];
    
    public static void preencheNumero() {
        Scanner scanner = new Scanner(System.in);
        
        for(int i = 0; i < 10; i++) {
            System.out.format("USUARIO: %d\n", i+1);
            System.out.print("DIGITE UM NUMERO: ");
            numero[i] = scanner.nextInt();
            
            System.out.println("");
        }
    }
    
    public static void mostraPar() {
        System.out.println("\nNUMEROS PARES");
        for(int i = 0; i < 10; i++) {
            if(numero[i] % 2 == 0) {
                System.out.format("[ %d ] POSICAO: %d\n", numero[i], i);
            }
        }
    }
    
    public static void main(String[] args) {
        preencheNumero();
        mostraPar();
    }
}
