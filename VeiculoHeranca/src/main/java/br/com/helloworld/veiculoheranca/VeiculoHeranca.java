package br.com.helloworld.veiculoheranca;

public class VeiculoHeranca {

    public static void main(String[] args) {
        Carro maqueen = new Carro("Carro de corrida", 4, "Vermelha", "2005");
        
        System.out.println("Nome do carro " + maqueen.getNome());
        maqueen.setNome(" Fusca");
        
        System.out.println("Nome do carro" +maqueen.getNome());
        
        Veiculo barco = new Veiculo("Barco de pesca", 0);
        System.out.println("Nome do barco: " + barco.getNome());
    }
    
}
