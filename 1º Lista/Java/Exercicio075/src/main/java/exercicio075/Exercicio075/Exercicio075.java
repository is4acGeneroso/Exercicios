/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package exercicio075.Exercicio075;

import java.util.*;

/**
 *
 * @author isaac
 */
public class Exercicio075 {

    public static int t1 = -1;
    public static int t2 = +1;
    public static int t3 = 0;
    
    public static int contF() {
        t3 = t1 + t2;
        t1 = t2;
        t2 = t3;
        
        return t3;
    }
    
    public static void main(String[] args) {
        int vetorFibonacci[] = new int[15];
        Arrays.fill(vetorFibonacci, 0);
        
        for(int i = 0; i < 15; i++) {
            vetorFibonacci[i] = contF();
        }
        
        for(int x : vetorFibonacci) {
            System.out.print(x + " ");
        }
    }
}
