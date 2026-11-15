package Ejercicio_01;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
/**
 *
 * @author Christian Leiva
 */
public class Pasaporte {
    private String numero;
    private LocalDate fechaEmision;
    private Foto foto;
    private Titular titular;
    
    public Pasaporte(String _numero, String _imagen, String _formato){
        setNumero(_numero);
        this.fechaEmision = LocalDate.now();
        this.foto = new Foto(_imagen, _formato);
      
    }
    
    private boolean validarNumero(String numero) {
        return (numero != null && numero.length() > 0);
    }
    
    public String mostrarInfoPasaporte(){
        return "Numero: "+this.numero+", Fecha Emision: "+this.fechaEmision+", Foto: "+this.foto;
    }
    
    public void asignarTitular(Titular nuevoTitular) {
        this.titular = nuevoTitular;
        if (nuevoTitular != null && nuevoTitular.getPasaporte() != this) {
            nuevoTitular.setPasaporte(this); 
        }
    }

    public void setNumero(String _numero) {
        if(validarNumero(_numero)){
            this.numero = _numero;
        }else{
            System.out.println("Error: Ingrese un numero valido.");
        }
    }

    public LocalDate getFechaEmision() {
        return fechaEmision;
    }
    
    //ToString
    @Override
    public String toString(){
        return "Informacion Pasaporte:\n\tTitular: "+this.titular+"\n\tNumero: "+this.numero+"\n\tFecha Emision: "+this.fechaEmision+"\n\tFoto: "+this.foto;
    }
    
    
}
