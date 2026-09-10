
package unidad_1;
import java.util.Scanner;

/**
 *
 * @author Christian Leiva
 */
public class Ejercicio_07 {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.print("Ingresa tu nombre: "); 
       String nombre = scanner.nextLine(); // Error solucinado
       /**
        * El error se generaba porque scanner.nextInt() 
        * Para guardarr un número entero en la variable nombre declarada como String
        * cambiando a scannerLine() se solucionó el error.
        */
       System.out.println("Hola, " + nombre);
       
    }

}
