package unidad_1;

import java.util.Scanner;
/**
 * Ejercicio 3 de la unidad 1
 * @author Christian Leiva
 */
public class Ejercicio_03 {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Ingrese su edad");
        int edad = Integer.parseInt(sc.nextLine());
        
        System.out.println("Hola, soy "+nombre+" y tengo "+edad+" anios.");
    }

}
