/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad_09;
import java.util.ArrayList;

/**
 *
 * @author Christian Leiva
 */
public class Carrito<T extends Producto<?>> {
    
    private ArrayList<T> productos;
    
    public Carrito(){
        this.productos = new ArrayList<>();
    }
    
    public void agregarProducto(T producto){
        productos.add(producto);
    }
    
    public void eliminarProducto(T producto){
        productos.remove(producto);
    }
    
    public double calcularTotal(){
        double total = 0;
        for (T p : productos) {
            total += p.getPrecio();            
        }        
        return total;
    }
    
    public ArrayList<T> getProductos(){
        return productos;
    }
    
}
