package Ejercicio_05;

/**
 *
 * @author Christian Leiva
 */
public class Propietario {
    private String nombre;
    private String dni;
    private Computadora computadora;

    public Propietario(String _nombre, String _dni) {
        setNombre(_nombre);
        setDni(_dni);
    }
    
    private boolean validarString(String cadena){
        return (cadena != null && cadena.length() > 0);
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String _nombre) {
        if(validarString(_nombre)){
            this.nombre = _nombre;
        }else{
            System.out.println("Error: Ingrese un nombre valido.");
        }
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String _dni) {
        if(validarString(_dni)){
            this.dni = _dni;
        }else{
            System.out.println("Error: Ingrese un DNI valido.");
        }
    }
    
    public Computadora getComputadora(){
        return this.computadora;
    }
    
    public void setComputadora(Computadora _computadora){
        this.computadora = _computadora;        
    }

    @Override
    public String toString() {
        return "\nPropietario:\n\tNombre: " + nombre + "\n\tDNI: " + dni;
    }
    
    
    
    
    
}
