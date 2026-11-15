package Ejercicio_02;
import java.util.ArrayList;

/**
 * Ejercicio 02 de la unidad 07
 * @author Christian Leiva
 */
public class NewMain {

    public static void main(String[] args) {
        ArrayList<Figura> figuras = new ArrayList<>();
        figuras.add(new Circulo("Circulo", 2.0));
        figuras.add(new Rectangulo("Rectangulo", 4, 2));
        
        for (Figura f : figuras) {
            System.out.println("Figura: " + f.getNombre() + " | Area: "+ f.calcularArea());
            
        }
       
    }

}
