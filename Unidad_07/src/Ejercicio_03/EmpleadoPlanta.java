package Ejercicio_03;

/**
 *
 * @author Christian Leiva
 */
public class EmpleadoPlanta extends Empleado {
    private double sueldoBasico;
    private double bonoAntiguedad;

    public EmpleadoPlanta(String nombre, double sueldoBasico, double bonoAntiguedad) {
        super(nombre);
        this.sueldoBasico = sueldoBasico;
        this.bonoAntiguedad = bonoAntiguedad;
    }

    public double getSueldoBasico() {
        return sueldoBasico;
    }

    public double getBonoAntiguedad() {
        return bonoAntiguedad;
    }
      
    @Override
    public double calcularSueldo(){        
        return bonoAntiguedad + sueldoBasico;
    }
    
}
