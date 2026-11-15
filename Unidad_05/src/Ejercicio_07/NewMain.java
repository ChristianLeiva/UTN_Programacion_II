package Ejercicio_07;

/**
 *
 * @author Christian Leiva
 */
public class NewMain {

    public static void main(String[] args) {
       Conductor conductor_01 = new Conductor("Christian Leiva", "AB-123456");
       Motor motor_01 = new Motor("1.8L Hybrid VVT-i", "MOT-1029384-H");
       Vehiculo vehiculo_01 = new Vehiculo("Toyota Corolla 2.0 SEG", "AF 123 AB", motor_01, conductor_01);
       System.out.println(vehiculo_01.toString());

    }

}
