/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package exercicio093.Exercicio093;

import java.util.Scanner;

/**
 *
 * @author isaac
 */
public class Exercicio093 {

    public static int inicio = 0;
    public static int fim = 0;
    public static int incremento = 0;
    
    public static void preencheIndices() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("DIGITE O INICIO DA CONTAGEM: ");
        inicio = scanner.nextInt();
        System.out.print("DIGITE O FIM DA CONTAGEM: ");
        fim = scanner.nextInt();
        System.out.print("DIGITE O INCREMENTO DA CONTAGEM: ");
        incremento = scanner.nextInt();
    }
    
    public static void contador() {
        System.out.println("");
        
        for(int i = inicio; i <= fim; i += incremento) {
            System.out.format("%d >> ", i);
        }
        
        System.out.print("FIM");
    }
    
    public static void main(String[] args) {
        preencheIndices();
        contador();
    }
}
