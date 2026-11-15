package Ejercicio_03;

/**
 *
 * @author Christian Leiva
 */
public class NewMain {

    public static void main(String[] args) {
        Autor autor_01 = new Autor("Grabiel Garcia Marquez", "Colombia");        
        
        Editorial editorial_01 = new Editorial("Edotorial Sudamericana", "Humberto 1er 555, Buenos Aires.");       

        
        Libro libro_01 = new Libro("Cien anios de Soledad", "978-8437604947", editorial_01, autor_01);
        
        System.out.println(libro_01.toString());
        
        
        
     
    }

}
