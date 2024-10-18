package com.mycompany.exercicio007;

public class Triangulo {
    private int a;
    private int b;
    private int c;
    private boolean formaTriangulo;
    private double areaTriangulo;
    
    public Triangulo(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public boolean verificaTriangulo() {
        int[] lado = new int[3];
        lado[0] = this.getA();
        lado[1] = this.getB();
        lado[2] = this.getC();
        
        boolean triangulo = false;
        
        if(lado[0] < lado[1] + lado[2] &&
            lado[1] < lado[0] + lado[2] &&
            lado[2] < lado[0] + lado[1]) {
            triangulo = true;
        } else {
            triangulo = false;
        }
        
        this.setFormaTriangulo(triangulo);
        return isFormaTriangulo();
    }
    
    public double calcularAreaTriangulo() {
        int[] lado = new int[3];
        lado[0] = this.getA();
        lado[1] = this.getB();
        lado[2] = this.getC();
        
        int perimetro = 0;
        
        perimetro = (lado[0] + lado[1] + lado[2]) / 2;
        
        this.setAreaTriangulo(Math.sqrt(perimetro * (perimetro - lado[0]) * (perimetro - lado[1]) * (perimetro - lado[2])));
        return this.getAreaTriangulo();
    }
    
    //Metodos Acessores
    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public boolean isFormaTriangulo() {
        return formaTriangulo;
    }

    public void setFormaTriangulo(boolean formaTriangulo) {
        this.formaTriangulo = formaTriangulo;
    }

    public double getAreaTriangulo() {
        return areaTriangulo;
    }

    public void setAreaTriangulo(double areaTriangulo) {
        this.areaTriangulo = areaTriangulo;
    }
}
