package Ejercicio_02;

import java.util.ArrayList;

/**
 *
 * @author Christian Leiva
 */
public class Biblioteca {
    public String nombre;
    ArrayList<Libro> libros;
    
    //constructor
    public Biblioteca(String _nombre){
        setNombre(_nombre);
        this.libros = new ArrayList<>();        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String _nombre) {
        if(_nombre != null && _nombre.length() > 0){
            this.nombre = _nombre;
        }else{
            System.out.println("Error: Ingrese un nombre valido.");
        }
    }
    
    public void agregarLibro(String isbn, String titulo, int anioPublicacion, Autor autor ){
        Libro newLibro = new Libro(isbn, titulo, anioPublicacion, autor);
        libros.add(newLibro);
    }
    
    public void listarLibros(){
        for (Libro l : libros) {
            l.mostrarInfo();            
        }
    }
    
    public Libro buscarLibroPorIsbn(String isbn){
        if(libros.isEmpty()){
            System.out.println("Blblioteca vacia.");
        }
        
        if(isbn != null){
            for (Libro l : libros) {
                if(l.getIsbn().equalsIgnoreCase(isbn)){
                    return l;
                }
            }
        }
        return null;
    }
    
    public boolean eliminarLibro(String isbn){
        Libro l = buscarLibroPorIsbn(isbn);
        if(l != null){
            libros.remove(l);
            listarLibros();
            return true;
        }
        return false;        
    }
    
    public int obtenerCantidadLibros(){
        return libros.size();
    }
    
    public void filtrarLibrosPorAnio(int anio){
        boolean libroEncontrado = false;
        for (Libro l : libros){
            if(l.getAnioPublicacion() == anio){
                l.mostrarInfo();
                libroEncontrado = true;
            }            
        }
        if(!libroEncontrado){
            System.out.println("No se encontraron libros publicados en el anio: "+ anio +".");
        }
    }
    
    public void mostrarAutoresDisponibles(){
        for (Libro l : libros){
            System.out.println(l.getAutor());          
        }
    }
       
}
