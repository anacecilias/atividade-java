package com.mycompany.avaliacaoaluno;

/*
Crie uma classe Avaliação, contendo o aluno e 2 notas
e Aluno, contendo nome e matrícula. Elas podem:
a. Calcular a nota média do aluno.
b. Verificar se foi aprovado.
c. Exibir o boletim(exibir os dados do aluno junto das
notas, média e se foi aprovado)
 */

public class Main {

    public static void main(String[] args) {
    Aluno aluno1 = new Aluno("Fulano","328932");

    Avaliacao  avaliacao1 = new Avaliacao(aluno1, 8.0, 9.0);

    avaliacao1.exibirBoletim();

    }
}