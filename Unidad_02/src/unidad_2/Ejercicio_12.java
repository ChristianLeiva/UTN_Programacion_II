package unidad_2;
import java.util.Scanner;

/**
 * Ejercicio 12 de la unidad 2
 * Modificación de arrays de precios
 * @author Christian Leiva
 */
public class Ejercicio_12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] productos = {199.99, 299.5, 149.75, 399.0, 89.9};
        
        System.out.println("Lista Original: ");
        for(double prod: productos){
            System.out.println("Precio: $"+prod);
        }
        
        productos[2] = 129.99;
        
        System.out.println("Lista Modificada: ");
        for(double prod: productos){
            System.out.println("Precio: $"+prod);
        }      
    }

}
