package Ejercicio_04;

import java.util.ArrayList;

/**
 * Ejercicio 04 de la unidad 07
 * @author Christian Leiva
 */
public class NewMain {

    public static void main(String[] args) {
        ArrayList<Animal> animales = new ArrayList<>();
        animales.add(new Perro("Uma"));
        animales.add(new Perro("Coco"));
        animales.add(new Gato("Brisa"));
        animales.add(new Vaca("Margarita"));
        
        for (Animal a : animales) {
            a.describirAnimal();
            a.hacerSonido();
            System.out.println("---------");            
        }
    }

}
