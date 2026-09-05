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

public class Autor {
    private String nome;
    private String nacionalidade;

    public Autor(String nome, String nacionalidade) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
    }

    public String getNome() {
        return nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }
}