package Ejercicio_02;

/**
 * Ejercicio 02 de la unidad 06
 * @author Christian Leiva
 */
public class NewMain {

    public static void main(String[] args) {
        System.out.println("=== Crear una biblioteca ===");
        Biblioteca biblioteca = new Biblioteca("Biblioteca Central UTN");

        System.out.println("=== Crear autores ===");
        Autor a1 = new Autor("A01", "Gabriel García Márquez", "Colombiana");
        Autor a2 = new Autor("A02", "Jorge Luis Borges", "Argentina");
        Autor a3 = new Autor("A03", "Isabel Allende", "Chilena");

        System.out.println("=== Agregar libros asociados a los autores ===");
        biblioteca.agregarLibro("978-1", "Cien anios de soledad", 1967, a1);
        biblioteca.agregarLibro("978-2", "Ficciones", 1944, a2);
        biblioteca.agregarLibro("978-3", "El Aleph", 1949, a2);
        biblioteca.agregarLibro("978-4", "La casa de los espiritus", 1982, a3);
        biblioteca.agregarLibro("978-5", "El amor en los tiempos del colera", 1985, a1);

        System.out.println("=== Listar todos los libros ===");
        biblioteca.listarLibros();
        System.out.println();

        System.out.println("=== Buscar libro por ISBN ===");
        Libro buscado = biblioteca.buscarLibroPorIsbn("978-2");
        if (buscado != null) {
            buscado.mostrarInfo();
        } else {
            System.out.println("Libro no encontrado.");
        }
        System.out.println();

        System.out.println("=== Filtrar libros por año de publicación ===");
        biblioteca.filtrarLibrosPorAnio(1949);
        System.out.println();

        System.out.println("=== Eliminar libro por ISBN y listar restantes ===");
        if (biblioteca.eliminarLibro("978-3")) {
            System.out.println("Libro 978-3 eliminado.");
        }
        System.out.println("--- Libros restantes ---");
        biblioteca.listarLibros();
        System.out.println();

        System.out.println("=== Mostrar la cantidad total de libros ===");
        System.out.println("Cantidad total de libros: " + biblioteca.obtenerCantidadLibros());
        System.out.println();

        System.out.println("=== Listar autores de los libros disponibles ===");
        biblioteca.mostrarAutoresDisponibles();
    }

}
