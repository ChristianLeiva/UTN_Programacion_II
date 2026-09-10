package unidad_2;
import java.util.Scanner;

/**
 * Ejercicio 3 de la unidad 2
 * Clasificación de edad
 * @author Christian Leiva
 */
public class Ejercicio_03 {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su edad: ");
        int edad_ingresada = Integer.parseInt(sc.nextLine());
        if(edad_ingresada <= 12){
            System.out.println("Eres un ninio.");
        }else if(edad_ingresada >= 13 && edad_ingresada <= 17){
            System.out.println("Eres un Adolesente.");
        }else if(edad_ingresada >=18 && edad_ingresada <= 59){
            System.out.println("Eres un adulto.");
        }else if(edad_ingresada >=60){
            System.out.println("Eres un adulto mayor.");
        }else{
            System.out.println("Error");
        }
    }

}
