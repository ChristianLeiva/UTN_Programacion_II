package Ejercicio_02;

/**
 *
 * @author Christian Leiva
 */
public class Rectangulo extends Figura {
    private double altura;
    private double base;

    public Rectangulo(String nombre, double base, double altura) {
        super(nombre);
        this.base = base;
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public double getBase() {
        return base;
    }
    
    @Override
    public double calcularArea(){
        return base * altura;
    }
    
}
