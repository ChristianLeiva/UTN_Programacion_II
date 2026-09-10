package Ejercicio_04;

/**
 * Ejercicio 4 de la unidad 4
 * Inventario de productos
 * @author Christian Leiva
 */
public class NewMain {

    public static void main(String[] args) {
        //Carga de productos
        Producto prod_01 = new Producto("Teclado Mecanico", 50000.0);
        Producto prod_02 = new Producto("Mouse Gamer");
        Producto prod_03 = new Producto("Monitor", -15000.0);
        
        System.out.println("--- Mostrar listado de productos ---");
        System.out.println(prod_01.toString());
        System.out.println(prod_02.toString());
        
        
        // Aplica descuento directo
        prod_01.aplicarDescuento(10.0); 
        
        // Intenta aplicar un 50% de descuento, pero con un piso de $80
        prod_02.aplicarDescuento(50.0, 80.0); 
        
        System.out.println("\n--- Mostrar listado de productos con precios actualziados---");
        System.out.println(prod_01.toString());
        System.out.println(prod_02.toString());        
        
        // Cambio de iva
        Producto.cambiarIVA(0.105); 
        
        System.out.println("\n--- Mostrar listado de productos con precios actualziados---");
        System.out.println(prod_01.toString());
        System.out.println(prod_02.toString());
       
    }

}
