package Ejercicio_04;

/**
 * Ejercicio 4 de la unidad 3
 * Granja Digital
 * @author Christian Leiva
 */
public class NewMain {

    public static void main(String[] args) {
        Gallina gallina1 = new Gallina();
        Gallina gallina2 = new Gallina();
        
        // 1. Probar datos inválidos
        gallina1.setIdGallina(-89);
        gallina1.setEdad(-25);
        gallina1.setHuevosPuestos(-9);
        
        // 2. Cargar datos correctos
        gallina1.setIdGallina(1);
        gallina1.setEdad(1);
        gallina1.setHuevosPuestos(2);
        gallina1.mostrarInfo();
        // 3. Probar metodos
        System.out.println(" ");
        gallina1.envejecer(1);
        gallina1.ponerHuevo(2);
        gallina1.mostrarInfo();
        
        gallina2.setIdGallina(2);
        gallina2.setEdad(3);
        gallina2.setHuevosPuestos(3);
        gallina2.mostrarInfo();
        
        System.out.println(" ");
        gallina2.envejecer(1);
        gallina2.ponerHuevo(3);
        gallina2.mostrarInfo();
    }

}
