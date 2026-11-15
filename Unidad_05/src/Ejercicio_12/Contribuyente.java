package Ejercicio_12;

/**
 *
 * @author Christian Leiva
 */
public class Contribuyente {
    
    private String nombre;
    private String cuil;

    public Contribuyente(String _nombre, String _cuil) {
        setNombre(_nombre);
        setCuil(_cuil);
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

    public String getCuil() {
        return cuil;
    }

    public void setCuil(String _cuil) {
        if(validarString(_cuil)){
            this.cuil = _cuil;
        }else{
            System.out.println("Error: Ingresar un CUIL valido.");
        }
    }

    @Override
    public String toString() {
        return "\nContribuyente: \n\tNombre: " + nombre + "\n\tCUIL: " + cuil;
    }   
}
