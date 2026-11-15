package Ejercicio_06;

/**
 *
 * @author Christian Leiva
 */
public class NewMain {

    public static void main(String[] args) {
        Cliente cliente_01 = new Cliente("Christian Leiva", "298-4209071");
        Mesa mesa_01 = new Mesa(2, 4);
        Reserva reserva_01 = new Reserva("17/09/2026", "12:00", mesa_01, cliente_01);
        System.out.println(reserva_01.toString());

       
    }

}
