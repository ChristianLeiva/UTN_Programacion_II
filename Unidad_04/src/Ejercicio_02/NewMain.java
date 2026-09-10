package Ejercicio_02;

/**
 * Ejercicio 2 de la unidad 4
 * Sistema de gestion de libros
 * @author Christian Leiva
 */
public class NewMain {

    public static void main(String[] args) {
        
        //Carga de libro con el constructor que solicita todos los atributos
        Libro libro_01 = new Libro("Clean Code", "Robert C. Martin", "Prentice Hall");
        Libro libro_02 = new Libro("Effective Java", "Joshua Bloch", "Addison-Wesley");
        Libro libro_03 = new Libro("", "", "");

        //carga de libros con constructor que solicita titulo y autor
        Libro libro_04 = new Libro("Titulo 1", "Autor 1");
        Libro libro_05 = new Libro("Titulo 2", "Autor 2");

        //Cambio de titulos
        System.out.println("\n--- Actualizacion de titulos ---");
        libro_04.actualizarTitulo("Title New 1");
        System.out.println(libro_04.getTitulo());
        libro_05.actualizarTitulo("Delux Edition", "Title New 2");
        System.out.println(libro_05.getTitulo());

        //ToString
        System.out.println("\n--- Listado de libros ---");
        System.out.println(libro_01.toString());
        System.out.println(libro_02.toString());
        System.out.println(libro_04.toString());
        System.out.println(libro_05.toString());
        
        //Actualziar Editorial
        System.out.println("--- Actualizar Editorial ---");
        Libro.actualiarEditorial("");
        Libro.actualiarEditorial("The Daily Bugle");
        
        //ToString
        System.out.println("\n--- Listado de libros ---");
        System.out.println(libro_01.toString());
        System.out.println(libro_02.toString());
        System.out.println(libro_04.toString());
        System.out.println(libro_05.toString());      
    }

}
