package com.mycompany.boletim;

/*
Criem uma classe que representa um boletim escolar. Identifiquem 2
atributos que devem ser privados e não podem ser alterados livremente.
● Criem métodos para atribuir esses valores com validações para que não
tenha dados incorretos
*/

public class AtividadeBoletim {
    private String matriculaAluno;
    private int notaMedia;

    public AtividadeBoletim(String matriculaAluno, int notaMedia) {
        this.matriculaAluno = matriculaAluno;
        this.notaMedia = notaMedia;
    }

    public String getMatriculaAluno() {
        return matriculaAluno;
    }

    public void setMatriculaAluno(String matriculaAluno) {
        if(matriculaAluno == null || matriculaAluno.trim().isEmpty()){
            throw new IllegalArgumentException("A matrícula do aluno não pode estar vazia");
        }
        else if(!matriculaAluno.matches("\\d{9}")){
            throw new IllegalArgumentException("A matrícula deve conter exatamente 9 dígitos");
    }else{
         this.matriculaAluno = matriculaAluno;           
        }
    }

    public int getNotaMedia() {
        return notaMedia;
    }

    public void setNotaMedia(int notaMedia) {
        if(notaMedia < 0 || notaMedia > 10){
            throw new IllegalArgumentException("A nota deve estar entre 0 e 10");
        }else{
        this.notaMedia = notaMedia;           
        }
    }
}
