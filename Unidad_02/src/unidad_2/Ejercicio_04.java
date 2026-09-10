package unidad_2;
import java.util.Scanner;

/**
 * Ejercicio 4 de la unidad 2
 * Calcular descuento segun categoria del producto
 * @author Christian Leiva
 */
public class Ejercicio_04 {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Ingrese precio del producto: ");
       double precio_producto = Double.parseDouble(sc.nextLine());
       System.out.println("Ingrese categoria del producto: (A, B o C)");
       char categoria_producto = sc.nextLine().toUpperCase().charAt(0);
       
       switch (categoria_producto){
            case 'A':
                System.out.println("Precio: "+precio_producto+" - Categoria: "+categoria_producto+"\nPrecio Final: "+(precio_producto * 0.90));
                break;
            case 'B':
                System.out.println("Precio: "+precio_producto+" - Categoria: "+categoria_producto+"\nPrecio Final: "+(precio_producto * 0.85));
                break;
            case 'C':
                System.out.println("Precio: "+precio_producto+" - Categoria: "+categoria_producto+"\nPrecio Final: "+(precio_producto * 0.80));
                break;
            default:
                System.out.println("Error: categoria ingresada incorrecta");          
       }
    }

}
