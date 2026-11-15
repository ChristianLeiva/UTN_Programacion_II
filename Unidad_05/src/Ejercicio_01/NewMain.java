package Ejercicio_01;

/**
 *
 * @author Christian Leiva
 */
public class NewMain {

    public static void main(String[] args) {
        Titular titular1 = new Titular("Christian Leiva", "36.438.087");
        Pasaporte pasaporte1 =  new Pasaporte("ARG36438087", "Foto_Cara", "JPG");
        
        pasaporte1.asignarTitular(titular1);
        
        System.out.println(pasaporte1.toString());       
       
    }

}
