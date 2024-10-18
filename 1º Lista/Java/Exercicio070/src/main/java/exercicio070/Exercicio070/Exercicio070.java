/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package exercicio070.Exercicio070;

/**
 *
 * @author isaac
 */
public class Exercicio070 {

    public static void main(String[] args) {
        int t1 = -1;
        int t2 = +1;
        int t3 = t1 + t2;
        
        for(int i = 0; i < 10; i++) {
            t1 = t2;
            t2 = t3;
            t3 = t1 + t2;
        
            System.out.println(t3 + " ");
        }
    }
}
