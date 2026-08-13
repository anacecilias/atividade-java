package atividade2;

public class Main {
    public static void main(String[] args) {
        // cria o aluno
        Aluno aluno1 = new Aluno("Fulano","328932");

        Avaliacao  avaliacao1 = new Avaliacao(aluno1, 8.0, 9.0);

        avaliacao1.exibirBoletim();

    }
}