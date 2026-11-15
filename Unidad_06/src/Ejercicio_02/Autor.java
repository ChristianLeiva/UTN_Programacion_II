package Ejercicio_02;

/**
 *
 * @author Christian Leiva
 */
public class Autor {
    private String id;
    private String nombre;
    private String nacionalidad;
    
    public Autor(String _id, String _nombre, String _nacionalidad){
        setId(_id);
        setNombre(_nombre);
        setNacionalidad(_nacionalidad);        
    }
    
    private boolean validarString(String cadena){
        if(cadena != null && cadena.length() > 0){
            return true;
        }
        return false;
    }

    public String getId() {
        return id;
    }

    public void setId(String _id) {
        if(validarString(_id)){
            this.id = _id;
        }else{
            System.out.println("Error: Ingresar un ID valido.");
        }        
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

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String _nacionalidad) {
        if(validarString(_nacionalidad)){
            this.nacionalidad = _nacionalidad;
        }else{
            System.out.println("Error: Ingresar una nacionalidad valido.");
        } 
    }
    
    public void mostrarInfo(){
        System.out.println("ID: " + id + " | Nombre: " + nombre + " | Nacionalidad: " + nacionalidad);
    }

    @Override
    public String toString() {
        return "Autor{" + "id=" + id + ", nombre=" + nombre + ", nacionalidad=" + nacionalidad + '}';
    }

    
}
