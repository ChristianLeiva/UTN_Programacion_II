package Ejercicio_02;

/**
 *
 * @author Christian Leiva
 */
public class Celular {
    private String imei;
    private String marca;
    private String modelo;
    private Bateria bateria;
    private Titular titular;
  
    public Celular(String _imei, String _marca, String _modelo, Bateria _bateria) {
       setImei(_imei);
       setMarca(_marca);
       setModelo(_modelo);
       this.bateria = _bateria;
    }
    
    private boolean validarString(String cadena){
        return (cadena != null && cadena.length() > 0);
    }
    
    public void asignarTitular(Titular newTitular){
        this.titular =  newTitular;
        
        if(newTitular != null && titular.getCelular() != this){
            newTitular.setCelular(this);
        }        
    }

    public void setImei(String _imei) {
        if(validarString(_imei)){
            this.imei = _imei;
        }else{
            System.out.println("Error: Ingrese un imei valido.");
        }
    }

    public void setMarca(String _marca) {
        if(validarString(_marca)){
            this.marca = _marca;    
        }else{
            System.out.println("Error: Ingrese una marca valida.");
        }        
    }

    public void setModelo(String _modelo) {
        if(validarString(_modelo)){
            this.modelo = _modelo;
        }else{
            System.out.println("Error: agregar un modelo valido.");
        }
    }

    @Override
    public String toString() {
        return "Celular{" + "imei=" + imei + ", marca=" + marca + ", modelo=" + modelo + ", bateria=" + bateria + ", titular=" + titular + '}';
    }
    
    
}
