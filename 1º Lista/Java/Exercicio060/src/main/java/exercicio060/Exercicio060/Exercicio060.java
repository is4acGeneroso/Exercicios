/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package exercicio060.Exercicio060;

import java.util.*;

/**
 *
 * @author isaac
 */
public class Exercicio060 {
    public static int maiorIdade = 0;
    public static String nomePessoaMaisVelha = null;
    public static String mulherMaisJovem = null;
    public static int menorIdade = 0;
    
    public static void encontraPessoaMaisVelha(int idade, String nome) {
        if(nomePessoaMaisVelha == null) {
            maiorIdade = idade;
            nomePessoaMaisVelha = nome; 
        } else if(idade > maiorIdade) {
            maiorIdade = idade;
            nomePessoaMaisVelha = nome;
        }
    }
    
    public static void encontraMulherMaisJovem(int idade, String nome) {
        if(mulherMaisJovem == null) {
            menorIdade = idade;
            mulherMaisJovem = nome;
        } else if(idade < menorIdade) {
            menorIdade = idade;
            mulherMaisJovem = nome;
        }
    }
    
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       int i = 0; 
       int idade = 0; 
       int sexo = 0;
       String nome = null; 
       
       String resposta = null;
       int somadorIdade = 0;
       int mediaGrupo = 0;
       int somaIdade30 = 0;
       int somaIdade18 = 0;
       
       do {
            //AREA DE EXIBICAO
            i++;
            System.out.format("USUARIO %d\n", i);
            System.out.print("DIGITE O NOME: ");
            nome = scanner.next();
            System.out.print("DIGITE SUA IDADE: ");
            idade = scanner.nextInt();
            System.out.print("[1]HOMEM\n[2]MULHER\nDIGITE SEU SEXO: ");
            sexo = scanner.nextInt();
            
            System.out.println("QUER CONTINUA[S/N]: ");
            resposta = scanner.next();
            
            System.out.println("");
            
            //AREA DE PROCESSAMENTO DE INFORMACOES
            encontraPessoaMaisVelha(idade, nome);
            somadorIdade += idade;
            
            if(sexo == 2) {
                encontraMulherMaisJovem(idade, nome);
            }
            
            if(sexo == 2 && idade < 18) {
                somaIdade18++;
            }
            
            if(sexo == 1 && idade > 30) {
                somaIdade30++;
            }
       } while(!resposta.toUpperCase().equals("N"));
       
       mediaGrupo = somadorIdade/i;

       //EXIBICAO
       System.out.println("");
       System.out.format("PESSOA MAIS VELHA: %s\n", nomePessoaMaisVelha);
       System.out.format("MULHER MAIS JOVEM: %s\n", mulherMaisJovem);
       System.out.format("MEDIA IDADE DO GRUPO: %d\n", mediaGrupo);
       System.out.format("HOMENS COM MAIS DE 30 ANOS: %d\n", somaIdade30);
       System.out.format("MULHERES MENORES DE 18 ANOS: %d\n", somaIdade18);
    }
}
