package Ejercicio_14;

/**
 *
 * @author Christian Leiva
 */
public class Proyecto {
    
    private String nombre;
    private int duracionMin;

    public Proyecto(String _nombre, int _duracionMin) {
        setNombre(_nombre);
        setDuracionMin(_duracionMin);
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
    
    public int getDuracionMin() {
        return duracionMin;
    }

    public void setDuracionMin(int _duracionMin) {
        if(_duracionMin > 0){
            this.duracionMin = _duracionMin;
        }else{
            System.out.println("Error: ingresar una duracion valida.");
        }
    }

    @Override
    public String toString() {
        return "Proyecto{" + "nombre=" + nombre + ", duracionMin=" + duracionMin + '}';
    }
    
}
