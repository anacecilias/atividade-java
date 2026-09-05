package com.mycompany.produto;
import java.util.ArrayList;

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

public class CarrinhoDeCompras {
    private ArrayList<Produto> produtos;
    
    public CarrinhoDeCompras() {
        this.produtos = new ArrayList<>();
    }
    
    public void adicionarProduto(Produto produto){
        this.produtos.add(produto);
        System.out.println("Você adicionou o produto " + produto.getNome() + " no carrinho");
    }

    public double calcularTotal() {
        double total = 0;
        for (Produto compra : this.produtos) {
            total += compra.getPreco();
        }
        return total;
    }
    
    public void exibirCarrinho(){
        for(Produto compra : this.produtos){
            System.out.println("Produto: " + compra.getNome() + "Preço: " + compra.getPreco());
        }
        System.out.println("Valor total: " + calcularTotal());
    }
}
