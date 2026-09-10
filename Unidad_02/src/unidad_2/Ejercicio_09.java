package unidad_2;
import java.util.Scanner;

/**
 * Ejercicio 9 de la unidad 2
 * Composición de funciones: Calcular Costo de envio
 * @author Christian Leiva
 */
public class Ejercicio_09 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String zona;
        System.out.println("Ingrese el precio del producto: ");
        double precio_prod = Double.parseDouble(sc.nextLine());
 
        do {
            System.out.println("Ingrese zona: \"(Nacional / Internacional)\": ");
            zona = sc.nextLine().toLowerCase();

            if (!zona.equalsIgnoreCase("nacional") && !zona.equalsIgnoreCase("internacional")) {
                System.out.println("Error: Debe ingresar 'Nacional' o 'Internacional'.");
            }

        } while (!zona.equalsIgnoreCase("nacional") && !zona.equalsIgnoreCase("internacional"));
        
        System.out.println("Ingrese el peso del paquete: ");
        double peso = Double.parseDouble(sc.nextLine());        
        double costo_envio = calcularCostoEnvio(zona, peso);
        calcularTotalCompra(precio_prod, costo_envio);       
    }
    
    static double calcularCostoEnvio(String zona_envio, double peso_paquete){
        /**
         * Envio nacional 5$ x kilo
         * Envio Internaciónal 10$ x kilo
         */
        double costo_envio = (zona_envio.equalsIgnoreCase("nacional"))? peso_paquete * 5 : peso_paquete * 10;       
        return costo_envio;
    }
    
    static void calcularTotalCompra(double precio_producto, double costo_envio){
        double total_compra = precio_producto + costo_envio;
        System.out.println("El costo del envio es: "+costo_envio+"\nEl total a pagar es: "+total_compra);
    }

}
