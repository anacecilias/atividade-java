
package com.mycompany.pessoa;
import java.util.Scanner;
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

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Insira seu nome: ");
        String nome = scanner.nextLine();
        
        System.out.println("Insira seu CPF");
        String CPF = scanner.nextLine();
        
        System.out.println("Insira sua data de nascimento");
        LocalDate data = LocalDate.parse(scanner.nextLine()); // formatação padrao ISO 8601
        
        System.out.println("Insira seu CEP");
        String CEP = scanner.nextLine();
        
        System.out.println("Insira sua rua");
        String rua = scanner.nextLine();
        
        System.out.println("Insira sua cidade");
        String cidade = scanner.nextLine();
        
        System.out.println("Insira o número do endereço");
        int numero = scanner.nextInt();
        
        Pessoa pessoa = new Pessoa(nome, CPF, data);
        
        Endereco endereco = new Endereco(CEP, rua, cidade, numero);
        
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("CPF: " + pessoa.getCPF());
        System.out.println("Data de nascimento (YYYY-MM-DD): " + pessoa.getDataNascimento()); // não formatei a data, pode usar date time formatter se quiser
        
        System.out.println("CEP: " + endereco.getCEP());
        System.out.println("Rua: " + endereco.getRua());
        System.out.println("Cidade: " + endereco.getCidade());
        System.out.println("Número: " + endereco.getNumero());
    }
    
}