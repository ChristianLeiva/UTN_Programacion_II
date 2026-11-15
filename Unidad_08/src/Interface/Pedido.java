package Interface;

import java.util.ArrayList;

/**
 *
 * @author Christian Leiva
 */
public class Pedido implements Pagable {
    private ArrayList<Producto> productos;
    private EstadoPedido estado;
    private Cliente cliente;

    public Pedido(Cliente cliente) {
        this.productos = new ArrayList<>();
        this.estado = EstadoPedido.PENDIENTE;
        this.cliente = cliente;
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }
    
    public void setEstado(EstadoPedido nuevoEstado){
        this.estado = nuevoEstado;
        if(cliente != null){
            cliente.notificarCambioDeEstado(nuevoEstado);
        }
    }

    @Override
    public double calcularTotal() {
       double total = 0;
        for (Producto p : productos) {
            total += p.calcularTotal();
        }        
        return total;
    }
}
