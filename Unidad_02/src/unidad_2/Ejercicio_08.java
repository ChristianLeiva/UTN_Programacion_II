package unidad_2;
import java.util.Scanner;

/**
 * Ejercicio 8 de la unidad 2
 * Funciones: Calcular el precio final
 * @author Christian Leiva
 */
public class Ejercicio_08 {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Ingresar precio base del producto: ");
       double precio_base = Double.parseDouble(sc.nextLine());
       System.out.println("Ingresar impuesto en porcentaje \"(Ejemplo: 10 para el 10%)\": ");
       int imp = Integer.parseInt(sc.nextLine());
       System.out.println("Ingresar descuento en porcentaje \"(Ejemplo: 5 para el 5%)\": ");
       int desc = Integer.parseInt(sc.nextLine());
       
       calculoPrecioFinal(precio_base, imp, desc);
       
    }
    
    static public void calculoPrecioFinal(double precio_base, int impuesto, int descuento){
        double precio_final = precio_base + (precio_base * (impuesto / 100.0)) - (precio_base * (descuento / 100.0));
        System.out.println("El precio final es: "+precio_final);
    };

}




