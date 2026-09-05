/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aluno;

/**
 *
 * @author ana
 */
public class Main {

    public static void main(String[] args) {
    Aluno aluno1 = new Aluno("Aluno");
        
        aluno1.cadastrarNota(1, 9.0);
        aluno1.cadastrarNota(2, 6.5);
        aluno1.cadastrarNota(3, 7.5);
        aluno1.cadastrarNota(4, 8.0);
        
        aluno1.exibirBoletim();
    }
}
