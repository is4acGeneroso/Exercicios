package com.mycompany.exercicio010;

public class Exercicio010 {

    public static void main(String[] args) {
        Livro livro1 = new Livro("O mestre dos magos", "Ismael Ramires", 300);
        Biblioteca biblioteca = new Biblioteca("Isaac");
        biblioteca.armazenarLivro(livro1);
        System.out.println(biblioteca.verificarDisponibilidade("O mestre dos magos"));
        biblioteca.emprestarLivro();
    }
}
