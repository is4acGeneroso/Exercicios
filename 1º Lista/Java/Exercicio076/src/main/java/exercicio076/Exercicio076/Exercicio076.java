/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package exercicio076.Exercicio076;

import java.util.*;

/**
 *
 * @author isaac
 */
public class Exercicio076 {

    public static int preencheAleteatorio() {
        int numeroAleatorio = 0;
        Random random = new Random();
        
        numeroAleatorio = random.nextInt(100) + 1;
        
        return  numeroAleatorio;
    }
        
    public static void main(String[] args) {
        int vetor[] = new int[16];
        Arrays.fill(vetor, 0);
        
        for(int i = 0; i < 16; i++) {
            vetor[i] = preencheAleteatorio();
        }
        
        Arrays.sort(vetor);
        
        for(int x : vetor) {
            System.out.print(x + " ");
        }
    }
}
