package com.mycompany.pessoa;

/*
 Exercício
● Criem uma aplicação com uma classe Pessoa que possua os seguintes atributos:
○ Nome, CPF e Data Nascimento
● Junto dessa classe, crie uma classe Endereco com os atributos:
○ CEP, Rua, Cidade e Número
● Faça que todos esses dados sejam solicitados ao usuário e no final, ligue as 2 classes.
● Por fim, imprima as informações na tela utilizando métodos das classes para pegar
as informações
 */

public class Endereco {
    private String CEP;
    private String rua;
    private String cidade;
    private int numero;

    public Endereco(String CEP, String rua, String cidade, int numero) {
        this.CEP = CEP;
        this.rua = rua;
        this.cidade = cidade;
        this.numero = numero;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
}
