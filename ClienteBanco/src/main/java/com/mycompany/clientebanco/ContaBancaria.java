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

public class ContaBancaria {
    private int numeroConta;
    private double saldoConta;
    private Cliente titularConta;

    public ContaBancaria(int numeroConta, double saldoConta, Cliente titularConta) {
        this.numeroConta = numeroConta;
        this.saldoConta = saldoConta;
        this.titularConta = titularConta;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            this.saldoConta += valor; 
            System.out.println("Foi depositado " + valor + " reais na sua conta");
        } else {
            System.out.println("Depósito não válido.");
        }
    }
    
    public void sacar(double valor) {
        if (valor > 0 || valor <= this.saldoConta) {
            this.saldoConta -= valor;
            System.out.println("Saque de " + valor + "reais feito");
        } else {
            System.out.println("Este saque não é válido.");
        }
    }
    
    public void transferir(double valor, ContaBancaria contaDestinataria) {
        if (valor > 0 || valor <= this.saldoConta) {
            this.saldoConta -= valor;
            contaDestinataria.depositar(valor);
            System.out.println("A transferência de" + valor + "reais foi realizada");
        } else {
            System.out.println("Transferência não realizada.");
        }
    }
    
    public void exibirExtrato() {
        System.out.println("Titular: " + this.titularConta.getNome());
        System.out.println("CPF: " + this.titularConta.getCPF());
        System.out.println("Número da Conta: " + this.numeroConta);
        System.out.println("Saldo: " + this.saldoConta + "reais");
    }
}