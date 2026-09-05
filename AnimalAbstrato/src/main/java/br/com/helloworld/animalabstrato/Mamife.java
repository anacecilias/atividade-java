
package br.com.helloworld.animalabstrato;

public class Mamife extends Animal {
    public Mamife(String nome){
        super(nome);
    }
    
    public void emitirSom(){
        System.out.println("TESTE");
    }
}
