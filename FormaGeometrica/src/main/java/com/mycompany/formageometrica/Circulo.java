package com.mycompany.formageometrica;

public class Circulo extends Geometria{
    public double raio;
    public final double pi = 3.14;
    
    public Circulo(double raio, String cor, boolean preenchido, int numLados){
        super(cor, preenchido, numLados);
        this.raio = raio;
    }
    
    public double getRaio(){
        return raio;
    }
    
    public void setRaio(double raio){
        this.raio = raio;
    }
    
    public double calcArea(){
        return pi * (raio*raio);
    }
}
