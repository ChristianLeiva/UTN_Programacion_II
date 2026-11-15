package Ejercicio_03;

/**
 *
 * @author Christian Leiva
 */
public class Editorial {
    private String nombre;
    private String direccion;

    public Editorial(String _nombre, String _direccion) {
        setNombre(_nombre);
        setDireccion(_direccion);
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
            System.out.println("Error: Ingresar un nombre valido.");
        }
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String _direccion) {
        if(validarString(_direccion)){
            this.direccion = _direccion;
        }else{
            System.out.println("Error: Ingresar una direccion valida.");
        }
    }

    @Override
    public String toString() {
        return "Editorial\n\tNombre: " + nombre + "\n\tDireccion: " + direccion;
    }    
}