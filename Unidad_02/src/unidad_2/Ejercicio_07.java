package unidad_2;
import java.util.Scanner;

/**
 * Ejercicio 7 de la unidad 2
 * Ingresar nota valida entre 0-10
 * @author Christian Leiva
 */
public class Ejercicio_07 {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int nota;
       do{
           System.out.println("Ingrese una nota \"(0-10)\"");
           nota = Integer.parseInt(sc.nextLine());
           if(nota > 10 || nota < 0 ){
               System.out.println("Error: Ingrese una nota valida \"(0-10)\"");
           }           
       }while(nota > 10 || nota < 0);
       
       System.out.println("Nota guardada correctamente.");
    }

}
