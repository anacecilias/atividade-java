package com.mycompany.produtos;

public class FiosCabos extends Produtos{
    private double bitola;
    private double correnteBitola;

    public FiosCabos(double bitola, double correnteBitola, String nome, double preco, int quant) {
        super(nome, preco, quant);
        setBitola(bitola);
        setCorrenteBitola(correnteBitola);
    }
    
    public void exibirInformacoes(){
        System.out.println("Nome: " + getNome());
        System.out.println("Preço: " + getPreco());
        System.out.println("Quantidade: " + getQuant());
        System.out.println("Bitola: " + bitola + "mm quadrados");
        System.out.println("Recomendação de uso: " + bitolaUso());
        System.out.println("Corrente máxima: " + correnteMaxima() + " Ampéres");
    }
    
    public String bitolaUso(){
        if(this.bitola == 1.5){
            return "Circuitos de iluminação residencial simples";
        }else if(this.bitola == 2.5){
            return "Circuitos de iluminação e circuitos de tomadas simples (eletrodomésticos em geral)";
        }else if(this.bitola == 4.0){
            return "Circuitos de tomadas simples, de torneiras e chuveiros elétricos e de aparelhos de ar-condicionado de pequeno porte";
        }else if(this.bitola == 6.0){
            return "Circuitos de torneiras e chuveiros elétricos e de aparelhos de ar-condicionado de pequeno porte";
        }else if(this.bitola == 10.0){
            return "quadro de entrada de energia elétrica residencial";
        }else if(this.bitola == 16.0){
            return "motobomba para piscinas e condomínios";
        }else if(this.bitola == 25.0){
            return "forno elétrico de padaria";
        }else if(this.bitola == 35.0){
            return "quadro de entrada de energia elétrica em prédios de até três andares";
        }else if(this.bitola == 50.0){
            return "máquinas industriais de grande porte";
        }else if(this.bitola >= 70.0 && this.bitola <= 120.0){
            return "quadro de entrada de energia de prédios acima de três andares";
        }
        return "Não especificado ou não se encaixa";
    }
    
    public double correnteMaxima(){
        
        if(this.bitola == 1.5){
            this.correnteBitola = 15.5;
        }else if(this.bitola == 2.5){
            this.correnteBitola = 21.0;
        }else if(this.bitola == 4.0){
            this.correnteBitola = 28.0;
        }else if(this.bitola == 6.0){
            this.correnteBitola = 36.0;
        }else if(this.bitola == 10.0){
            this.correnteBitola = 50.0;
        }else if(this.bitola == 16.0){
            this.correnteBitola = 68.0;
        }else if(this.bitola == 25.0){
            this.correnteBitola = 89.0;
        }else if(this.bitola == 70.0){
            this.correnteBitola = 171.0;
        }else if(this.bitola == 120.0){
            this.correnteBitola = 239.0;
        }else{
            this.correnteBitola = 0.0;
        }
        return this.correnteBitola;
    }

    public double getBitola() {
        return bitola;
    }

    public void setBitola(double bitola) {
        if(bitola >0 && bitola<=120){
        this.bitola = bitola;
        }else{
            System.out.println("A bitola deve ser maior que 0 e menor ou igual a 120");
        }
    }

    public double getCorrenteBitola() {
        return correnteBitola;
    }

    public void setCorrenteBitola(double correnteBitola) {
        if(correnteBitola>=0 && correnteBitola<=239){
            this.correnteBitola = correnteBitola;
        }else{
            System.out.println("A corrente máxima não pode ser negativa nem ultrapassar 239 ampéres");
        }
    }
}