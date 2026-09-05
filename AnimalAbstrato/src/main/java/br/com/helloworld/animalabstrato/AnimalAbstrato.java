
package br.com.helloworld.animalabstrato;


public class AnimalAbstrato {


    public static void main(String[] args) {
        Gato cat = new Gato("Amora");
        Cachorro cachorro = new Cachorro("DOGAO");
        

        cachorro.dormir();
        cachorro.emitirSom();
    }
    
}
