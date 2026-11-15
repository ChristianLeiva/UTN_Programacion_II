package Ejercicio_01;

/**
 *
 * @author Christian Leiva
 */
public class Titular {
    private String nombre;
    private String dni;
    private Pasaporte pasaporte;
    
    public Titular(String _titular, String _dni){
        setNombre(_titular);
        setDni(_dni);
    }
    
    private boolean validarString(String cadena){
        return (cadena != null && cadena.length() > 0);
    }
    
    public void setNombre(String _nombre) {
        if(validarString(_nombre)){
            this.nombre = _nombre;
        }else{
            System.out.println("Error: ingrese un nombre valido.");
        }        
    }

    public void setDni(String _dni) {
        if(validarString(_dni)){
            this.dni = _dni;
        }else{
            System.out.println("Error: Ingrese un numero valido.");
        }        
    }
    
    public Pasaporte getPasaporte() {
        return pasaporte;
    }

    public void setPasaporte(Pasaporte pasaporte) {
        this.pasaporte = pasaporte;
    }

    //ToString
    @Override
    public String toString() {
        return this.nombre+"\n\tDNI: "+this.dni;
    }    
}
