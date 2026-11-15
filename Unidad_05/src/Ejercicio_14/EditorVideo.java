package Ejercicio_14;

/**
 *
 * @author Christian Leiva
 */
public class EditorVideo {

    public Render exportar(String formato, Proyecto proyecto) {
        System.out.println("Exportando proyecto '" + proyecto.getNombre() + "'...");
        return new Render(formato, proyecto); // new Render(...)
    }
    
}
