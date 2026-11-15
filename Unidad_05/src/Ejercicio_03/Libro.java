package Ejercicio_03;

/**
 *
 * @author Christian Leiva
 */
public class Libro {
    private String titulo;
    private String isbn;
    private Editorial editorial;
    private Autor autor;

public Libro(String _titulo, String _isbn, Editorial _editorial, Autor _autor) {
        setTitulo(_titulo);
        setIsbn(_isbn);
        this.editorial = _editorial;
        this.autor = _autor;
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

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }
    
    public Autor getAutor(){
        return this.autor;
    }
    
    public void setAutor(Autor _autor){
        this.autor = _autor;
    }

    @Override
    public String toString() {
        return "Informacion del Libro\n\tTitulo: " + titulo + "\n\tISBN: " + isbn + "\n" + editorial + "\n" + autor;
    }
}
