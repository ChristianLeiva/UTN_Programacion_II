package Ejercicio_04;

/**
 *
 * @author Christian Leiva
 */
public class Vaca extends Animal{

    public Vaca(String nombre) {
        super(nombre);
    }
    
   @Override
   public void hacerSonido(){
       System.out.println("Muuuuu!");
   }
}
