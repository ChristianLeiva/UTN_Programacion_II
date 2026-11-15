package Ejercicio_02;

/**
 *
 * @author Christian Leiva
 */
public class NewMain {

    public static void main(String[] args) {
       Bateria bateryNew = new Bateria("Litio-5000", 100);
       Celular celularSamsung = new Celular("123456789", "Samsung", "S25", bateryNew);
       Titular usuario1 = new Titular("Christian Leiva", "36.438.087");
       
       celularSamsung.asignarTitular(usuario1);
       System.out.println(usuario1.getCelular());
        System.out.println("-------------------");
       
       System.out.println(usuario1.getCelular());
    }

}
