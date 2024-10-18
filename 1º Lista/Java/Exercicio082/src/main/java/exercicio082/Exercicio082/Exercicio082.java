/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package exercicio082.Exercicio082;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author isaac
 */
public class Exercicio082 {
    
    public static float nota[] = new float[10];
    public static float somatorioNotas = 0f;
    public static float media = 0f;
    public static int contAprovacao = 0;
    public static float maiorNota = 0f;
    public static int posicaoMaiorNota[] = new int[nota.length];
    
    public static void preencheNotas() {
        Scanner scanner = new Scanner(System.in);
        
        for(int i = 0; i < 10; i++) {
            System.out.format("ALUNO: %d\n", i+1);
            System.out.print("DIGITE SUA NOTA: ");
            nota[i] = scanner.nextFloat();
            
            System.out.println("");
        }
    }
    
    public static void mediaTurma() {
        for(float x : nota) {
            somatorioNotas += x;
        }
        
        media = somatorioNotas/10;
    }
    
    public static void alunosAcimaMedia() {
        for(float x : nota) {
            if(x > media) {
                contAprovacao++;
            }
        }
    }
    
    public static void maiorNotaDigitada() {
        for(int i = 0; i < 10; i++) {
            if(i == 0) {
                maiorNota = nota[i];
                posicaoMaiorNota[i] = i+1;
            } else if(nota[i] >= maiorNota) {
                maiorNota = nota[i];
                posicaoMaiorNota[i] = i+1;
            }
        }
    }
    
    public static void exibicao() {
        System.out.format("MEDIA DA TURMA: %.2f\n", media);
        System.out.format("QUANTIDADE DE ALUNO ACIMA DA MEDIA: %d\n", contAprovacao);
        System.out.format("MAIOR NOTA DIGITADA: %.2f\n", maiorNota);
        System.out.print("POSICAO DA MAIOR IDADE: ");
        for(int i = 0; i < 10; i++) {
            if(maiorNota == nota[i]) {
                System.out.format("%d ", posicaoMaiorNota[i]);
            }
        }
    }
    
    public static void main(String[] args) {
        Arrays.fill(nota, 0f);
        preencheNotas();
        mediaTurma();
        alunosAcimaMedia();
        maiorNotaDigitada();
        exibicao();
    }
}
