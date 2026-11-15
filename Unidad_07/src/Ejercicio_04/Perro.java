package Ejercicio_04;

/**
 *
 * @author Christian Leiva
 */
public class Perro extends Animal{   

    public Perro(String nombre) {
        super(nombre);
    }
    
    @Override
    public void hacerSonido(){
        System.out.println("Guau Guau!");
    }
}
