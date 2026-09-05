package com.mycompany.avaliacaoaluno;

/*
Crie uma classe Avaliação, contendo o aluno e 2 notas
e Aluno, contendo nome e matrícula. Elas podem:
a. Calcular a nota média do aluno.
b. Verificar se foi aprovado.
c. Exibir o boletim(exibir os dados do aluno junto das
notas, média e se foi aprovado)
 */

public class Avaliacao {
    private Aluno aluno;
    private double nota1;
    private double nota2;

    public Avaliacao(Aluno aluno, double nota1, double nota2) {
        this.aluno = aluno;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    // calcula a media do aluno
    public double CalcularMedia() {
        return (this.nota1 + this.nota2) / 2;
    }

    // ver se ele foi aprovado
    public boolean verificarAprovacao() {
        return CalcularMedia() >= 7.0;
    }

    // mostra td o boletim
    public void exibirBoletim() {
        System.out.println("Nome: " + this.aluno.getNome());
        System.out.println("Matricula: " + this.aluno.getMatricula());
        System.out.println("Nota 1: " + this.nota1);
        System.out.println("Nota 2: " + this.nota2);
        System.out.println("Media: " + this.CalcularMedia());
        System.out.println("Aprovacao: " + this.verificarAprovacao());
    }
}