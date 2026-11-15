package Ejercicio_04;

/**
 *
 * @author Christian Leiva
 */
public class NewMain {

    public static void main(String[] args) {

        Banco banco_01 = new Banco("Banco Nacion", "30-50000493-9");
        Cliente cliente_01 = new Cliente("Christian Leiva", "36.438.087");
        TarjetaDeCredito tarjeta_01 = new TarjetaDeCredito("4509-1234-5678-9010", banco_01, cliente_01);
        System.out.println(tarjeta_01.toString());
       
    }

}
