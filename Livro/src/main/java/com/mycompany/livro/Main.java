package com.mycompany.livro;

/*
● Criem uma classe chamada Livro, nele coloquem os atributos:
○ Título
○ Autor
○ Número de páginas
○ Disponível
● Criem nessa classe os métodos:
○ Emprestar.
○ Devolver.
○ Mostrar Informações
● Testem tudo na função main criando os livros, emprestando e devolvendo.
 */

public class Main {

    public static void main(String[] args) {
        // cria obj livros
        // titulo, autor, numero paginas
        
        Livro livro1 = new Livro("Homunculus", "Hideo Yamamoto", 3408);
        Livro livro2 = new Livro("Yotsuba to!", "Kiyohiko Azuma", 3350);
        
        livro1.mostrarInformacoes();
        livro2.mostrarInformacoes();
        
        
        livro1.emprestarLivro(); // testa emprestimo do livro 1
        
        livro1.emprestarLivro(); // tem q ta indisponivel
        
        livro1.mostrarInformacoes(); // tem q mostrar q ta indisponivel
        
        livro1.devolverLivro(); // testa devolução do livro 1
        
        livro1.mostrarInformacoes(); // tem q estar disponivel dps de devolvido
    }
}
