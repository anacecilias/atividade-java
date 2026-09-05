package com.mycompany.livroautor;
import java.util.Scanner;
/*
Crie uma aplicação que ligue um livro a um autor.
a. Deve conter 2 classes, Livro e Autor.
b. O Autor possui nacionalidade e nome.
c. O Livro possui título, autor e sua disponibilidade.
d. Deve ser possível emprestar um livro, retornando
uma mensagem se ele não está disponível e caso
esteja, deve ficar indisponível para emprestar.
e. Deve ser possível devolver o livro.
f. Deve ser possível exibir a informação do livro,
mostrando tudo dele e sua disponibilidade.
g. Faça que seja um menu que pede para o usuário o
que ele quer fazer, e só termine caso aperte 0.
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Autor autor1 = new Autor("Hirohiko Araki", "Japonesa");
        Livro livro1 = new Livro("JoJo's Bizarre Adventure: Stone Ocean", autor1);

        int opcao = -1;

        do {
            System.out.println("Aperte 1 para exibir informações do livro");
            System.out.println("Aperte 2 para emprestar livro");
            System.out.println("Aperte 3 para devolver o livro");
            System.out.println("Aperte 0 para sair");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    livro1.exibirInformacoes();
                    break;
                case 2:
                    livro1.emprestar();
                    break;
                case 3:
                    livro1.devolver();
                    break;
                case 0:
                    System.out.println("Saindo");
                    break;
                default:
                    System.out.println("Opção inválida");
            }

        } while (opcao != 0);

        scanner.close();
    }
}