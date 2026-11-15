package Ejercicio_13;

/**
 *
 * @author Christian Leiva
 */
public class NewMain {

    public static void main(String[] args) {
        Usuario usuario = new Usuario("Christian Leiva", "christian@example.com");
        GeneradorQR generador = new GeneradorQR();
        CodigoQR miQr = generador.generar("Entrada del cine.", usuario);
        System.out.println(miQr.toString());       
    }

}
