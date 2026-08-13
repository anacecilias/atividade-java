package atividade2;

public class Avaliacao { // tirei o acento pra evitar bug
    private Aluno aluno;
    private double nota1;
    private double nota2;

    // AQUI O AJUSTE: Adicionei double nota1, double nota2 dentro dos parênteses!
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