
package Ejercicio_03;
import java.util.Scanner;


/**
 * Ejercicio 3 de la unidad 4
 * Sistema de aprobacion alumnos
 * @author Christian Leiva
 */
public class NewMain {

    public static void main(String[] args) {
        Alumno alumno_01 = new Alumno("Aldo Castro", 7.5);
        Alumno alumno_02 = new Alumno("", 25);
        
        Alumno alumno_03 = new Alumno("Veronica Aguilar",9 );
        Alumno alumno_04 = new Alumno("Federico Toledo", 6);
        Alumno alumno_05 = new Alumno("Gaston Saucedo");
        
        System.out.println("--- Mostrar Info Alumnos ---");
        System.out.println(alumno_01.mostrarCondicion());
        System.out.println(alumno_03.mostrarCondicion());
        System.out.println(alumno_04.mostrarCondicion());
        System.out.println(alumno_05.mostrarCondicion());

        
        System.out.println("--- Actualizar Promedio ---");
        alumno_03.actualizarPromedio(5.5);
        System.out.println(alumno_03.getPromedio());
        alumno_05.actualizarPromedio(new double[]{25, 9, 8, 3.5});
        System.out.println(alumno_05.getPromedio());
        
        System.out.println("--- Ver condicion de los alumnos ---");
        System.out.println(alumno_01.toString());
        System.out.println(alumno_03.toString());
        System.out.println(alumno_04.toString());
        System.out.println(alumno_05.toString());
        
        // Cambiar la nota de aprobacion
        Alumno.actualizarNotaAprobacion(25);
        Alumno.actualizarNotaAprobacion(7);
        
        
        System.out.println("--- Ver condicion de los alumnos despues del cambio de nota de aprobacion---");
        System.out.println(alumno_01.toString());
        System.out.println(alumno_03.toString());
        System.out.println(alumno_04.toString());
        System.out.println(alumno_05.toString());
    }

}
