package Ejercicio_07;

/**
 *
 * @author Christian Leiva
 */
public class Conductor {
    private String nombre;
    private String licencia;
    private Vehiculo vehiculo;

    public Conductor(String _nombre, String _licencia) {
        setNombre(_nombre);
        setLicencia(_licencia);
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

    public String getLicencia() {
        return licencia;
    }

    public void setLicencia(String _licencia) {
        if(validarString(_licencia)){
            this.licencia = _licencia;
        }else{
            System.out.println("Error: Ingresar una licencia valida.");
        }        
    }
    
    public Vehiculo getVehiculo(){
        return this.vehiculo;
    }
    
    public void setVehiculo(Vehiculo _vehiculo){
        this.vehiculo = _vehiculo;
    }

    @Override
    public String toString() {
        return "\nConductor:\n\tnombre: " + nombre + "\n\tLicencia: " + licencia;
    }
    
    
    
    
}
