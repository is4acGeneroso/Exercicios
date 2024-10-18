/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package exercicio072.Exercicio072;

import java.util.*;

/**
 *
 * @author isaac
 */
public class Exercicio072 {
    
    public static void preencheVetor() {
        int vetor[] = new int[10];
        Arrays.fill(vetor, 0);
        int adiciona = 0;
        
        for(int i = 1; i <= 10; i++) {
            adiciona = 5 * i;
            vetor[i-1] = adiciona;
            System.out.print(vetor[i-1] + " ");
        }
    }
    
    public static void main(String[] args) {
        preencheVetor();
    }
}
