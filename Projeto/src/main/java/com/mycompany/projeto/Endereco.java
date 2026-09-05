
package com.mycompany.projeto;

public class Endereco {
    
    private String cep;
    private String rua;
    private String cidade;
    
    private int numero;

    public Endereco(String cep, String rua, String cidade, int numero) {
        this.cep = cep;
        this.rua = rua;
        this.cidade = cidade;
        this.numero = numero;
    }
    
    

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    
}
