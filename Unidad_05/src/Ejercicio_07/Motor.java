package Ejercicio_07;

/**
 *
 * @author Christian Leiva
 */
public class Motor {
    
    private String tipo;
    private String numeroSerie;

    public Motor(String _tipo, String _numeroSerie) {
        setTipo(_tipo);
        setNumeroSerie(_numeroSerie);
    }
    
    private boolean validarString(String cadena){
        return (cadena != null && cadena.length() > 0);
    }

    public String getModelo() {
        return tipo;
    }

    public void setTipo(String _tipo) {
        if(validarString(_tipo)){
            this.tipo = _tipo;
        }else{
            System.out.println("Error: Ingresar un tipo valido");
        }
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String _numeroSerie) {
        if(validarString(_numeroSerie)){
            this.numeroSerie = _numeroSerie;
        }else{
            System.out.println("Error: Ingrese un numero de serie valido.");
        }
    }

    @Override
    public String toString() {
        return "\nMotor:\n\tTipo: " + tipo + "\n\tNumero de Serie: " + numeroSerie;
    }
    
    
    
    
    
    
}
