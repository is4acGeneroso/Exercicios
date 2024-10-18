/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package exercicio096.Exercicio096;

import java.util.Scanner;

/**
 *
 * @author isaac
 */
public class Exercicio096 {

    public static float nota[] = new float[2];
    public static float media = 0f;
    
    public static void preencheNota() {
        Scanner scanner = new Scanner(System.in);
        
        for(int i = 0; i < 2; i++) {
            System.out.format("DIGITE A %dº NOTA: ", i+1);
            nota[i] = scanner.nextFloat();
        }
    }
    
    public static float calcMedia(float nota1, float nota2) {
        float resultado = 0;
        
        resultado = (nota1 + nota2) / 2;
        
        return resultado;
    }
    
    public static void exibicao() {
        System.out.format("MEDIA DO ALUNO %.2f", media);
    }
    
    public static void main(String[] args) {
        preencheNota();
        media = calcMedia(nota[0], nota[1]);
        exibicao();
       
    }
}
