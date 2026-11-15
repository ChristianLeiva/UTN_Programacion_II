package Ejercicio_04;
import java.time.LocalDate;

/**
 *
 * @author Christian Leiva
 */
public class TarjetaDeCredito {
    private String numero;
    private LocalDate fechaVencimiento;
    private Banco banco;
    private Cliente cliente;

    public TarjetaDeCredito(String _numero, Banco _banco, Cliente _cliente) {
        setNumero(_numero);
        this.fechaVencimiento = LocalDate.now().plusYears(5);
        this.banco = _banco;
        this.cliente = _cliente;
    }
    
    private boolean validarString(String cadena){
        return (cadena != null && cadena.length() > 0);
    }
    
    public void asignarCliente(Cliente _cliente) {
        this.cliente = _cliente;
        if (_cliente != null && _cliente.getTarjetaDeCredito() != this) {
            _cliente.setTarjetaDeCredito(this);
        }
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        if(validarString(numero)){
            this.numero = numero;
        }else{
            System.out.println("Error: Ingrese un numero valido.");
        }
    }    

    @Override
    public String toString() {
        return "Tarjeta de Credito:\n\tNumero: " + numero + "\n\tFecha de Vencimiento: " + fechaVencimiento +"" + banco + "" + cliente;   
    }
    
    
}
