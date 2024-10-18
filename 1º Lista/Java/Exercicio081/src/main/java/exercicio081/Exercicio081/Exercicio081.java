/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package exercicio081.Exercicio081;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author isaac
 */
public class Exercicio081 {
    
    public static String nome[] = new String[8];
    public static int idade[] = new int[nome.length];
    public static int media = 0;
    public static int posicao[] = new int[nome.length];
    public static int maiorIdade = 0;
    public static int posicaoMaiorIdade[] = new int[nome.length];
    
    public static void preencheInformacoes() {
        Scanner scanner = new Scanner(System.in);
        
        for(int i = 0; i < 8; i++) {
            System.out.format("USUARIO %d\n", i+1);
            System.out.print("DIGITE SEU NOME: ");
            nome[i] = scanner.next();
            System.out.print("DIGITE SUA IDADE: ");
            idade[i] = scanner.nextInt();
        
            System.out.println("");
        }
    }
    
    public static void calcMedia() {
        int somatorioIdade = 0;
        
        for(int x : idade) {
            somatorioIdade += x;
        }
        
        media = somatorioIdade/8;
    }
    
    public static void encontraPosicao() {
        for(int i = 0; i < 8; i++) {
            if(idade[i] > 25) {
                posicao[i] = i+1;
            }
        }
    }
    
    public static void encontraMaiorIdade() {
        for(int i = 0; i < 8; i++) {
            if(i == 0) {
                maiorIdade = idade[i];
                posicaoMaiorIdade[i] = i+1;
            } else {
                if(idade[i] > maiorIdade) {
                    maiorIdade = idade[i];
                    posicaoMaiorIdade[i] = i+1;
                }
            }
        }
    }
    
    public static void exibicao() {
        System.out.format("MEDIA DE IDADE DAS PESSOAS CADASTRADAS: %d\n", media);
        System.out.print("POSICAO COM IDADE MAIOR 25 ANOS: ");
        for(int x : posicao) {
            if(x > 0) {
                System.out.format("%d ", x);
            }
        }
        System.out.format("\nMAIOR IDADE DIGITADA: %d\n", maiorIdade);
        System.out.print("POSICAO COM A MAIOR IDADE: ");
        for(int i = 0; i < 8; i++) {
            if(maiorIdade == idade[i]) {
                System.out.format("%d ", posicaoMaiorIdade[i]);
            }
        }
    }
    
    public static void main(String[] args) {
        Arrays.fill(nome, null);
        Arrays.fill(idade, 0);
        
        preencheInformacoes();
        calcMedia();
        encontraPosicao();
        encontraMaiorIdade();
        exibicao();
    }
}
