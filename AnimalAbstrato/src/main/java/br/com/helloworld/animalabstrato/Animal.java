
package br.com.helloworld.animalabstrato;


public abstract class Animal {
    protected String nome;
    
    public Animal(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void dormir(){
        System.out.println(this.getNome() + " esta dormindo!");
    }
    public abstract void emitirSom();
    
    
}
