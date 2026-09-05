
package br.com.helloworld.veiculoheranca;

public class Carro  extends Veiculo{
    private String cor;
    private String ano;
    
    public Carro(String nome, int numeroRodas, String cor, String ano){
        super(nome, numeroRodas);
        this.cor = cor;
        this.ano = ano;             
        
    }
    public void setAno(String ano){
        this.ano = ano;
    }
    
    public void setCor(String cor){
        this.cor = cor;
    }
    
    public String getAno(String ano){
        return this.ano;
    }
    
    public String getCor(String cor){
        return this.cor;
    }
    
}
