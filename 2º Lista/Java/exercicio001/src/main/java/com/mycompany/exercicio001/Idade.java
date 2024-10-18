package com.mycompany.exercicio001;

public class Idade {
    private int idadeAnos;
    private int idadeMeses;
    private int idadeDias;
    
    public Idade(int anos, int meses, int dias) {
        this.idadeAnos = anos;
        this.idadeMeses = meses;
        this.idadeDias = dias;
    }
    
    public void transformarDias() {
        int diasAnos = this.idadeAnos * 365;
        int diasMeses = this.idadeMeses * 30;
        int dias = this.idadeDias;
        
        int somaTotalDias = diasAnos + diasMeses + dias;
        
        System.out.print(String.format("%d dias", somaTotalDias));
    }
}
