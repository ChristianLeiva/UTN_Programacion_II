package Ejercicio_03;

/**
 * Ejercicio 3 de la unidad 3
 * Encapsulamiento de Libros
 * @author Christian Leiva
 */
public class NewMain {

    public static void main(String[] args) {
        
        Libro libro1 = new Libro();
        
        //1. Probar datos invalidos
        libro1.setTitulo("");
        libro1.setAutor("");        
        libro1.setAnioPublicacion(2027);
        
        // 2. Cargar datos correctos
        libro1.setTitulo("El Hobbit");
        libro1.setAutor("J.R.R. Tolkien");
        libro1.setAnioPublicacion(1937);
        
        // 3. Probar metodos
        libro1.mostrarInfo();
        
       
    }

}
