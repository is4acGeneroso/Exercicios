/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package exercicio065.Exercicio065;

/**
 *
 * @author isaac
 */
public class Exercicio065 {

    public static void contagem() {
        for(int i = 100; i >= 0; i -= 10) {
            System.out.print(i + " ");
        }
    }
    
    public static void main(String[] args) {
        contagem();
        System.out.print("ACABOU!");
    }
}
