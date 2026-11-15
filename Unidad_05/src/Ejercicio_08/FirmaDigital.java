package Ejercicio_08;
import java.time.LocalDate;

/**
 *
 * @author Christian Leiva
 */
public class FirmaDigital {
    
    private String codigoHash;
    private LocalDate fecha;
    private Usuario usuario;

    public FirmaDigital(String _codigoHash, Usuario _usuario) {
        setCodigoHash(_codigoHash);
        this.fecha = LocalDate.now();
        this.usuario = _usuario;
    }
    
    private boolean validarString(String cadena){
        return (cadena != null && cadena.length() > 0);
    }

    public String getCodigoHash() {
        return codigoHash;
    }

    public void setCodigoHash(String _codigoHash) {
        if(validarString(_codigoHash)){
            this.codigoHash = _codigoHash;
        }else{
            System.out.println("Error: Ingrese un codigo hash valido.");
        }
    }

    public LocalDate getFecha() {
        return fecha;
    }    

    @Override
    public String toString() {
        return "\nFirma Digital: \n\tCodigo Hash: " + codigoHash + "\n\tFecha: " + fecha + usuario;
    }   
}
