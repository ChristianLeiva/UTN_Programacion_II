package Ejercicio_02;

/**
 *
 * @author Christian Leiva
 */
public class Titular {
    private String nombre;
    private String dni;
    private Celular celular;

    public Titular(String _nombre, String _dni) {
        setNombre(_nombre);
        setDni(_dni);
    }
    
    private boolean validarString(String cadena){
        return (cadena != null && cadena.length() > 0);
    }

    public void setNombre(String _nombre) {
        if(validarString(_nombre)){
            this.nombre = _nombre;
        }else{
            System.out.println("Error: Ingrese un nombre valido.");
        }            
    }

    public void setDni(String _dni) {
        if(validarString(_dni)){
            this.dni = _dni;
        }else{
            System.out.println("Error: Ingrese un DNI valido.");
        }
    }
    
    public Celular getCelular(){
        return this.celular;
    }
    
    public void setCelular(Celular _celular){
        this.celular = _celular;
    }

    @Override
    public String toString() {
        return "Titular{" + "nombre=" + nombre + ", dni=" + dni + '}';
    }


    
    
}
