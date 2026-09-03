package com.mycompany.pessoa;
import java.time.LocalDate;

/*
 Exercício
● Criem uma aplicação com uma classe Pessoa que possua os seguintes atributos:
○ Nome, CPF e Data Nascimento
● Junto dessa classe, crie uma classe Endereço com os atributos:
○ CEP, Rua, Cidade e Número
● Faça que todos esses dados sejam solicitados ao usuário e no final, ligue as 2 classes.
● Por fim, imprima as informações na tela utilizando métodos das classes para pegar
as informações
 */

public class Pessoa {

    private String nome;
    private String CPF;
    private LocalDate dataNascimento;

    public Pessoa(String nome, String CPF, LocalDate dataNascimento) {
        this.nome = nome;
        this.CPF = CPF;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    
}
