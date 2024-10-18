/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package exercicio089.Exercicio089;

import java.util.Scanner;

/**
 *
 * @author isaac
 */
public class Exercicio089 {

    public static String mensagem = null;
    public static int limite = 0;
    public static int opcaoBorda = 0;
    public static String borda = null;
    
    public static void gerador(String mensagem, int limite, String borda) {
        System.out.println(borda);
        for(int i = 0; i < limite; i++) {
            System.out.format("%s\n", mensagem.toUpperCase());
        }
        System.out.print(borda);
    }
    
    public static void solicitaAlteracoes() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("DIGITE ALGO: ");
        mensagem = scanner.nextLine();
        
        System.out.print("QUANTAS VEZES DESEJA QUE A MENSAGEM APARECA? ");
        limite = scanner.nextInt();
        
        do {
            System.out.println("+------------========---------+ [1]");
            System.out.println("~~~~~~~~~~::::~~~~~~~~~~~~~~~~~ [2]");
            System.out.println("<<<<<<<<<----------->>>>>>>>>>> [3]");
            System.out.print("ESCOLHA UMA BORDA: ");
            opcaoBorda = scanner.nextInt();
            
            System.out.println("");
        } while(opcaoBorda < 1 || opcaoBorda > 3);
        
        switch(opcaoBorda) {
            case 1:
                borda = "+------------========---------+";
                break;
            case 2:
                borda = "~~~~~~~~~~::::~~~~~~~~~~~~~~~~~";
            break;
            case 3:
                borda = "<<<<<<<<<----------->>>>>>>>>>>";
            break;
        }
    }
    
    public static void main(String[] args) {
        solicitaAlteracoes();
        gerador(mensagem, limite, borda);
    }
}
