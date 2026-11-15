package Ejercicio_03;

/**
 *
 * @author Christian Leiva
 */
public class Autor {
    private String nombre;
    private String nacionalidad;

    public Autor(String _nombre, String _nacionalidad) {
        setNombre(_nombre);
        setNacionalidad(_nacionalidad);
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

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String _nacionalidad) {
        if(validarString(_nacionalidad)){
            this.nacionalidad = _nacionalidad;
        }else{
            System.out.println("Error: Ingresar una nacionalidad valida.");
        }
    }

    @Override
    public String toString() {
        return "Autor\n\tNombre: " + nombre + "\n\tNacionalidad: " + nacionalidad;
    }   
}
