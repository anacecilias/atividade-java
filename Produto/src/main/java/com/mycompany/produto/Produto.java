package com.mycompany.produto;

/*
Exercício
● Crie a classe produto com os seguintes atributos:
○ Nome
○ Preço
● Os métodos serão apenas os getters e setters de produto.
● Criem também a classe Carrinho de Compras com o atributo:
○ Produtos
● Nessa classe coloquem os seguintes métodos:
○ adicionarProduto(Produto produto): Recebe um objeto Produto e adicione ao ArrayList.
○ calcularTotal(): Percorre a lista de produtos, soma os preços e retorna o valor total.
○ exibirCarrinho(): Exibe na tela o nome e o preço de cada produto no carrinho, além do valor total formatado.
 */

public class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
}
