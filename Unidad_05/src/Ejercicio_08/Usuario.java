package Ejercicio_08;

/**
 *
 * @author Christian Leiva
 */
public class Usuario {
    private String nombre;
    private String email;

    public Usuario(String _nombre, String _email) {
        setNombre(_nombre);
        setEmail(_email);
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String _email) {
        if(validarString(_email)){
            this.email = _email;
        }else{
            System.out.println("Error: Ingrese un email valido.");
        }
    }

    @Override
    public String toString() {
        return "\nUsuario: \n\tNombre: " + nombre + "\n\tEmail: " + email;
    }
    
    
    
    
}
