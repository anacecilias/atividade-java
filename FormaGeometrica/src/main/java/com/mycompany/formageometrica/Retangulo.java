package com.mycompany.formageometrica;

public class Retangulo extends Geometria {
    
    private int base;
    private int altura;
    
    public Retangulo(int base, int altura, String cor, boolean preenchido, int numLados) {
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
    
    public int calcArea() {
        return this.base * this.altura;
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