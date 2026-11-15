package Interface;

/**
 *
 * @author Christian Leiva
 */
public class NewMain {

    public static void main(String[] args) {

        // Crear cliente
        Cliente cliente = new Cliente("Christian Leiva");

        // Crear productos
        Producto p1 = new Producto("Teclado Mecánico", 45000.0);
        Producto p2 = new Producto("Mouse Inalámbrico", 25000.0);

        // Crear pedido y agregar productos
        Pedido pedido = new Pedido(cliente);
        pedido.agregarProducto(p1);
        pedido.agregarProducto(p2);

        // Notificar inicio de proceso
        pedido.setEstado(EstadoPedido.EN_PROCESO);

        // Calcular total
        double total = pedido.calcularTotal();
        System.out.printf("\nTotal del pedido :"+ total+"\n");

        // Procesar pago con Tarjeta de Credito
        PagoConDescuento medioDePago = new PagoConTarjetaDeCredito(10.0);
        medioDePago.procesarPago(total);

        // Actualizar estado a PAGADO
        pedido.setEstado(EstadoPedido.PAGADO);
    
       
    }

}
