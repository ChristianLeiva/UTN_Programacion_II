
package Ejercicio_02;

/**
 *
 * @author Christian Leiva
 */
public class Circulo extends Figura{
    private double radio;

    public Circulo(String nombre, double radio) {
        super(nombre);
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    @Override
    public double calcularArea() {
        double area = Math.PI * Math.pow(radio,2);
        return area;
    }
    
    
    
}
