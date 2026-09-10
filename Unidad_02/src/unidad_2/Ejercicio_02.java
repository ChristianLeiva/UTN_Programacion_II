package unidad_2;
import java.util.Scanner;

/**
 * Ejercicio 2 de la unidad 2
 * Mostrar el numero mas grande de 3 numeros ingresados
 * @author Christian Leiva
 */
public class Ejercicio_02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, num3;
        System.out.println("Ingrese el primer numero: ");
        num1 = Integer.parseInt(sc.nextLine());
        System.out.println("Ingrese el segundo numero: ");
        num2 = Integer.parseInt(sc.nextLine());
        System.out.println("Ingrese el tercer numero: ");
        num3 = Integer.parseInt(sc.nextLine());
        
        if(num1 > num2 && num1 > num3){
            System.out.println("El numero ingresado mas grande es: "+num1);
        }else if(num2 > num1 && num2 > num3){
            System.out.println("El numero ingresado mas grande es: "+num2);
        }else{
            System.out.println("El numero ingresado mas grande es: "+num3);
        }
    }

}
