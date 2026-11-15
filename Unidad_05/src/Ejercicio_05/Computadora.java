package Ejercicio_05;

/**
 *
 * @author Christian Leiva
 */
public class Computadora {
    private String marca;
    private String numeroSerie;
    private PlacaMadre placaMadre;
    private Propietario propietario;

    public Computadora(String _marca, String _numeroSerie, String _modelo, String _chipset, Propietario _propietario) {
        setMarca(_marca);
        setNumeroSerie(_numeroSerie);
        this.placaMadre = new PlacaMadre(_modelo, _chipset);       
        asingarPropietario(_propietario); 
    }
    
    private boolean validarString(String cadena){
        return (cadena != null && cadena.length() > 0);
    }
    
    public void asingarPropietario(Propietario newPropietario){
        this.propietario = newPropietario;
        if(newPropietario != null && newPropietario.getComputadora() != this){
            newPropietario.setComputadora(this);
        }
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String _marca) {
        if(validarString(_marca)){
            this.marca = _marca;
        }else{
            System.out.println("Error: Ingrese una marca valida.");
        }
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        if(validarString(numeroSerie)){
            this.numeroSerie = numeroSerie;
        }else{
            System.out.println("Error: Ingresar numero de serie valido.");
        }
    }

    @Override
    public String toString() {
        return "Informacion de la Computadora:\n\tMarca: " + marca + "\n\tNumero de Serie: " + numeroSerie + placaMadre +propietario;
    }
    
    
    
    
}
