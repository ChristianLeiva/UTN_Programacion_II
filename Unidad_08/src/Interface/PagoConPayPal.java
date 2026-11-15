package Interface;

/**
 *
 * @author Christian Leiva
 */
public class PagoConPayPal implements PagoConDescuento {
    
    private double porcentajeDescuento;
    
    public PagoConPayPal(double _porcentajeDescuento){
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
        System.out.println("\nProcesando Pago PayPal:\n\tMonto Original: "+monto+"\n\tDescuento Aplicado del: "+porcentajeDescuento+".\n\tTotal: "+(monto - montoFinal));
    }
    
}
