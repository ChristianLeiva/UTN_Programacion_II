package Ejercicio_11;

/**
 *
 * @author Christian Leiva
 */
public class NewMain {

    public static void main(String[] args) {
        Artista artista_01 = new Artista("Soda Stereo", "Rock Nacional");
        Cancion cancion = new Cancion("Te para tres", artista_01);
        
        Reproductor reproductor = new Reproductor();
        
        reproductor.reproducir(cancion);
       
    }

}
