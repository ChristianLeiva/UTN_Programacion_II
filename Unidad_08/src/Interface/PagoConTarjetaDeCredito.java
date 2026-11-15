package Interface;

/**
 *
 * @author Christian Leiva
 */
public class PagoConTarjetaDeCredito implements PagoConDescuento {
    
    private double porcentajeDescuento;
    
    public PagoConTarjetaDeCredito(double _porcentajeDescuento){
        setPorcentajeDescuento(_porcentajeDescuento);
    }
    
    private void setPorcentajeDescuento(double _porcentajeDescuento){
        if(_porcentajeDescuento > 0.0){
            this.porcentajeDescuento = _porcentajeDescuento;
        }
    }

    @Override
    public double aplicarDescuento(double monto) {
        return monto - (monto * (porcentajeDescuento / 100));
    }

    @Override
    public void procesarPago(double monto) {
        double montoFinal = aplicarDescuento(monto);
        System.out.println("\nProcesando Pago con Tarjeta de Credito:" +
            "\n\tMonto Original: " + monto +
            "\n\tDescuento Aplicado del: " + porcentajeDescuento + "%" +
            "\n\tTotal: " + montoFinal);
    }
    
}
