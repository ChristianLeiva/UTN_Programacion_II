
package Ejercicio_02;

/**
 *
 * @author Christian Leiva
 */
public class Libro {
    private String titulo;
    private String autor;
    static private String editorial = "Independiente";
    
    public Libro(String _titulo, String _autor, String _editorial){
        setTitulo(_titulo);
        setAutor(_autor);
        setEditorial(_editorial);
    }
    
    public Libro(String _titulo, String _autor) {
        setTitulo(_titulo);
        setAutor(_autor);
    }
    
    private boolean validarString(String cadena) {
        return cadena.length() > 0 ? true : false;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String _titulo) {
        if(validarString(_titulo)){
            this.titulo = _titulo;
        }else{
            System.out.println("Error: no se puede ingresar un titulo vacio.");
        }        
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String _autor) {
        if(validarString(_autor)){
            this.autor = _autor;
        }else{
            System.out.println("Error: no se puede ingresar un autor vacio.");
        }        
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String _editorial) {
        if(validarString(_editorial)){
            this.editorial = _editorial;
        }else{
            System.out.println("Error: no se puede ingresar una editorial vacio.");
        }        
    }
    
    //Metodo para cambiar el titulo
    public void actualizarTitulo(String _titulo) {
        if(validarString(_titulo)){
            this.titulo = _titulo;
            System.out.println("Se actualizo el titulo con exito.");
        }else{
            System.out.println("Error: No se pudo actualizar el titulo.");
        }
    }
    
    public void actualizarTitulo(String prefijo, String tituloNuevo) {
        if( validarString(prefijo) && validarString(tituloNuevo)){
            this.titulo = prefijo+" "+tituloNuevo;
            System.out.println("Titulo actualizado con exito.");
        }else{
            System.out.println("Error: No se pudo actualizar el titulo.");
        }
    }
    
    //
    public static void actualiarEditorial(String editorialNueva){
        if(editorialNueva.length() > 0){
            editorial = editorialNueva;
            System.out.println("Se actualizo la editorial con exito.");
        }else{
            System.out.println("Error: no se puede ingresar una editorial vacia.");
        }
    }
    
    @Override
    public String toString() {
        return "\nLibro: "+this.titulo+"\nAutor: "+this.autor+"\nEditorial: "+this.editorial+".";
    }    
}
