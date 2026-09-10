package Ejercicio_05;

/**
 * 
 * @author Christian Leiva
 */
public class NewMain {
    public static void main(String[] args) {
        // 1. Crear una nave con 50 unidades de combustible
        NaveEspacial miNave = new NaveEspacial();
        miNave.setNombre("Halcon Milenario");
        miNave.setCombustible(50.0);
        
        miNave.mostrarEstado();
        System.out.println();

        // 2. Intentar avanzar una distancia que requiera más combustible del que tiene (ej. 40 km gastaría 80 unidades)
        System.out.println("--- Intentando viaje largo con poco combustible ---");
        miNave.avanzar(40.0); 
        System.out.println();

        // 3. Realizar una recarga intentando superar el límite para probar el fallo de seguridad
        System.out.println("--- Intentando sobrecargar combustible ---");
        miNave.recargarCombustible(80.0); // 50 actuales + 80 = 130 (debe acotarse a 100)
        miNave.mostrarEstado();
        System.out.println();

        // 4. Despegar y avanzar correctamente
        miNave.despegar(); // Gasta 5 (queda en 95)
        miNave.avanzar(10.0); // Gasta 20 (queda en 75)
        
        System.out.println();
        miNave.mostrarEstado();
    }
}