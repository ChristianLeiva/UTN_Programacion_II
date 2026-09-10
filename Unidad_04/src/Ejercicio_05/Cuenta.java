package Ejercicio_05;

/**
 *
 * @author Christian Leiva
 */
public class Cuenta {
    private final int numero;
    private String titular;
    private double saldo;
    private static int ultimoNumero = 100;
    private static int totalCuentas;
    
    // Constructor completo
    public Cuenta(String _titular, double _saldo) {
        this.numero = ultimoNumero;
        setTitular(_titular);
        setSaldo(_saldo);
        ultimoNumero++;
        totalCuentas++;
    }
    
    // Si tenés un constructor vacío o con un solo parámetro, TAMBIÉN debe hacerlo:
    public Cuenta(String _titular) {
        this.numero = ultimoNumero;
        setTitular(_titular);
        this.saldo = 0.0;
        ultimoNumero++;
        totalCuentas++;
    }
    
    //Funciones utiles
    public boolean validarString(String cadena) {
        return (cadena.length() > 0) ? true : false;
    }
    
    public boolean validarIngreso(double ingreso) {
        return (ingreso >= 0) ? true : false;
    }
    
    public int getNumero() {
        return this.numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String _titular) {
        if(validarString(_titular)){
            this.titular = _titular;
        }else{
            System.out.println("Error: No se puede cagar un titular vacio");
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double _saldo) {
        if(validarIngreso(_saldo)) {
            this.saldo = _saldo;
        }else{
            System.out.println("Error: No se puede cargar un saldo negativo.");
        }
    }
    
    //Metodos    
    public double consultarSaldo() {
        return this.saldo;
    }
    
    //Metodo Sobrecargado
    public double consultarSaldo(double cotizacionDolar) {
        //cotizacion dolar 1360
        return Double.parseDouble(String.format("%.2f", (this.saldo / 1360)));
    }
    
    //depositar
    public void depositar(double monto) {
        if(validarIngreso(monto)){
            this.saldo += monto;
            System.out.println("Deposito con exito: su nuevo saldo es: $"+this.saldo);
        }else{
            System.out.println("Error: no se puede depositar un saldo negativo.");
        }       
    }
    
    //extracción
    public void extraer(double monto) {
        if(monto <= this.saldo){
            this.saldo -= monto;
            System.out.println("Extraccion con exito: su nuevo saldo nuevo es: $"+this.saldo);
        }else{
            System.out.println("Error: Saldo insuficiente");
        }
    }
    
    public static void mostrarTotalCuentas() {
        System.out.println("El total de cuentas creadas es: "+totalCuentas);
    }
    
    //toString
    @Override
    public String toString() {
        return "\nNumero de cuenta: "+this.numero+"\n\tTitular: "+this.titular+"\n\tSaldo disponible: "+this.saldo;
    }
    
}
