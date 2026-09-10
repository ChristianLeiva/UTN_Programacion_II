package Ejercicio_02;

/**
 * Ejercicio 2 de la unidad 3
 * Registro de mascotas
 * @author Christian Leiva
 */
public class NewMain {

    public static void main(String[] args) {
        Mascota mascota1 = new Mascota();
        
        // 1. Probar datos inválidos
        mascota1.setNombre("");
        mascota1.setEdad(-2);
        
        // 2. Cargar datos correctos
        mascota1.setNombre("Brisa");
        mascota1.setEdad(2);
        mascota1.setEspecie("Gato");
        
        // 3. Probar metodos
        mascota1.cumplirAnios();
        mascota1.mostrarInfo();
       
    }

}
