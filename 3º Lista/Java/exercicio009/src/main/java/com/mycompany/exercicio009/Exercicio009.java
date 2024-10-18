package com.mycompany.exercicio009;

public class Exercicio009 {

    public static void main(String[] args) {
        Paciente paciente1 = new Paciente("Isaac", 20);
        paciente1.adicionarNovaConsulta("Otorrino");
        paciente1.adicionarNovaConsulta("Dermato");
        paciente1.adicionarNovaConsulta("Gastro");
        System.out.println(paciente1.toString());
    }
}
