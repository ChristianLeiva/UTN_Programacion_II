package Ejercicio_03;

/**
 * Ejercicio 03 de la unidad 06
 * @author Christian Leiva
 */
public class NewMain {

    public static void main(String[] args) {
        Universidad unqui = new Universidad("Universidad Nacional");

        System.out.println("=== Crear y agregar profesores y cursos ===");
        Profesor prof1 = new Profesor("P1", "Dra. Ana López", "Programación");
        Profesor prof2 = new Profesor("P2", "Ing. Carlos Pérez", "Bases de Datos");
        Profesor prof3 = new Profesor("P3", "Lic. María Gómez", "Matemática");

        Curso c1 = new Curso("C101", "Programacion Orientada a Objetos");
        Curso c2 = new Curso("C102", "Estructuras de Datos");
        Curso c3 = new Curso("C201", "Bases de Datos I");
        Curso c4 = new Curso("C202", "Bases de Datos II");
        Curso c5 = new Curso("C301", "Algebra Lineal");

        unqui.agregarProfesor(prof1);
        unqui.agregarProfesor(prof2);
        unqui.agregarProfesor(prof3);

        unqui.agregarCurso(c1);
        unqui.agregarCurso(c2);
        unqui.agregarCurso(c3);
        unqui.agregarCurso(c4);
        unqui.agregarCurso(c5);

        System.out.println("\n=== Asignar profesores a cursos ===");
        unqui.asignarProfesorACurso("C101", "P1");
        unqui.asignarProfesorACurso("C102", "P1");
        unqui.asignarProfesorACurso("C201", "P2");
        unqui.asignarProfesorACurso("C202", "P2");
        unqui.asignarProfesorACurso("C301", "P3");

        System.out.println("\n=== Listar cursos y profesores ===");
        unqui.listarCursos();


        System.out.println("\n=== Cambiar profesor de un curso ===");
        unqui.asignarProfesorACurso("C202", "P1");
        prof1.listarCursos();
        prof2.listarCursos();

        System.out.println("\n=== Remover un curso (C102) ===");
        unqui.eliminarCurso("C102");
        prof1.listarCursos(); // Verifica que C102 ya no aparece en el profesor

        System.out.println("\n=== Remover un profesor (P3) ===");
        unqui.eliminarProfesor("P3");
        c5.mostrarInfo(); // Verifica que el curso C301 ahora tiene profesor = null

    }

}
