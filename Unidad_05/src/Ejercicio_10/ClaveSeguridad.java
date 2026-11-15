package Ejercicio_10;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Christian Leiva
 */
public class ClaveSeguridad {
    
    private String codigo;
    private LocalDateTime ultimaModificacion;

    public ClaveSeguridad(String _codigo) {
        setCodigo(_codigo);
        this.ultimaModificacion = LocalDateTime.now();
    }
    
    private boolean validarString(String cadena){
        return (cadena != null && cadena.length() > 0);
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String _codigo) {
        if(validarString(_codigo)){
            this.codigo = _codigo;
        }else{
            System.out.println("Error: Ingrese un codigo valido.");
        }
    }
    
    DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

    @Override
    public String toString() {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        return "\nClave de Seguridad:\n\tCodigo: " + codigo +"\n\tUltima Modificacion: " + ultimaModificacion.format(formato);
    }   
}
