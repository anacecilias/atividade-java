
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

public class Livro {
    private String titulo;
    private String autor;
    private int numPags;
    private boolean disponibilidade;

    public Livro(String titulo, String autor, int numPags) {
        this.titulo = titulo;
        this.autor = autor;
        this.numPags = numPags;
        this.disponibilidade = true;
    }
    
    public void emprestarLivro(){
        if(this.disponibilidade){
            this.disponibilidade = false;
        }else{
            System.out.println("O livro " + this.titulo + "já foi emprestado");
        }
    }
    
    public void devolverLivro(){
        if(!this.disponibilidade){ // n ta disponível "!"
            this.disponibilidade = true; // agr fica disponivel, é devolvido
        }else{
            System.out.println("O livro " + this.titulo + "já tava na biblioteca");
        }
    }
    
    public void mostrarInformacoes(){
        System.out.println("Título: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Tem: " +this.numPags + "págs");
        if(this.disponibilidade){
            System.out.println("Tá disponível");
        }else{
            System.out.println("Não tá disponível");
        }
    }
}
