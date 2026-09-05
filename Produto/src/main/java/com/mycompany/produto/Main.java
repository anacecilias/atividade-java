package com.mycompany.produto;

public class Main {
    
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

    public static void main(String[] args) {
        Produto produto1 = new Produto("Arroz", 6.99);
        Produto produto2 = new Produto("Feijão", 7.50);
        Produto produto3 = new Produto("Macarrão", 5.99);
        
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        
        carrinho.adicionarProduto(produto1);
        carrinho.adicionarProduto(produto2);
        carrinho.adicionarProduto(produto3);
        
        carrinho.exibirCarrinho();
    }
}
