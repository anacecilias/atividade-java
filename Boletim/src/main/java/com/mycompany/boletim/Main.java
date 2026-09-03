package com.mycompany.boletim;
import java.util.Scanner;
/*
Criem uma classe que representa um boletim escolar. Identifiquem 2
atributos que devem ser privados e não podem ser alterados livremente.
● Criem métodos para atribuir esses valores com validações para que não
tenha dados incorretos
*/

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Insira a matrícula do aluno");
        String matriculaAluno = scanner.nextLine();
        
        System.out.println("Insira a nota média do aluno");
        int notaMedia = scanner.nextInt();
        
        AtividadeBoletim boletim = new AtividadeBoletim(matriculaAluno, notaMedia);
        
        System.out.println("Matricula: " + boletim.getMatriculaAluno());
        System.out.println("Média geral: " + boletim.getNotaMedia());
        
        scanner.close();
    }
    
}
