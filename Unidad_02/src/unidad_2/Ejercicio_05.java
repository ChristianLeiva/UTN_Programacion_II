package unidad_2;
import java.util.Scanner;

/**
 * Ejercicio 5 de la unidad 2
 * Pedir número al usuario y sumarlos, ingresar 0 para salir.
 * @author Christian Leiva
 */
public class Ejercicio_05 {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int sumador = 0, num=1;

       while(num != 0){
        System.out.println("Ingrese un numero \"(0 para salir)\"");
        num = Integer.parseInt(sc.nextLine());
        sumador += num;           
       }       
       System.out.println("La suma de los numeros ingresados es: "+sumador);       
    }

}
