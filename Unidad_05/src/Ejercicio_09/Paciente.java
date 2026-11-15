package Ejercicio_09;

/**
 *
 * @author Christian Leiva
 */
public class Paciente {
    
    private String nombre;
    private String obraSocial;

    public Paciente(String _nombre, String _obraSocial) {
        setNombre(_nombre);
        setObraSocial(_obraSocial);
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

    public String getObraSocial() {
        return obraSocial;
    }

    public void setObraSocial(String _obraSocial) {
        if(validarString(_obraSocial)){
            this.obraSocial = _obraSocial;
        }else{
            System.out.println("Error: Ingrese una obra social valida.");
        }
    }

    @Override
    public String toString() {
        return "\nPaciente:\n\tNombre: " + nombre + "\n\tObra Social: " + obraSocial;
    }
        
}
