/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package exercicio061.Exercicio061;

/**
 *
 * @author isaac
 */
public class Exercicio061 {
    public static void contagem() {
        int i = 0;
        
        do {
            System.out.print(i + " ");
            i += 3;
        } while(i <= 30);
    }
    
    public static void main(String[] args) {
        contagem();
        System.out.println("ACABOU!");
    }
}
