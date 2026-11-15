package Ejercicio_13;

/**
 *
 * @author Christian Leiva
 */
public class GeneradorQR {
    
    public CodigoQR generar(String _valor, Usuario _usuario){
        System.out.println("Generando codigo QR...");
        return new CodigoQR(_valor, _usuario);
        
    }
}
