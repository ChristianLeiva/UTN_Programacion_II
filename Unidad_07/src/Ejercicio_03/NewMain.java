package Ejercicio_03;

import java.util.ArrayList;

/**
 * Ejercicio 03 de la unidad 07
 * @author Christian Leiva
 */
public class NewMain {

    public static void main(String[] args) {
        
        ArrayList<Empleado> empleados = new ArrayList<>();
        empleados.add(new EmpleadoTemporal("Juan Perez", 120, 2000));
        empleados.add(new EmpleadoPlanta("Alejando Gonzales", 550000, 3550)); 
        empleados.add(new EmpleadoPlanta("Franco Castro", 160, 2500));
        
        System.out.println("\n ---- Liquidacion de sueldos ----");
        
        for (Empleado e : empleados) {
            
            System.out.println("Empleado: " + e.getNombre());
            System.out.println("Sueldo a cobrar: $" + e.calcularSueldo());

            if (e instanceof EmpleadoPlanta) {
                System.out.println("Tipo: Empleado de Planta Permanente");
            } else if (e instanceof EmpleadoTemporal) {
                System.out.println("Tipo: Empleado Contratado / Temporal");
            }
            
            System.out.println("---------------------------------");
            
        }
    }

}
