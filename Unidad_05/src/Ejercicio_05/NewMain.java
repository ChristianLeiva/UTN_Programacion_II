package Ejercicio_05;

/**
 *
 * @author Christian Leiva
 */
public class NewMain {

    public static void main(String[] args) {
        Propietario prop_01 = new Propietario("Christian Leiva", "36.438.087");
        Computadora compu_01 = new Computadora("Asus","SN-987654-AMD","ROG Strix B550-F", "AMD B550", prop_01);
        System.out.println(compu_01.toString());
       
    }

}
