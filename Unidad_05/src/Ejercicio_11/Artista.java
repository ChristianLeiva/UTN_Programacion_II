
package Ejercicio_11;

/**
 *
 * @author Christian Leiva
 */
public class Artista {
    
    private String nombre;
    private String genero;

    public Artista(String _nombre, String _genero) {
        setNombre(_nombre);
        setGenero(_genero);
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

    public String getGenero() {
        return genero;
    }

    public void setGenero(String _genero) {
        if(validarString(_genero)){
            this.genero = _genero;
        }else{
            System.out.println("Error: Ingresar un genero valido.");
        }
    }

    @Override
    public String toString() {
        return "\nArtista:\n\tNombre: " + nombre + "\n\tGenero: " + genero;
    }
    
    
    
    
    
    
}
