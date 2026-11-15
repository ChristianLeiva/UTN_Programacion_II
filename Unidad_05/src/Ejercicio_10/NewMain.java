package Ejercicio_10;

/**
 *
 * @author Christian Leiva
 */
public class NewMain {

    public static void main(String[] args) {
       Titular titular = new Titular("Christian Leiva", "33.439.058");
       CuentaBancaria cuenta_bancaria = new CuentaBancaria("13465798885", 5000000.0, "CLAVE123", titular);
       
        System.out.println(cuenta_bancaria.toString());
    }

}
