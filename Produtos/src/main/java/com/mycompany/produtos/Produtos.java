package com.mycompany.produtos;

/* classe abstrata de loja / material de construção */

public abstract class Produtos {
        private String nome;
        private double preco;
        private int quant;

    public Produtos(String nome, double preco, int quant) {
        this.nome = nome;
        this.preco = preco;
        this.quant = quant;
    }
    
    public abstract void exibirInformacoes();
        
    public void desconto(double porcentagem){
        if(porcentagem > 0 && porcentagem <= 100){
            this.preco -= this.preco * (porcentagem/100.0);{
            System.out.println("Desconto de " + porcentagem + "dado");
        }
        }else{
            System.out.println("Desconto inválido");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome == null && nome.trim().isEmpty()){
            System.out.println("O nome não pode estar vazio");
        }else{
            this.nome = nome;
        }
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if(preco >= 0){
            this.preco = preco;
        }else{
            System.out.println("O preço não pode ficar negativo");
        }
    }

    public int getQuant() {
        return quant;
    }

    public void setQuant(int quant) {
        if(quant>=0){
            this.quant = quant;
        }else{
            System.out.println("A quantidade não pode estar negativa");
        }
    }
}