package com.mycompany.formageometrica;

public class Quadrado extends Geometria{
    
    public int lado;
    
    public Quadrado(int lado, String cor, boolean preenchido, int numLados){
        super(cor, preenchido, numLados);
        this.lado = lado;
    }
    
    public int getLado(){
        return lado;
    }
    
    public void setLado(int lado){
        if(lado>0){
            this.lado = lado;
            return;
    }    
        System.out.println("Lado deve ser maior que 0");
    }
    
    public int calcArea(){
        return this.lado * this.lado;
    }
}
