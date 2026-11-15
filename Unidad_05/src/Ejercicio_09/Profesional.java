package Ejercicio_09;

/**
 *
 * @author Christian Leiva
 */
public class Profesional {
    
    private String nombre;
    private String especialidad;

    public Profesional(String _nombre, String _especialidad) {
        setNombre(_nombre);
        setEspecialidad(_especialidad);
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
            System.out.println("Ingrese un nombre valido.");
        }
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String _especialidad) {
        if(validarString(_especialidad)){
            this.especialidad = _especialidad;
        }else{
            System.out.println("Error: Ingresar una especialidad valida.");
        }
    }

    @Override
    public String toString() {
        return "\nProfesional:\n\tNombre: " + nombre + "\n\tEspecialidad: " + especialidad;
    }
    
        
}
