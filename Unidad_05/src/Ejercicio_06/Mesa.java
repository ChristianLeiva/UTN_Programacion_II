package Ejercicio_06;

/**
 *
 * @author Christian Leiva
 */
public class Mesa {
    private int numero;
    private int capacidad;

    public Mesa(int _numero, int _capacidad) {
        setNumero(_numero);
        setCapacidad(_capacidad);
  
    }
    
    private boolean validarNumero(int numero){
        return(numero > 0);
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int _numero) {
        if(validarNumero(_numero)){
            this.numero = _numero;
        }else{
            System.out.println("Error: Ingrese un numero valido.");
        }
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        if(validarNumero(capacidad)){
            this.capacidad = capacidad;
        }else{
            System.out.println("Error: Ingrese una capacidad valida.");
        }
    }

    @Override
    public String toString() {
        return "\nMesa:\n\tNumero de Mesa: " + numero + "\n\tCapacidad: " + capacidad+" personas.";
    }
    
    
    
    
    
    
    
}
