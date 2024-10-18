/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package exercicio063.Exercicio063;

import java.util.*;

/**
 *
 * @author isaac
 */
public class Exercicio063 {

    public static int menorValor;
    public static int somaPar;
    
    public static void verificaMenorValor(int numero) {
        if(menorValor == 0) {
            menorValor = numero;
        } else if(numero < menorValor) {
            menorValor = numero;
        }
    }
    
    public static void verificaPar(int numero) {
        if(numero % 2 == 0) {
            somaPar++;
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String resposta = null;
        int numero = 0;
        
        int somatorio = 0;
        int contLoop = 0;
        int media = 0;
        
        do {
            contLoop++;
            System.out.print("DIGITE UM NUMERO: ");
            numero = scanner.nextInt();
            
            somatorio += numero;
            verificaMenorValor(numero);
            verificaPar(numero);
            
            System.out.print("QUER CONTINUAR[S/N]: ");
            resposta = scanner.next();
            System.out.println("");
        } while(!resposta.toUpperCase().equals("N"));
        
        media = somatorio/contLoop;
        
        System.out.format("\nSOMATORIO: %d\n", somatorio);
        System.out.format("MENOR VALOR DIGITADO: %d\n", menorValor);
        System.out.format("MEDIA: %d\n", media);
        System.out.format("QUANTIDADE VALOR PAR: %d", somaPar);
    }
}
