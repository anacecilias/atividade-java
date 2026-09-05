package com.mycompany.clientebanco;

public class Main {

    public static void main(String[] args) {
        // instancia clientes
        Cliente clienteUm = new Cliente("Cliente 1", "123.456.789-10");
        Cliente clienteDois = new Cliente("Cliente 2", "987.654.321-10");
        
        // instancia contas
        ContaBancaria contaUm = new ContaBancaria(150, 500.00, clienteUm);
        ContaBancaria contaDois = new ContaBancaria(100, 400.00, clienteDois);
        
        contaUm.exibirExtrato();
        contaDois.exibirExtrato();
    }
}
