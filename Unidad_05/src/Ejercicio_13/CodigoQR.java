package Ejercicio_13;

/**
 *
 * @author Christian Leiva
 */
public class CodigoQR {
    
    private String valor;
    private Usuario usuario;

    public CodigoQR(String _valor, Usuario usuario) {
        setValor(_valor);
        this.usuario = usuario;
    }
    
    private boolean validarString(String cadena){
        return (cadena != null && cadena.length() > 0);
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String _valor) {
        if(validarString(_valor)){
            this.valor = _valor;
        }else{
            System.out.println("Error: Ingrese un valor valido.");
        }
    }

    @Override
    public String toString() {
        return "Codigo QR [Valor: " + valor + " | Perteneciente a: " + usuario.getNombre() + "]";
    }   
}
