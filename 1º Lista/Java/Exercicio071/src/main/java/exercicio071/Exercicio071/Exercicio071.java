/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package exercicio071.Exercicio071;

import java.util.Arrays;

/**
 *
 * @author isaac
 */
public class Exercicio071 {

    public static void main(String[] args) {
        int vetor[] = new int[8];
        Arrays.fill(vetor, 999);
        
        for(int x : vetor) {
            System.out.print(x + " ");
        }
    }
}
