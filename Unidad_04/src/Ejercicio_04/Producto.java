package Ejercicio_04;

/**
 *
 * @author Christian Leiva
 */
public class Producto {
    private String nombre;
    private double precioBase;
    private double precioConDescuento;
    static private double IVA = 0.21;
    
    public Producto(String _nombre, double _precioBase) {
        setNombre(_nombre);
        setPrecioBase(_precioBase);
    }
    
    public Producto(String _nombre) {
        setNombre(_nombre);
        this.precioBase = 100;
        this.precioConDescuento = 100;
    }
    
    //Metodos utiles
    private boolean validarString(String cadena) {
        return cadena.length() > 0 ? true : false;
    }
    
    private boolean validarPrecio (double _precioBase) {
        return (_precioBase >= 0.0) ? true : false;
    }   

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String _nombre) {
        if(validarString(_nombre)) {
            this.nombre = _nombre;            
        }else{
            System.out.println("Error: No se puede cargar un nombre vacio.");
        }
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double _precioBase) {
        if(validarPrecio(_precioBase)) {
            this.precioBase = _precioBase;
            this.precioConDescuento = _precioBase;
        }else{
            System.out.println("Error: No se puede cargar un precio negativo.");
        }
    }
    
    //Metodos para calcular descuentos
    public void aplicarDescuento(double descuento) {
        double montoDescuento = this.precioBase * (descuento / 100.0);
        this.precioConDescuento = this.precioBase - montoDescuento;        
    }
    
    //Metodo sobrecargado
    public void aplicarDescuento(double descuento, double precioMinimo) {
        double montoDescuento = this.precioBase * (descuento / 100.0);
        double precioCalculado = this.precioBase - montoDescuento;
        
        this.precioConDescuento = Math.max(precioMinimo, precioCalculado);
    }
    
    //Metodo para calcular el precio final
    public double calcularPrecioFinal() {
        return this.precioConDescuento * (1 + IVA);
    }
    
    public static void cambiarIVA(double newIVA) {
        if(newIVA > 0) {
            IVA = newIVA;            
        }else{
            System.out.println("Error: No se puede actualizar el iva a un numero negativc.");
        }
        
    }
    
    //toString
    @Override
    public String toString() {
        return "\nProducto: " + this.nombre + "\n\tPrecio Base: $" + this.precioBase + "\n\tPrecio Final: $" + this.calcularPrecioFinal() + ".";
    }
}