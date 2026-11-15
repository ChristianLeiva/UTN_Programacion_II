package Ejercicio_04;

/**
 *
 * @author Christian Leiva
 */
public class Banco {
    private String nombre;
    private String cuit;

    public Banco(String _nombre, String _cuit) {
        setNombre(_nombre);
        setCuit(_cuit);
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

    public String getCuit() {
        return cuit;
    }

    public void setCuit(String _cuit) {
        if(validarString(_cuit)){
            this.cuit = _cuit;
        }else{
            System.out.println("Error: Ingrese un CUIT Valido.");
        }
    }

    @Override
    public String toString() {
        return "\nBanco:\n\tNombre: " + nombre + "\n\tCUIT: " + cuit;
    }
    
    
    
    
}
