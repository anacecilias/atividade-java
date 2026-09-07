package com.mycompany.produtos;

public class Main {

    public static void main(String[] args) {
        //public Canos(String bitola, String material, int diametro, String nome, double preco, int quant) 
        Canos cano1 = new Canos("25mm", "PVC", 25, "Cano água fria", 18.50, 50);
        Canos cano2 = new Canos ("100mm", "PVC Esgoto", 100, "Cano esgoto", 85.90, 20);
        
        //public FiosCabos(double bitola, double correnteBitola, String nome, double preco, int quant)
        FiosCabos fio1 = new FiosCabos(2.5, 21.0, "Cabo flexível", 210.00, 15);
        FiosCabos fio2 = new FiosCabos(6.0, 36.0, "Cabo rígido", 195.00, 8);
    
        System.out.println("Validação");
        
        cano1.setBitola(""); // erro vazio
        cano1.setMaterial(null); // erro vazio nulo
        cano1.setDiametro(250); // erro maior que 200
        
        cano1.setBitola("20 mm"); // pode
        cano1.setMaterial("PVC"); // pode
        cano1.setDiametro(20); // pode
        
        fio1.setBitola(-5.0); // erro valor negativo
        fio1.setBitola(150.0); // ero maior que 120
        fio1.setCorrenteBitola(300); //erro maior que 200
        
        fio1.setBitola(2.5); // pode
        fio1.setCorrenteBitola(21.0); // pode
        
        System.out.println("Validação getters e setters");
        
        System.out.println("Cano 1 - bitola getter " + cano1.getBitola());
        System.out.println("Cano 1 - material getter " + cano1.getMaterial());
        System.out.println("Cano 1 - diametro getter " + cano1.getDiametro());
        System.out.println("Cano 1 - metodo aplicação frequente " + cano1.aplicacaoFrequente());
        System.out.println("Cano 1 - metodo observação técnica " + cano1.observacaoTecnica());
    
        System.out.println("Fio 1 - bitola getter " + fio1.getBitola());
        System.out.println("Fio 1 - corrente getter " + fio1.getCorrenteBitola());
        System.out.println("Fio 1 - método bitola uso " + fio1.bitolaUso());
        System.out.println("Fio 1 - metodo corrente máxima " + fio1.correnteMaxima());
    
        System.out.println("Validação métodos Produtos (abstração)");
        
        // teste preço, quantia e nome

        cano1.setPreco(-15.0); // erro 
        cano1.setQuant(-10); // erro
        cano1.setNome(""); // erro
        
        fio1.setPreco(-19.0); // erro
        fio1.setQuant(-7); // erro
        fio1.setNome(""); // erro
        
        // testando valores válidos
        
        cano1.setNome("Cano água fria");
        cano1.setPreco(18.50);
        cano1.setQuant(18);
        
        fio1.setNome("Cabo flexível 750V");
        fio1.setPreco(200.0);
        fio1.setQuant(10);

        // teste descontos fios
        
        System.out.println("Preco fio " + fio1.getPreco());
        fio1.desconto(10); // desconto de 10 por cento
        System.out.println("Preco fio desconto " + fio1.getPreco());
        fio1.desconto(150); // tenta dar desconto inválido
        
        // teste descontos canos
        
        System.out.println("Preco cano " + cano1.getPreco());
        cano1.desconto(20); // desconto de 20 por cento
        System.out.println("Preco fio desconto " + cano1.getPreco());
        cano1.desconto(150); // tenta dar desconto inválido
        
        // lista chamando os métodos abstratos 
        
        Produtos[] listaProdutos = new Produtos[4];
        
        listaProdutos[0] = cano1;
        listaProdutos[1] = cano2;
        listaProdutos[2] = fio1;
        listaProdutos[3] = fio2;

        for (int i = 0; i < listaProdutos.length; i++) {
            listaProdutos[i].exibirInformacoes();
        }
    }
    
}