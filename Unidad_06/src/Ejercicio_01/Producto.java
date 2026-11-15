package Ejercicio_01;

/**
 *
 * @author Christian Leiva
 */
public class Producto {
    private String id;
    private String nombre;
    private double precio;
    private int cantidad;
    private CategoriaProducto categoria;
    
    //constructor
    public Producto(String _id, String _nombre, double _precio, int _cantidad, CategoriaProducto _categoria){
        this.id = _id;
        this.nombre = _nombre;
        this.precio = _precio;
        this.cantidad = _cantidad;
        this.categoria = _categoria;
    }
    
    public void mostrarInfo(){
        System.out.println("ID: " + id + " | Nombre: " + nombre + " | Precio: $" + precio +
                           " | Cantidad: " + cantidad + " | Categoria: " + categoria + 
                           " (" + categoria.getDescripcion() + ")");
    }
    
    private boolean validarEntero(int _entero){
        return _entero >= 0;
    }
    
    private boolean validarString(String _cadena){
       if(_cadena != null && _cadena.length() >0){
           return true;
       }
       return false;
    }

    public String getId(){
        return id;
    }
    
    public void setId(String _id){
        if(validarString(_id)){
            this.id = _id;
        }else{
            System.out.println("Error: Ingresar un ID valido.");
        }        
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String _nombre){
        if(validarString(_nombre)){
            this.nombre = _nombre;
        }else{
            System.out.println("Error: Ingresar un nombre valido.");
        }
    }
    
    public double getPrecio(){
        return precio;
    }

    public void setPrecio(double _precio){
        if(_precio > 0.0) {
            this.precio = _precio;
        }else{
            System.out.println("Error: Ingresar un precio valido.");
        }        
    }
    
    public int getCantidad(){
        return this.cantidad;
    }    

    public void setCantidad(int _cantidad){
        if(validarEntero(_cantidad)){
            this.cantidad = _cantidad;
        }
    }
    
    public CategoriaProducto getCategoria(){
        return categoria;
    }
    
    public void setCategoria(CategoriaProducto _categoria){
        if(_categoria != null){
            this.categoria = _categoria;
        }else{
            System.out.println("Error: Ingresar una categoria valida.");
        }
    }    
}
