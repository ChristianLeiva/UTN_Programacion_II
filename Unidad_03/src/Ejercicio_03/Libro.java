package Ejercicio_03;
/**
 *
 * @author Christian Leiva
 */
public class Libro {
    
    private int fechaActual = java.time.Year.now().getValue(); // Fecha Actual        
    private String titulo;
    private String autor;
    private int anioPublicacion;
    
    private boolean cargarString(String _texto){
       return (_texto != null && _texto.length() != 0) ? true : false;
    }
    
    public void mostrarInfo(){
        System.out.println("Informacion del libro: ");
        System.out.println("Titulo: "+this.titulo);
        System.out.println("Autor: "+this.autor);
        System.out.println("Anio de publicacion: "+this.anioPublicacion);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String _titulo) {
        if(cargarString(_titulo)){
            this.titulo = _titulo; 
        }else{
            System.out.println("Error al ingresar el titutlo.");
        }        
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String _autor) {
        if(cargarString(_autor)){
            this.autor = _autor; 
        }else{
            System.out.println("Error al ingresar el autor.");
        }      
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int _anioPublicacion) {
        if (_anioPublicacion > 0 && _anioPublicacion <= this.fechaActual) {
            this.anioPublicacion = _anioPublicacion;
        } else {
            System.out.println("Error: Anio inválido.");
        }
    }    
}
