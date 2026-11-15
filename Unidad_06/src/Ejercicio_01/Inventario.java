package Ejercicio_01;
import java.util.ArrayList;

/**
 *
 * @author Christian Leiva
 */
public class Inventario {
    
    private ArrayList<Producto> productos;
    
    //Constructor
    public Inventario(){
        this.productos = new ArrayList<>();
    }
    
    public void agregarProducto(Producto p){
        productos.add(p);
    }
    
    public void listarProductos(){
        for (Producto p : productos) {
            p.mostrarInfo();            
        }
    }
    
    public Producto buscarProductoPorId(String id){        
        for (Producto p : productos) {
            if(p.getId().equalsIgnoreCase(id)){
                return p;
            }            
        }
        return null;
    }
    
    public boolean eliminarProducto(String id){
        Producto prodEncontrado = buscarProductoPorId(id);
        if(prodEncontrado != null){
            productos.remove(prodEncontrado);
            return true;
        }
        return false;        
    }
    
    public void actualizarStock(String _id, int _nuevaCantidad){
        Producto prodEncontrado = buscarProductoPorId(_id);
        if(prodEncontrado != null){
            prodEncontrado.setCantidad(_nuevaCantidad);
        }
    }
    
    public void filtrarPorCategoria(CategoriaProducto _categoria){
        for (Producto p : productos){
            if(p.getCategoria() == _categoria){
                p.mostrarInfo();
            }            
        }        
    }
    
    public int obtenerTotalCantidad(){
        int total = 0;
        for (Producto p : productos){
            total += p.getCantidad();            
        }
        return total;
    }
    
    public Producto obtenerProductoMayorStock(){
        Producto mayor = productos.get(0);
        for (Producto p : productos){
            if(p.getCantidad() > mayor.getCantidad()){
                mayor = p;
            }            
        }
        return mayor;
    }
    
    public void filtrarProductosPorPrecio(double min, double max) {
        for (Producto p : productos) {
            if (p.getPrecio() >= min && p.getPrecio() <= max) {
                p.mostrarInfo();
            }
        }
    }
    
    public void mostrarCategoriasDisponibles() {
        for (CategoriaProducto cat : CategoriaProducto.values()) {
            System.out.println(cat + ": " + cat.getDescripcion());
        }
    }
    
    
}
