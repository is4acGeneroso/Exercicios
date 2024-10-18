/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package exercicio080.Exercicio080;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author isaac
 */
public class Exercicio080 {

    public static int numero[] = new int[30];
    public static int posicaoNumero[] = new int[numero.length];
    public static int contRepeticao = 0;
    
    public static void preencheVetor() {
        Random random = new Random();
        for(int i = 0; i < 30; i++) {
            int numeroSorteado = random.nextInt(15) + 1;
            numero[i] = numeroSorteado;
        }
    }
    
    public static void encontraNumero(int palpite) {
        for(int i = 0; i < numero.length; i++) {
            if(palpite == numero[i]) {
                posicaoNumero[i] = i;
                contRepeticao++;
            }
        }
    }
    
    public static void exibicao() {
        for(int x : numero) {
            System.out.print(x + " ");
        }
        
        System.out.println("");
        
        for(int i = 0; i < numero.length; i++) {
            if(posicaoNumero[i] != 0) {
                System.out.print(posicaoNumero[i] + " ");
            }
        }
        System.out.format("\nQUANTIDADE DE NUMERO ENCONTRADO: %d", contRepeticao);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int palpite = 0;
        Arrays.fill(numero, 0);
        Arrays.fill(posicaoNumero, 0);
        
        preencheVetor();
        
        System.out.print("DIGITE SEU PALPITE: ");
        palpite = scanner.nextInt();
        
        encontraNumero(palpite);
        
        if(contRepeticao > 0) {
            exibicao();
        } else {
            System.out.print("\nNUMERO NAO ENCONTRADO!!!");
        }
    }
}
