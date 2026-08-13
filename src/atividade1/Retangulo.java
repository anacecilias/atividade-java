package atividade1;

public class Retangulo {
    // atributos - caracteristicas, coisas q 1 retangulo tem
    private double largura;
    private double altura;

    public Retangulo(double largura, double altura) {
        // constructor -
        this.largura = largura;
        this.altura = altura;
    }

    // metodo pra calcular a area do retangulo altura * largura
    public double CalcularArea(){
        return this.largura * this.altura;
    }

    // metodo pra calcular o perimetro
    public double CalcularPerimetro(){
        return (this.largura + this.altura) * 2;
    }

    // metodo pra mostrar os dados
    public void ExibirDados(){
        System.out.println("Largura: " + this.largura);
        System.out.println("Altura: " + this.altura);
        System.out.println("Area: " + CalcularArea());
        System.out.println("Perimetro: " + CalcularPerimetro());
    }

    // getters e setters p mudar os valores dps ou ler cada 1

    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }
}
