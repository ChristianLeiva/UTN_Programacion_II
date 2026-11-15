package Ejercicio_14;

/**
 *
 * @author Christian Leiva
 */
public class Render {
    
    private String formato;
    private Proyecto proyecto;

    public Render(String formato, Proyecto proyecto) {
        this.formato = formato;
        this.proyecto = proyecto;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String _formato) {
        if(_formato != null && _formato.length() > 0){
            this.formato = _formato;
        }else{
            System.out.println("Error: Ingrese un formato valido.");
        }
    }    

    @Override
    public String toString() {
        return "Render listo [" + formato + "] del proyecto: " + proyecto.getNombre();
    }    
    
}
