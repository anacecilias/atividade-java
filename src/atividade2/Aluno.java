//  2. Crie uma classe Avaliação, contendo o aluno e 2 notas
//
//e Aluno, contendo nome e matrícula. Elas podem:
//
//a. Calcular a nota média do aluno.
//
//b. Verificar se foi aprovado.
//
//c. Exibir o boletim(exibir os dados do aluno junto das
//
//notas, média e se foi aprovado)

package atividade2;

public class Aluno {
    private String nome;
    private String matricula;

    public Aluno(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

}
