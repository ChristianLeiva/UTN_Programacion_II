package Ejercicio_06;

/**
 *
 * @author Christian Leiva
 */
public class Cliente {
    private String nombre;
    private String telefono;

    public Cliente(String _nombre, String _telefono) {
        setNombre(_nombre);
        setTelefono(_telefono);
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
            System.out.println("Erro: Ingresar un nombre valido.");
        }
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        if(validarString(telefono)){
            this.telefono = telefono;
        }else{
            System.out.println("Error: ingresar un telefono valido.");
        }
    }

    @Override
    public String toString() {
        return "\nCliente:\n\tNombre: " + nombre + "\n\tTelefono: " + telefono;
    }
    
    
    
    
    
    
    
    
}
