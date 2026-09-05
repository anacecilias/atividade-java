package br.com.helloworld.veiculoheranca;

public class Veiculo {
    protected String nome;
    protected int numeroRodas;
    
    public Veiculo(String nome, int numeroRodas){
        this.nome = nome;
        this.numeroRodas = numeroRodas;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setNumeroRodas(int numeroRodas){
        this.numeroRodas = numeroRodas;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public int getNumeroRodas(){
        return this.numeroRodas;
    }
    
}
