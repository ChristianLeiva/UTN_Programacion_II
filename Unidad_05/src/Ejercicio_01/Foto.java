package Ejercicio_01;

/**
 *
 * @author Christian Leiva
 */
public class Foto {
    private String imagen;
    private String formato;
    
    public Foto(String _imagen, String _formato){
        setImagen(_imagen);
        setFormato(_formato);
    }
    
    public Foto(){
        this.imagen = "Imagen_por_defecto";
        this.formato = "JPG";
    }
    
    private boolean validarString(String cadena){
        return (cadena != null && cadena.length() > 0);
    }

    public void setImagen(String _imagen) {
        if(validarString(_imagen)){
            this.imagen = _imagen;
        }
    }

    public void setFormato(String _formato) {
        if(validarString(_formato)){
            this.formato = _formato;
        }
    }
    
    //toString
    @Override
    public String toString() {
        return "{" + "imagen=" + imagen + ", formato=" + formato + '}';
    }
    
    
    
    
}
