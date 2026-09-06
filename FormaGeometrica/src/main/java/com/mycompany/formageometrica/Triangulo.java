package com.mycompany.formageometrica;

public class Triangulo extends Geometria {
    private int base;
    private int altura;    
    private double ladoA;
    private double ladoB;
    private double ladoC;
    
    public Triangulo(int base, int altura, String cor, boolean preenchido, int numLados) {
        super(cor, preenchido, numLados);
        
        if (this.validarBase(base)) {
            this.base = base;
        }
        if (this.validarAltura(altura)) {
            this.altura = altura;
        }
    }
    
    public void setBase(int base) {
        if (this.validarBase(base)) {
            this.base = base;
        }
    }
    
    public void setAltura(int altura) {
        if (this.validarAltura(altura)) {
            this.altura = altura;
        }
    }
    
    public int getBase() {
        return base;
    }
    
    public int getAltura() {
        return altura;
    }
    
    public double getLadoA() {
        return ladoA;
    }

    public void setLadoA(double lado) {
        this.ladoA = lado;
    }
    
    public double getLadoB() {
        return ladoB;
    }

    public void setLadoB(double lado) {
        this.ladoB = lado;
    }
    
    public double getLadoC() {
        return ladoC;
    }

    public void setLadoC(double lado) {
        this.ladoC = lado;
    }
    
    public void setLados(double ladoA, double ladoB, double ladoC){
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }
    
    public float calcArea() {
        return (float) (this.base * this.altura) / 2;
    }
    
    public void classificacaoTriangulo() {
        if (this.ladoA == this.ladoB && this.ladoB == this.ladoC) {
            System.out.println("Triângulo equilátero");
        } else if (this.ladoA == this.ladoB || this.ladoA == this.ladoC || this.ladoB == this.ladoC) {
            System.out.println("Triângulo isósceles");
        } else {
            System.out.println("Triângulo escaleno");
        }
    }

    private boolean validarBase(int base) {
        if (base > 0) {
            return true;
        }
        System.out.println("A base deve ser maior que 0");
        return false;
    }

    private boolean validarAltura(int altura) {
        if (altura > 0) {
            return true;
        }
        System.out.println("A altura deve ser maior que 0");
        return false;
    }
}