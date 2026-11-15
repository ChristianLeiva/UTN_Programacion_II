package Interface;

/**
 *
 * @author Christian Leiva
 */
public class Producto implements Pagable{
    
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        setNombre(nombre);
        setPrecio(precio);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String _nombre) {
        if(_nombre != null && _nombre.length() > 1){
            this.nombre = _nombre;
        }else{
            System.out.println("Error: Ingresar nombre valido.");
        }        
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if(precio > 0.0){
            this.precio = precio;
        }else{
            System.out.println("Error: Ingresar precio valido.");
        }
    }   

    @Override
    public double calcularTotal() {
        return precio;
    }
    
    
    
}
