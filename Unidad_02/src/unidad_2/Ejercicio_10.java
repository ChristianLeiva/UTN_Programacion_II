package unidad_2;
import java.util.Scanner;

/**
 * Ejericio 10 de la unidad 2
 * Actualizar Stock
 * @author Christian Leiva
 */
public class Ejercicio_10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el stock actual del producto: ");
        int stock_actual =  Integer.parseInt(sc.nextLine());
        System.out.println("Ingrese la cantidad vendida: ");
        int cant_venta = Integer.parseInt(sc.nextLine());
        System.out.println("Ingrese la cantidad recibida: ");
        int cant_recibida = Integer.parseInt(sc.nextLine());    
        
        actualizarStock(stock_actual, cant_venta, cant_recibida);
       
    }
    
    static void actualizarStock(int stock_actual, int cantidad_ventas, int cantidad_recibida){
        int nuevo_stock = stock_actual - cantidad_ventas + cantidad_recibida;
        System.out.println("El nuevo stock del producto es: "+nuevo_stock);
    }

}
