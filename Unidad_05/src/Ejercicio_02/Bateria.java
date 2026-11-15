package Ejercicio_02;

/**
 *
 * @author Christian Leiva
 */
public class Bateria {
    private String marca;
    private double capacidad;

    public Bateria(String marca, double capacidad) {
        this.marca = marca;
        this.capacidad = capacidad;
    }
    
    private boolean validarString(String cadena){
        return (cadena != null && cadena.length() > 0);
    }

    public void setMarca(String _marca) {
        if(validarString(_marca)){
            this.marca = _marca;
        }else{
            System.out.println("Error: Ingrese una marca valida.");
        }        
    }

    public void setCapacidad(double _capacidad) {
        if(_capacidad >= 0.0 && _capacidad <= 100.0){
            this.capacidad = _capacidad;            
        }else{
            System.out.println("Error: Ingrese una capacidad valida 0-100");
        }
    }

    @Override
    public String toString() {
        return "Bateria{" + "marca=" + marca + ", capacidad=" + capacidad + '}';
    }
    
    
    

    
}
