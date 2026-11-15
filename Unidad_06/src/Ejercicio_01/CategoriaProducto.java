package Ejercicio_01;

/**
 *
 * @author Christian Leiva
 */
public enum CategoriaProducto {
    ALIMENTOS("Productos comestibles"),
    ELECTRONICA("Dispositivos electronicos"),
    ROPA("Prendas de vestir"),
    HOGAR("Articulos para el hogar");
    
    private final String descripcion;
    
    CategoriaProducto(String _descripcion){
        this.descripcion = _descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
