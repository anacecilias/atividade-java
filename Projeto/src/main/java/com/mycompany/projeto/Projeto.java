package com.mycompany.projeto;

import java.util.Scanner;

/**
 *
 * @author jo-o
 */
public class Projeto {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("---- PESSOA ----");
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();
                
        System.out.print("Digite sua cpf: ");
        String cpf = scanner.nextLine();
                
        System.out.print("Digite seu nascimento: ");
        String dataNasc = scanner.nextLine();
        
        
        System.out.println("---- ENDEREÇO ----");
        System.out.print("Digite seu CEP: ");
        String cep = scanner.nextLine();
                
        System.out.print("Digite sua cidade: ");
        String cidade = scanner.nextLine();
                
        System.out.print("Digite sua rua: ");
        String rua = scanner.nextLine();
                
        System.out.print("Digite seu numero: ");
        int numero = scanner.nextInt();
        
        Endereco endereco = new Endereco(cep, rua, cidade, numero);
        Pessoa pessoa = new Pessoa(nome, dataNasc, cpf, endereco);
     
        System.out.println("---- DADOS DA PESSOA ----");
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("CPF: " + pessoa.getCpf());
        System.out.println("Data Nascimento: " + pessoa.getDataNasc());
       
        System.out.println("---- DADOS DO ENDEREÇO ----");
        System.out.println("CEP: " + endereco.getCep());
        System.out.println("Cidade: " + endereco.getCidade());
        System.out.println("Rua: " + endereco.getRua());
        System.out.println("Numero: " + endereco.getNumero());
       
    }
               
}
