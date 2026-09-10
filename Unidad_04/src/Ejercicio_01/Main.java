package Ejercicio_01;

/**
 * Ejercicio 1 de la unidad 4
 * Sistema de gestion de empleados
 * @author Christian Leiva
 */
public class Main {

    public static void main(String[] args) {
        //Carga de empleados con los 2 contructores;
        // Prueba de id negativo con el constructor que solicita todos los atributos
        Empleado empleado_01 = new Empleado(-25, "Christian Leiva", "Developer", 2000000);
        
        //Contructor sobrecargado que solicita nombre y puesto
        Empleado empleado_02 = new Empleado("Dalma Castro", "Functional Analyst");
        Empleado empleado_03 = new Empleado("Franco Cuevas", "Devops");
        
        //toString
        System.out.println(empleado_01.toString());
        System.out.println(empleado_02.toString());
        System.out.println(empleado_03.toString());
        
        //Actualizar el salario con porcentaje 
        System.out.println("\n---- Actualizacion de sueldo ----");
        empleado_02.actualizarSueldo(25.0);
        
        //Actualiar el salario con un numero entero
        empleado_03.actualizarSueldo(200000);
     
        System.out.println("\n---- Cantidad de empleados ----");
        Empleado.mostrarCantidadEmpleados();
    }

}
