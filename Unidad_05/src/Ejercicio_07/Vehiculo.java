package Ejercicio_07;

/**
 *
 * @author Christian Leiva
 */
public class Vehiculo {
    
    private String modelo;
    private String patente;
    private Motor motor;
    private Conductor conductor;

    public Vehiculo(String _modelo, String _patente, Motor _motor, Conductor _conductor) {
        setModelo(_modelo);
        setPatente(_patente);
        this.motor = _motor;
        asignarConductor(_conductor);
    }
    
    private boolean validarString(String cadena){
        return (cadena != null && cadena.length() > 0);
    }
    
    
    public void asignarConductor(Conductor newConductor){
        this.conductor = newConductor;
        if(newConductor != null && newConductor.getVehiculo() != this){
            newConductor.setVehiculo(this);
        }
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String _modelo) {
        if(validarString(_modelo)){
            this.modelo = _modelo;
        }else{
            System.out.println("Error: Ingrese un modelo de auto valido.");
        }
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String _patente) {
        if(validarString(_patente)){
            this.patente = _patente;
        }else{
            System.out.println("Error: Ingrese una patente valida.");
        }
    }

    @Override
    public String toString() {
        return "Informacion del Vehiculo \n\tModelo: " + modelo + "\n\tPatente: " + patente + motor + conductor;
    }
    
    
    
    
    
    
}
