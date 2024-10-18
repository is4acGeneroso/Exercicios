/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package exercicio094.Exercicio094;

import java.util.Scanner;

/**
 *
 * @author isaac
 */
public class Exercicio094 {

    public static int qtdTermo = 0;
    
    public static void solicitaQtdTermo() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("DIGITE A QUANTIDADE DE TERMOS QUE DESEJA EXIBIR: ");
        qtdTermo = scanner.nextInt();
    }
    
    public static void fibonacci(int qtdT) {
        int t1 = -1, t2 = 1, t3 = t1 + t2;
        
        System.out.println("");
        
        for(int i = 0; i < qtdT; i++) {
            System.out.format("%d ", t3);
            t1 = t2;
            t2 = t3; 
            t3 = t1 + t2;
        }
    }
    
    public static void main(String[] args) {
        solicitaQtdTermo();
        fibonacci(qtdTermo);
    }
}
