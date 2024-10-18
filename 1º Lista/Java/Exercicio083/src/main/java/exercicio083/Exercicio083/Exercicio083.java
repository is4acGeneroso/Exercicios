/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package exercicio083.Exercicio083;

import java.util.Random;
import java.util.Arrays;

/**
 *
 * @author isaac
 */
public class Exercicio083 {
    
    public static int vetor[] = new int[20];

    public static void preencheVetor() {
        Random random = new Random();
        for(int i = 0; i < 20; i++) {
            int numeroSorteado = random.nextInt(99);
            vetor[i] = numeroSorteado;
        }
    }
    
    public static void main(String[] args) {
        preencheVetor();
        Arrays.sort(vetor);
        
        for(int x : vetor) {
            System.out.format("%d ", x);
        }
    }
}
