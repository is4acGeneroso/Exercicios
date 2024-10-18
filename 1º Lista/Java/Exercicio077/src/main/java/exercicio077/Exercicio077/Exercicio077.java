/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package exercicio077.Exercicio077;

import java.util.*;

/**
 *
 * @author isaac
 */
public class Exercicio077 {

    public static void main(String[] args) {
        String nome[] = new String[7];
        Scanner scanner = new Scanner(System.in);
        
        for(int i = 0; i < 7; i++) {
            System.out.format("USUARIO: %d\n", i+1);
            System.out.print("QUAL SEU NOME: ");
            nome[i] = scanner.nextLine(); 
            
            System.out.println("");
        }
        
        for(int i = 6; i >= 0; i--) {
            System.out.print(nome[i] + " ");
        }
    }
}
