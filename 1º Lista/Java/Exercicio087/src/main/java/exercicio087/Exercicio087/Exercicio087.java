/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package exercicio087.Exercicio087;

import java.util.Scanner;

/**
 *
 * @author isaac
 */
public class Exercicio087 {

    public static String mensagem = null;
    
    public static void gerador(String mensagem) {
        System.out.println("+-----------=====-------+");
        System.out.format("%s\n", mensagem.toUpperCase());
        System.out.println("+-----------=====-------+");
    }
    
    public static void solicitaMensagem() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("DIGITE ALGO: ");
        mensagem = scanner.nextLine();
    }
    
    public static void main(String[] args) {
        solicitaMensagem();
        gerador(mensagem);
    }
}
