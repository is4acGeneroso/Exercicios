/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package exercicio074.Exercicio074;

import java.util.Arrays;

/**
 *
 * @author isaac
 */
public class Exercicio074 {

    public static void preencheVetor() {
        int vetor[] = new int[10];
        Arrays.fill(vetor, 0);
        
        for(int i = 0; i < 10; i++) {
            if(i % 2 == 0) {
                vetor[i] = 5;
            } else {
                vetor[i] = 3;
            }
        }
        
        for(int x : vetor) {
            System.out.print(x + " ");
        }
    }
        
    public static void main(String[] args) {
        preencheVetor();        
    }
}
