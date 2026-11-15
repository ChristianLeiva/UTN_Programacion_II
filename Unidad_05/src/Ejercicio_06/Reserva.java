package Ejercicio_06;

/**
 *
 * @author Christian Leiva
 */
public class Reserva {
    //voy a manejar estas variables con String para evitar trabajar de mas
    private String fecha;
    private String hora;
    private Mesa mesa;
    private Cliente cliente;

    public Reserva(String _fecha, String _hora, Mesa _mesa, Cliente _cliente) {
        setFecha(_fecha);
        setHora(_hora);
        this.mesa = _mesa;
        this.cliente = _cliente;
    }
    
    private boolean validarString(String cadena){
        return (cadena != null);
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String _fecha) {
        if(validarString(_fecha)){
            this.fecha = _fecha;
        }else{
            System.out.println("Error: Ingresar una fecha valida.");
        }
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String _hora) {
        if(validarString(_hora)){
            this.hora = _hora;
        }else{
            System.out.println("Error: Ingrese una hora valida.");
        }
    }

    @Override
    public String toString() {
        return "Informacion de la Reserva:\n\tFecha: " + fecha + "\n\tHora: " + hora + mesa + cliente;
    }
    
    
    
    
    
    
}
