package com.mycompany.livroautor;

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

public class Livro {
    private String titulo;
    private Autor autor; 
    private boolean disponivel;

    public Livro(String titulo, Autor autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = true; 
    }

    public void emprestar() {
        if (this.disponivel) {
            this.disponivel = false;
            System.out.println("O livro " + this.titulo + " foi emprestado");
        } else {
            System.out.println("O livro " + this.titulo + " não está disponível");
        }
    }

    public void devolver() {
        if (!this.disponivel) {
            this.disponivel = true;
            System.out.println("O livro " + this.titulo + "foi devolvido");
        } else {
            System.out.println("O livro " + this.titulo + " já estava disponível");
        }
    }

    public void exibirInformacoes() {
        System.out.println("\n------------------------------------");
        System.out.println("Título: " + this.titulo);
        System.out.println("Autor: " + this.autor.getNome() + " Nacionalidade: " + this.autor.getNacionalidade());
        System.out.println("Disponível " + (this.disponivel ? "Sim" : "Não"));
    }
}