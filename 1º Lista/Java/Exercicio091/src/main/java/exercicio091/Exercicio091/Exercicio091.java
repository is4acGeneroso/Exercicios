/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package exercicio091.Exercicio091;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author isaac
 */
public class Exercicio091 {

    public static int numero[] = new int[2];
    public static String msg = null;
    
    public static void preencheVetor() {
        Scanner scanner = new Scanner(System.in);
        Arrays.fill(numero, 0);
        
        for(int i = 0; i < numero.length; i++) {
            System.out.format("DIGITE O %dº NUMERO: ", i+1);
            numero[i] = scanner.nextInt();
        }
    }  
    
    public static void comparaNumeros() {
        if(numero[0] == numero[1]) {
            msg = "NUMEROS IGUAIS";
        } else if(numero[0] > numero[1]) {
            msg = "O NUMERO " + Integer.toString(numero[0]) + " É O MAIOR";
        } else {
            msg = "O NUMERO " + Integer.toString(numero[1]) + " É O MAIOR";
        }
    }
    
    public static void exibicao() {
        System.out.format("\n%s", msg);
    }
    
    public static void main(String[] args) {
        preencheVetor();
        comparaNumeros();
        exibicao();
    }
}
