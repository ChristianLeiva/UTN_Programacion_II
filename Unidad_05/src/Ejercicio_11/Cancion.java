package Ejercicio_11;

/**
 *
 * @author Christian Leiva
 */
public class Cancion {
    
    private String cancion;
    private Artista artista;

    public Cancion(String cancion, Artista artista) {
        this.cancion = cancion;
        this.artista = artista;
    }
    
    private boolean validarString(String cadena){
        return (cadena != null && cadena.length() > 0);
    }

    public String getCancion() {
        return cancion;
    }

    public void setCancion(String _cancion) {
        if(validarString(_cancion)){
            this.cancion = _cancion;
        }else{
            System.out.println("Error: Ingresar una nombre de cancion valido.");
        }
    }

    @Override
    public String toString() {
        return " "+cancion + artista;
    }
    
    
    
    
    
}
