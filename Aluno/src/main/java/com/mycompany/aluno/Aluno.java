package com.mycompany.aluno;

/*
● Criem uma classe Aluno que possua os seguintes atributos:
○ Nome
○ Notas
● Deve se ter os métodos:
○ cadastrarNota: Recebe o bimestre (de 1 a 4) e a nota. Armazena a nota na posição correspondente do vetor.
○ calcularMedia(): Percorre o vetor de notas e retorna a média aritmética simples do aluno.
○ retornarMaiorNota(): Percorre o vetor e retorna a maior nota obtida pelo aluno.
○ exibirBoletim(): Exibe na tela o nome do aluno, todas as notas cadastradas, a média calculada, a maior nota e a
situação final:
■ "Aprovado" se a média for maior ou igual a 7.0.
■ "Em Recuperação" se a média for menor que 7.0.
*/

public class Aluno {
    private String nome;
    private double[] notas; 

    public Aluno(String nome){
        this.nome = nome;
        this.notas = new double[4];
    }
    
    public void cadastrarNota(int bimestre, double nota){
        if(bimestre >= 1 || bimestre <= 4){
            this.notas[bimestre-1] = nota;
            System.out.println("Você cadastrou a nota " +nota+ " pro " + bimestre + "bimestre");
        }else{
            System.out.println("Apenas do 1 ao 4 bimestre");
        }
    }
    
    public double calcularMedia(){
        double soma = 0;
        for(double nota : this.notas){
            soma += nota;
        }
        return soma / this.notas.length;
    }
    
    public double retornarMaiorNota(){
        double maior = this.notas[0];
        for(int i = 1; i < this.notas.length; i++){
            if(this.notas[i] > maior){
                maior = this.notas[i];
            }
        }
        return maior;
    }
    
    public void exibirBoletim(){
        double media = calcularMedia();
        double maior = retornarMaiorNota();
        
        System.out.println("Aluno: " + this.nome);
        
        for(int i = 1; i < this.notas.length; i++){
            System.out.println((i+1)+ "Bimestre " + this.notas[i]);
        }
        
        System.out.println("Média: " + media);
        System.out.println("Maior nota: " + maior);
        
        if(media >= 7){
            System.out.println("Aprovado");
        }else{
            System.out.println("Em recuperação");
        }
    }
}
