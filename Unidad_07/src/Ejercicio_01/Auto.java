package Ejercicio_01;

/**
 *
 * @author Christian Leiva
 */
public class Auto extends Vehiculo {
    
    private int cantidadPuertas;

    public Auto(int cantidadPuertas, String marca, String modelo) {
        super(marca, modelo);
        this.cantidadPuertas = cantidadPuertas;
    }

    public int getCantidadPuertas() {
        return cantidadPuertas;
    }

    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Cantidad de puertas: "+cantidadPuertas);
      
    }
}
