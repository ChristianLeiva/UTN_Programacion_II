package unidad_2;
import java.util.Scanner;

/**
 * Ejercicio 1 de la unidad 2
 * @author Christian Leiva
 */
public class Ejercicio_01 {

    public static void main(String[] args) {        
        Scanner sc = new Scanner(System.in);
        boolean esBisiesto = false;
        System.out.println("Ingrese un anio (XXXX): ");
        int anio_ingresado = Integer.parseInt(sc.nextLine());
        if(anio_ingresado %4==0){
            if(anio_ingresado %100==0){
                if(anio_ingresado %400==0){
                    esBisiesto = true;
                }
            }else{
                esBisiesto = true;
            }
        }
        
        if(esBisiesto){
            System.out.println("El anio "+anio_ingresado+" es Bisiesto.");
        }else{
            System.out.println("El anio "+anio_ingresado+" no es Bisiesto.");
        }
        
    }

}
