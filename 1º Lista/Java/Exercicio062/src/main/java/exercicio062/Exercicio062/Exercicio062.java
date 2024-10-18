/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package exercicio062.Exercicio062;

import java.util.*;

/**
 *
 * @author isaac
 */
public class Exercicio062 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int idade = 0;
        String resposta = null;
        
        int contIdade = 0;
        int somaIdade = 0;
        int mediaIdade = 0;
        int maioridade = 0;
        
        do {
            contIdade++;
            System.out.print("DIGITE SUA IDADE: ");
            idade = scanner.nextInt();
            
            somaIdade += idade;
            
            if(idade > 21) {
                maioridade++;
            }
            
            System.out.print("QUER CONTINUAR[S/N]: ");
            resposta = scanner.next();
            
            System.out.println("");
        } while(!resposta.toUpperCase().equals("N"));
        
        mediaIdade = somaIdade/contIdade;
        
        System.out.format("\nIDADES DIGITADAS: %d\n", contIdade);
        System.out.format("MEDIA: %d\n", mediaIdade);
        System.out.format("PESSOAS COM MAIS DE 21 ANOS: %d", maioridade);
    }
}
