/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package exercicio069.Exercicio069;

import java.util.*;

/**
 *
 * @author isaac
 */
public class Exercicio069 {

    public static int somaTot = 0;
    
    public static void PA(int primeiroTermo, int razao) {
        int elemento = primeiroTermo;
        for(int i = 0; i < 10; i++) {
            System.out.print(elemento + " ");
            elemento += razao;
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int primeiroTermo = 0;
        int razao = 0;
        
        System.out.print("DIGITE O NUMERO DO PRIMEIRO TERMO: ");  
        primeiroTermo = scanner.nextInt();
        System.out.print("DIGITE A RAZAO: ");
        razao = scanner.nextInt();
        PA(primeiroTermo, razao);
    }
}
