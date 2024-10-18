/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package exercicio073.Exercicio073;

/**
 *
 * @author isaac
 */
public class Exercicio073 {

    public static void preencheVetor() {
        int vetor[] = new int[10];
        
        for(int i = 0; i < 10; i++) {
            if(i == 0) {
                vetor[i] = vetor.length - 1;
            } else {
                vetor[i] = vetor.length - (i+1);
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
