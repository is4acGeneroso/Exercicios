/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package exercicio097.Exercicio097;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author isaac
 */
public class Exercicio097 {

    public static int numero[] = new int[3];
    public static String msg = null;
    public static int maiorNumero = 0;
    
    public static void preencheVetor() {
        Scanner scanner = new Scanner(System.in);
        Arrays.fill(numero, 0);
        
        for(int i = 0; i < numero.length; i++) {
            System.out.format("DIGITE O %dº NUMERO: ", i+1);
            numero[i] = scanner.nextInt();
        }
    }  
    
    public static void comparaNumeros() {
        if(numero[0] == numero[1] && numero[0] == numero[2]) {
            msg = "NUMEROS IGUAIS";
        } else {
            for(int i = 0; i < numero.length; i++) {
                if(i == 0) {
                    maiorNumero = numero[i];
                } else if(numero[i] > maiorNumero) {
                    maiorNumero = numero[i];
                }
            }
        }
    }
    
    public static void exibicao() {
        if (msg != null) {
            System.out.format("\n%s", msg);
        } else {
            System.out.format("O MAIOR NUMERO É: %d", maiorNumero);
        }
    }
    
    public static void main(String[] args) {
        preencheVetor();
        comparaNumeros();
        exibicao();
    }
}
