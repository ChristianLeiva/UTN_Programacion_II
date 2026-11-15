package Ejercicio_10;

/**
 *
 * @author Christian Leiva
 */
public class CuentaBancaria {
    
    private String cbu;
    private Double saldo;
    private Titular titular;
    private ClaveSeguridad claveSeguridad;

    public CuentaBancaria(String _cbu, Double _saldo, String _codigo, Titular _titular) {
        setCbu(_cbu);
        setSaldo(_saldo);
        this.claveSeguridad = new ClaveSeguridad(_codigo); 
        asignarTitular(_titular);        
    }
    
    private boolean validarString(String cadena){
        return (cadena != null && cadena.length() > 0);
    }
    
    public void asignarTitular(Titular newTitular){
        this.titular = newTitular;
        
        if(newTitular != null && newTitular.getCuentaBancaria() != this ){
            newTitular.setCuentaBancaria(this);
        }
    }

    public String getCbu() {
        return cbu;
    }

    public void setCbu(String cbu) {
        if(validarString(cbu)){
            this.cbu = cbu;
        }else{
            System.out.println("Error: Ingrese un CBU valido.");
        }
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        if(saldo >= 0.0){
            this.saldo = saldo;
        }else{
            System.out.println("Error: Ingrese un saldo valido.");
        }
    }

    @Override
    public String toString() {
        return "Cuenta Bancaria:\n\tCBU: " + cbu + "\n\tSaldo: " + saldo + titular + claveSeguridad;
    }
    
}
