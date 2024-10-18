/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package exercicio088.Exercicio088;

import java.util.Scanner;

/**
 *
 * @author isaac
 */
public class Exercicio088 {

    public static String mensagem = null;
    public static int limite = 0;
    
    public static void gerador(String mensagem, int limite) {
        System.out.println("+-----------=====-------+");
        for(int i = 0; i < limite; i++) {
            System.out.format("%s\n", mensagem.toUpperCase());
        }
        System.out.println("+-----------=====-------+");
    }
    
    public static void solicitaMensagem() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("DIGITE ALGO: ");
        mensagem = scanner.nextLine();
        
        System.out.print("QUANTAS VEZES DESEJA QUE A MENSAGEM APARECA? ");
        limite = scanner.nextInt();
    }
    
    public static void main(String[] args) {
        solicitaMensagem();
        gerador(mensagem, limite);
    }
}
