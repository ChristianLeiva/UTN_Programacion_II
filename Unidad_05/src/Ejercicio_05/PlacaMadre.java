package Ejercicio_05;

/**
 *
 * @author Christian Leiva
 */
public class PlacaMadre {
    private String modelo;
    private String chipset;

    public PlacaMadre(String _modelo, String _chipset) {
        setModelo(_modelo);
        setChipset(_chipset);
    }
    
    private boolean validarString(String cadena){
        return (cadena != null && cadena.length() > 0);
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String _modelo) {
        if(validarString(_modelo)){
            this.modelo = _modelo;
        }else{
            System.out.println("Error: Ingresar un modelo valido");
        }
    }

    public String getChipset() {
        return chipset;
    }

    public void setChipset(String chipset) {
        if(validarString(chipset)){
            this.chipset = chipset;
        }else{
            System.out.println("Error: Ingresar un chipset valido.");
        }
    }

    @Override
    public String toString() {
        return "\nPlacaMadre:\n\tModelo: " + modelo + "\n\tChipset: " + chipset;
    }   
}
