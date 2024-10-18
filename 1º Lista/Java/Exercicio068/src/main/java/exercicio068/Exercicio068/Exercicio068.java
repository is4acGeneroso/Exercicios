/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package exercicio068.Exercicio068;

import java.util.*;

/**
 *
 * @author isaac
 */
public class Exercicio068 {

    public static float maiorPesoHomem = 0f;
    
    public static void maiorPesoHomem(float peso) {
        if(maiorPesoHomem == 0f) {
            maiorPesoHomem = peso;
        } else if(peso > maiorPesoHomem) {
            maiorPesoHomem = peso;
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sexo = 0;
        float peso = 0f;
        
        int contMulher = 0;
        int contObeso = 0;
        float somaPesoM = 0f;
        float mediaPesoMulher = 0f;
        
        for(int i = 0; i < 8; i++) {
            System.out.format("USUARIO %d\n", i+1);
            System.out.print("[1]HOMEM\n[2]MULHER\nDIGITE UM NUMERO: ");
            sexo = scanner.nextInt();
            System.out.print("PESO: kg");
            peso = scanner.nextFloat();
            
            if(sexo == 1 && peso > 100) {
                contObeso++;
            }
            
            if(sexo == 1) {
                maiorPesoHomem(peso);
            }
            
            if(sexo == 2) {
                contMulher++;
                somaPesoM += peso;
            }
            
            System.out.println("");
        }
        
        mediaPesoMulher = somaPesoM/contMulher;
        
        System.out.format("\nMULHERES CADASTRADAS: %d\n", contMulher);
        System.out.format("HOMENS COM MAIS DE 100kg: %d\n", contObeso);
        System.out.format("MEDIA DE PESO ENTRE AS MULHERES: %.2f\n", mediaPesoMulher);
        System.out.format("MAIOR PESO ENTRE OS HOMENS: %.2f", maiorPesoHomem);
    }
}
