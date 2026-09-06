package com.mycompany.formageometrica;
import java.util.Scanner;

public class FormaGeometrica {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        float resultado;
        
        System.out.println("Digite 1 para quadrado \n Digite 2 para retângulo \n Digite 3 para triângulo");
        int num = scanner.nextInt();
        
        if(num == 1){
            System.out.println("Digite o lado: ");
            int lado = scanner.nextInt();
            
            Quadrado quadrado = new Quadrado(lado, "Vermelho", true, 3);
            
            resultado = quadrado.calcArea();
            
        }else{
            
            System.out.println("Digite a base: ");
            int base = scanner.nextInt();
            
            System.out.println("Digite a altura: ");
            int altura = scanner.nextInt();
            
            if(num == 2){
                
                Retangulo retangulo = new Retangulo(base, altura, "Vermelho", true, 3);
                resultado = retangulo.calcArea();
                
            }else{
                
                Triangulo triangulo = new Triangulo(base, altura, "Vermelho", true, 3);
                resultado = triangulo.calcArea();
                
            }
        }
        
        System.out.println("A área é: " + resultado);
        
    }
}
