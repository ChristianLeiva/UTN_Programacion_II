package Ejercicio_04;

/**
 *
 * @author Christian Leiva
 */
public class Gato extends Animal{

    public Gato(String nombre) {
        super(nombre);
    }
    
    @Override
    public void hacerSonido(){
        System.out.println("Miau Miau!");
    }    
}
