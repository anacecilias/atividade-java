package com.mycompany.clientebanco;

/*
 Exercício
● Criem uma aplicação com uma classe Cliente que possua os seguintes atributos:
○ Nome e CPF
● Junto dessa classe, crie uma classe Conta Bancária com os atributos:
○ Número da Conta, Saldo e Titular
● Adicione na Conta Bancária métodos para realizar as seguintes operações:
○ Depositar, Sacar, Transferir e Exibir Extrato
● Por fim, instancie 2 contas, associe aos seus clientes e teste o uso de todos os
métodos.
 */

public class Cliente {
    public String nome;
    public String cpf;

    // Construtor
    public Cliente(String nome, String cpf) {
        this.nome = nome; 
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return cpf;
    }

    public void setCPF(String cpf) {
        this.cpf = cpf;
    }
}