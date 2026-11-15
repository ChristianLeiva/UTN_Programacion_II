package Ejercicio_02;

/**
 *
 * @author Christian Leiva
 */
public class Libro {
    private String isbn;
    private String titulo;
    private int anioPublicacion;
    private Autor autor;
    
    //constructor
    public Libro(String _isbn, String _titulo, int _anioPublicacion, Autor _autor){
        setIsbn(_isbn);
        setTitulo(_titulo);
        setAnioPublicacion(_anioPublicacion);
        setAutor(_autor);       
    }
    
    private boolean validarString(String cadena){
        if(cadena != null && cadena.length() > 0){
            return true;
        }
        return false;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String _isbn) {
        if(validarString(_isbn)){
            this.isbn = _isbn;
        }else{
            System.out.println("Error: Ingresar un ISBN valido.");
        }        
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String _titulo) {
        if(validarString(_titulo)){
        this.titulo = _titulo;
        }else{
            System.out.println("Error: Ingresar un titulo valido.");
        }
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        if(anioPublicacion >= 0){
            this.anioPublicacion = anioPublicacion;
        }else{
            System.out.println("Error: Ingresar un anio de publicacion valido.");
        }
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor _autor) {
        if(_autor != null){
            this.autor = _autor;
        }else{
            System.out.println("Error: Ingresar un autor valido.");
        }
    }
    
    public void mostrarInfo(){
        System.out.println("ISBN: " + isbn + " | Titulo: " + titulo + " | Anio de Publicacion: " + anioPublicacion + " | Autor: "+ autor);
    }

    @Override
    public String toString() {
        return "Libro{" + "isbn=" + isbn + ", titulo=" + titulo + ", anioPublicacion=" + anioPublicacion + ", autor=" + autor + '}';
    }
    
    
}
