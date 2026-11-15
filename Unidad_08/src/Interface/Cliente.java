package Interface;

/**
 *
 * @author Christian Leiva
 */
public class Cliente implements Notificable{
    
    private String nombre;

    public Cliente(String _nombre) {
        setNombre(_nombre);
    }

    public String getNombre() {
        return nombre;
    }

    private void setNombre(String _nombre) {
        if(_nombre != null && _nombre.length() > 0){
            this.nombre = _nombre;
        }else{
            System.out.println("Error: ingresar nombre valido.");
        }
    }

    @Override
    public void notificarCambioDeEstado(EstadoPedido estado) {
        System.out.println("\nActualizacion de estado:\n\tCliente: "+nombre+"\n\tEstado Actual: "+ estado+"\n");
    }
    
    
}
