/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package exercicio098.Exercicio098;

import java.util.Scanner;

/**
 *
 * @author isaac
 */
public class Exercicio098 {

    public static int numero[] = new int[2];
    public static int inicio = 0, fim = 0;
    public static int totSoma = 0;
    
    public static void solicitaNumero() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("DIGITE O INICIO DO INTERVALO: ");
        inicio = scanner.nextInt();
        System.out.print("DIGITE O FINAL DO INTERVALO: ");
        fim = scanner.nextInt();
    }
    
    public static void superSomador() {
        for(int i = inicio; i <= fim; i++) {
            totSoma += i;
        }
    }
    
    public static void exibicao() {
        System.out.format("TOTAL DA SOMA: %d", totSoma);
    }
    
    public static void main(String[] args) {
        solicitaNumero();
        superSomador();
        exibicao();
    }
}
