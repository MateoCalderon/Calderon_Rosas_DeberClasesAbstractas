
package test;

import dominio.Animales;
import dominio.Carnivoros;
import dominio.Herbivoros;
import dominio.Plantas;
import dominio.SerVivo;

public class PruebaSerVivo {
    public static void main(String[] args){
        System.out.println("Existen dos tipos de seres vivos:");
        
        Plantas planta=new Plantas();
        planta.setTipo("Planta");
        System.out.println(planta.getTipo());
        planta.Alimentarse();
        Animales animal=new Animales() {};
        animal.setTipo("Animal");
        System.out.println(animal.getTipo());
        animal.Alimentarse();
        Herbivoros animalh = new Herbivoros();
        animalh.setTipoA("Herbivoro");
        System.out.println(animalh.getTipoA());
        animalh.Alimentarse();
        Carnivoros animalc = new Carnivoros();
        animalc.setTipoA("Carnivoro");
        System.out.println(animalc.getTipoA());
        animalc.Alimentarse();
    }
}
