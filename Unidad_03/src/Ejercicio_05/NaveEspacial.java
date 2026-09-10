
package Ejercicio_05;

/**
 *
 * @author Christian Leiva
 */
public class NaveEspacial {
    
    private String nombre;
    private double combustible;
    private final double CAPACIDAD_MAXIMA = 100.0;
    
    private boolean cargarString(String _texto) {
        return _texto != null && !_texto.isEmpty();
    }
    
    public void despegar() {
        double costoDespegue = 5.0;
        
        if (this.combustible >= costoDespegue) {
            this.combustible -= costoDespegue;
            System.out.println("La nave " + this.nombre + " ha despegado con éxito!");
        } else {
            System.out.println("Error: Combustible insuficiente para despegar.");
        }
    }
    
    public void avanzar(double _distancia) {
        double costoViaje = _distancia * 2.0;
        

        if (this.combustible >= costoViaje) {
            this.combustible -= costoViaje;
            System.out.println("La nave avanzó " + _distancia + " km. Combustible restante: " + this.combustible);
        } else {
            System.out.println("Error: No hay suficiente combustible para avanzar " + _distancia + " km.");
        }
    }
    
    public void recargarCombustible(double _cantidad) {
        if (_cantidad > 0) {
            // Usamos Math.min para asegurar que nunca supere la CAPACIDAD_MAXIMA (100.0)
            double nuevaCantidad = this.combustible + _cantidad;
            this.combustible = Math.min(CAPACIDAD_MAXIMA, nuevaCantidad);
            System.out.println("Recarga exitosa. Combustible actual: " + this.combustible);
        } else {
            System.out.println("Error: La cantidad a recargar debe ser mayor a 0.");
        }
    }
    
    public void mostrarEstado() {
        System.out.println("--- Estado de la Nave Espacial ---");
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Combustible actual: " + this.combustible + " / " + CAPACIDAD_MAXIMA);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String _nombre) {
        if (cargarString(_nombre)) {
            this.nombre = _nombre;
        } else {
            System.out.println("Error al ingresar el nombre de la nave.");
        }
    }

    public double getCombustible() {
        return combustible;
    }

    public void setCombustible(double _combustible) {
        // Blindamos el setter para que el _combustible se mantenga entre 0 y la capacidad máxima
        this.combustible = Math.max(0.0, Math.min(CAPACIDAD_MAXIMA, _combustible));
    }
}
