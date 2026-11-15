package Ejercicio_12;

/**
 *
 * @author Christian Leiva
 */
public class NewMain {

    public static void main(String[] args) {
        Contribuyente contribuyente = new Contribuyente("Pepe Argento", "23-23456789-9");
        Impuesto impuesto = new Impuesto(21, contribuyente);
        Calculadora calculadora = new Calculadora();
        calculadora.calcular(impuesto);
       
    }

}
