package com.mycompany.soma;
import java.util.Scanner;

/*
● Crie um programa que pedirá ao usuário 2 números e imprimirá a soma dos
números na tela. Faça a soma desses números serem uma função.
 */

public class Soma {
    
    public static double somar(double num1, double num2){
        return num1+num2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o primeiro número");
        double num1 = scanner.nextDouble();
        
        System.out.println("Digite o segundo número");
        double num2 = scanner.nextDouble();
        
        double resultado = somar(num1, num2);
        
        System.out.println("O resultado da soma é" + resultado);
        
        scanner.close();
    }
}
