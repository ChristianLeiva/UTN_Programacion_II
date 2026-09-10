package unidad_2;
import java.util.Scanner;

/**
 * Ejercicio 11 de la unidad 2
 * Calculo de descuento con variable global
 * @author Christian Leiva
 */
public class Ejercicio_11 {
    
    static double DESCUENTO_ESPECIAL = 0.10;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese el precio del producto: ");
        double precio_prod = Double.parseDouble(sc.nextLine()); 
        calcularDescuentoEspecial(precio_prod);
       
    }
    
    static void calcularDescuentoEspecial(double precio_prod){
        double descuento = precio_prod * DESCUENTO_ESPECIAL;
        double precio_final = precio_prod - descuento;
        
        System.out.println("El descuento especial aplicado es: "+descuento+".\nEl precio final con descuento es: "+precio_final+".");
        
    }

}
