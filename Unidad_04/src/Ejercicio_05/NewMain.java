package Ejercicio_05;

/**
 * Ejercicio 5 de la unidad 4
 * Gestión de cuentas - banca chica
 * @author Christian Leiva
 */
public class NewMain {

    public static void main(String[] args) {
        Cuenta cuenta_01 = new Cuenta("Christian Leiva", 2000000);
        Cuenta cuenta_02 = new Cuenta("", -500);
        Cuenta cuenta_03 = new Cuenta("Dalma Castro");
        Cuenta cuenta_04 = new Cuenta("Osvaldo Laport");
        
        //Mostrar info
        System.out.println("\n--- Mostrar informacion de cuentas ---");
        System.out.println(cuenta_01.toString());
        System.out.println(cuenta_03.toString());
        System.out.println(cuenta_04.toString());
        
        //Despositar Saldo
        System.out.println("\n--- Despositar saldo de cuenta ---");
        cuenta_03.depositar(-900);
        cuenta_03.depositar(1200000);
        
        //Extraer Saldo
        System.out.println("\n--- Extraer saldo de cuenta ---");
        cuenta_04.extraer(250000);
        cuenta_03.extraer(500000);
        
        //Consultar Saldo
        System.out.println("\n--- Consultar saldo ---");
        System.out.println("Pesos: "+cuenta_01.consultarSaldo());
        System.out.println("USD: "+cuenta_01.consultarSaldo(1360)); //Cotizacion Dolares
        
        //Cantidad de Cuentas
        System.out.println("\n--- Consultar Numero de cuentas ---");
        Cuenta.mostrarTotalCuentas();
        
        //Mostrar info
        System.out.println("\n--- Mostrar informacion de cuentas ---");
        System.out.println(cuenta_01.toString());
        System.out.println(cuenta_03.toString());
        System.out.println(cuenta_04.toString());
    }

}
