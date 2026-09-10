package Ejercicio_04;

/**
 *
 * @author Christian Leiva
 */
public class Gallina {
    
    private int idGallina;
    private int edad;
    private int huevosPuestos;
    
    
    public int getIdGallina() {
        return idGallina;
    }

    public void setIdGallina(int _idGallina) {
        if(_idGallina > 0){
            this.idGallina=_idGallina;
        }else{
            System.out.println("Error al ingresar idGallina.");
        }        
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int _edad) {
        if(_edad > 0){
            this.edad=_edad;
        }else{
            System.out.println("Error al ingresar edad.");
        }  
    }

    public int getHuevosPuestos() {
        return huevosPuestos;
    }

    public void setHuevosPuestos(int _huevosPuestos) {
        if(_huevosPuestos > 0){
            this.huevosPuestos=_huevosPuestos;
        }else{
            System.out.println("Error al ingresar huevosPuestos.");
        }  
    }
    
    public void ponerHuevo(int _huevoNuevo){
        if(_huevoNuevo > 0){
            System.out.println("La gallina "+this.idGallina+" puso "+_huevoNuevo+" huevo/s.");
            this.huevosPuestos += _huevoNuevo;            
        }        
    }
    
    public void envejecer(int _edad){
        if(_edad > 0){
            this.edad += _edad;
        }else{
            System.out.println("Error al ingresar la edad.");
        }        
    }
    
    public void mostrarInfo(){
        System.out.println("Informacion de la gallina "+this.idGallina+": ");
        System.out.println("Edad: "+this.edad);
        System.out.println("Huevos Puestos: "+this.huevosPuestos);
    }
    
    
}
