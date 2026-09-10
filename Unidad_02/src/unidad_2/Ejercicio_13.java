package unidad_2;
import java.util.Scanner;

/**
 * Ejericio 13 de la unidad 2
 * Modificación de array mendiante funcion y recursividad
 * @author Christian Leiva
 */
public class Ejercicio_13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] productos = {199.99, 299.5, 149.75, 399.0, 89.9};
        
        System.out.println("Lista Original: ");
        recorrerConRecursividad(productos, 0);
        productos[2] = 129.99;
        System.out.println("Lista Modificada: ");
        recorrerConRecursividad(productos, 0);
        
    
    }
    
    static void recorrerConRecursividad(double arr[], int indice){
        if (indice == arr.length){
            return;
        }
        
        System.out.println(indice+" - precio: $"+arr[indice]);
        
        recorrerConRecursividad(arr, indice+1);
    }

}
