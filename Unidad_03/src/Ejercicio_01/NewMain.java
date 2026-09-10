package Ejercicio_01;

/**
 * Ejercicio 1 de la unidad 3
 * Registro de estudiantes
 * @author Christian Leiva
 */
public class NewMain {

    public static void main(String[] args) {
        Estudiante est = new Estudiante();
        
        // 1. Probar datos inválidos
        est.setNombre("");
        est.setCalificacion(15.0); // Debería quedar en 10.0
        
        // 2. Cargar datos correctos
        est.setNombre("Christian");
        est.setApellido("Leiva");
        est.setCurso("3ro 3ra");
        est.setCalificacion(5.0);
        
        // 3. Probar métodos
        est.mostrarInfo();
        est.subirCalificacion(7.0); // 5 + 7 = 12, debería quedar en 10.0
        est.bajarCalificacion(20.0); // 10 - 20 = -10, debería quedar en 0.0
        
        est.mostrarInfo();
    }

}
