package Ejercicio_08;

/**
 *
 * @author Christian Leiva
 */
public class Documento {
    private String titulo;
    private String contenido;
    private FirmaDigital firmaDigital;

    public Documento(String _titulo, String _contenido, String _codigoHash, Usuario _usuario) {
        setTitulo(_titulo);
        setContenido(_contenido);
        this.firmaDigital = new FirmaDigital(_codigoHash, _usuario);
        
    }
    
    private boolean validarString(String cadena){
        return (cadena != null && cadena.length() > 0);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String _titulo) {
        if(validarString(_titulo)){
            this.titulo = _titulo;
        }else{
            System.out.println("Error: Ingrese un titulo valido.");
        }
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String _contenido) {
        if(validarString(_contenido)){
            this.contenido = _contenido;
        }else{
            System.out.println("Error: Ingrese un contenido valido.");
        }
    }

    @Override
    public String toString() {
        return "Informacion del Documento:\n\tTitulo: " + titulo + "\n\tContenido: " + contenido + firmaDigital;
    }
    
    
    
    
    
    
}
