package unidad_1;
import java.util.Scanner;

/**
 * Ejercicio 6 de la unidad 1
 * @author Christian Leiva
 */
public class Ejercicio_06 {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
        int num1, num2;
       
        System.out.println("Ingrese el 1er numero: ");
        num1 = Integer.parseInt(sc.nextLine());
        
        System.out.println("Ingrese el 2do numero: ");
        num2 = Integer.parseInt(sc.nextLine());
        
        double res = (double) num1/num2;
        
        System.out.println("Resultado con int\n\t"+num1+" / "+num2+" = "+(num1 / num2));
        System.out.println("Resultado con double:\n\t"+num1+" / "+num2+" = "+res);
        
    }

}
