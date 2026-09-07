package com.mycompany.produtos;

public class Canos extends Produtos{
    private String bitola;
    private String material;
    private int diametro;

    public Canos(String bitola, String material, int diametro, String nome, double preco, int quant) {
        super(nome, preco, quant);
        setBitola(bitola);
        setMaterial(material);
        setDiametro(diametro);
    }

    public void exibirInformacoes(){
        System.out.println("Nome: " + getNome());
        System.out.println("Preço: " + getPreco());
        System.out.println("Quantidade: " + getQuant());
        System.out.println("Bitola: " + bitola);
        System.out.println("Diâmetro: " + diametro + " mm");
        System.out.println("Material: " + material);
        System.out.println("Aplicações frequentes: " + aplicacaoFrequente());
        System.out.println("Observações técnicas: " + observacaoTecnica());
    }
    
    public String aplicacaoFrequente(){
        if(this.diametro == 20){
            return "Ramais de água fria e pontos individuais";
        }else if(this.diametro == 25){
            return "Distribuição de água fria e ramais";
        }else if(this.diametro == 32){
            return "Alimentação e distribuição interna";
        }else if(this.diametro == 40){
            return "Prumadas e alimentação";
        }else if(this.diametro == 50){
            return "Barriletes, alimentação e sistemas específicos";
        }else if(this.diametro == 60){
            return "Alimentação de maior capacidade";
        }else if(this.diametro == 75){
            return "Esgoto e ventilação, onforme projeto";
        }else if(this.diametro == 100){
            return "Saídas sanitárias e coletoras de esgoto";
        }
        return "Não especificado ou não se encaixa";
    }
    
    public String observacaoTecnica(){
        if(this.diametro == 20){
            return "Uso residencial recorrente; dimensionar conforme vazão";
        }else if(this.diametro == 25){
            return "Pode atender mais de um ponto, conforme projeto";
        }else if(this.diametro == 32){
            return "Indicado em trechos com demanda superior";
        }else if(this.diametro == 40){
            return "Confirmar pressão e perdas de carga";
        }else if(this.diametro == 50){
            return "Também existe em aplicações de esgoto, em linhas próprias";
        }else if(this.diametro == 60){
            return "Não substituir por outra medida sem cálculo hidráulico";
        }else if(this.diametro == 75){
            return "Verificar série e compatibilidade das conexões";
        }else if(this.diametro == 100){
            return "Exige atenção à declividade e à norma do sistema";
        }
        return "Não especificado ou não se encaixa";
    }

    public String getBitola() {
        return bitola;
    }

    public void setBitola(String bitola) {
        if(bitola != null && !bitola.equals("")){
            this.bitola = bitola;
        }else{
            System.out.println("A bitola não pode estar vazia");
        }
    }

    public String getMaterial() {
       return material;
    }

    public void setMaterial(String material) {
        if ("PVC".equalsIgnoreCase(material) || "CPVC".equalsIgnoreCase(material) || "PPR".equalsIgnoreCase(material) || "PEX".equalsIgnoreCase(material) || "PVC Esgoto".equalsIgnoreCase(material)){
           this.material = material;
        } else {
            System.out.println("Material inválido ou não se encaixa");
        }
    }

    public int getDiametro() {
        return diametro;
    }

    public void setDiametro(int diametro) {
        if(diametro>0 && diametro<=200)
        this.diametro = diametro;
        else{
            System.out.println("O diâmetro deve ser maior que 0 e não suporta valores maiores que 200 mm");
        }
    }
}