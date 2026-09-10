/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_01;

/**
 *
 * @author Christian Leiva
 */
public class Empleado {
    private final int id;
    private String nombre;
    private String puesto;
    private double salario;
    static int totalEmpleados; 
    
    //Atributo para actualizar el id en caso de no ingresarlo manualmente
    private static int contadorId = 1;
    
    //Constructor
    public Empleado(int _id,String _nombre, String _puesto, double _salario){
        if((validarEntero(_id))){
            System.out.println("Error: No se pueden ingresar Id negativos.");
            this.id = _id;
        }else{
            this.id = contadorId++;
        }
        
        //Actualizar el contador al ultimo valor de id ingresado manualmente
        if(_id >= contadorId){
            contadorId = _id+1;
        }
        setNombre(_nombre);
        setPuesto(_puesto);
        setSalario(_salario);
        totalEmpleados++;
    }
    
    //Constructor Sobrecargado
    public Empleado(String _nombre, String _puesto){
        this.id = contadorId++;
        setNombre(_nombre);
        setPuesto(_puesto);
        this.salario = 1200000; //salario base
        totalEmpleados++;
    }
    
    private boolean validarString(String cadena){
        return cadena.length() > 0? true : false;
    }
    
    private boolean validarEntero(int _entero){
        return _entero > 0 ? true : false;        
    }
    
    public String getNombre() {
        return nombre;
    }

    private void setNombre(String _nombre) {
        if(validarString(_nombre)){
            this.nombre = _nombre;
        }else{
            System.out.println("Error: No se puede ingrear una cadena vacia.");
        }
    }

    public String getPuesto() {
        return puesto;
    }

    private void setPuesto(String _puesto) {
        if(validarString(_puesto)){
            this.puesto = _puesto;
        }else{
            System.out.println("Error: No se puede ingrear una cadena vacia.");
        }       
    }

    public double getSalario() {
        return salario;
    }

    private void setSalario(double _salario) {
        if(_salario > 0.0){
            this.salario = _salario;
        }else{
            System.out.println("Error: No se pueden ingresar salarios negativos.");
        }
    }
    
    //Metodo para actualizar el sueldo ingresando un numero entero
    public void actualizarSueldo(int _aumento){
        if(validarEntero(_aumento)){
            this.salario += _aumento;
            System.out.println("El nuevo salario del empleado_"+this.id+" es de: "+this.salario);
        }else{
            System.out.println("Error: No se puede ingresar un aumento negativo.");
        }        
    }
    
    public void actualizarSueldo(double _aumento){
        if(_aumento > 0.0){
            double aumentoDecimal = _aumento / 100.0;
            this.salario += this.salario * aumentoDecimal;
            System.out.println("El nuevo salario del empleado_"+this.id+" es de: "+this.salario);
        }else{
            System.out.println("Error: No se puede ingresar un aumento negativo");
        }        
    }
    
    //Metodo static para mostrar la cantidad de empleados ingreados hasta el momento.
    public static void mostrarCantidadEmpleados(){
        System.out.println("La cantidad de empleados ingresados es: "+totalEmpleados);
    }
    
    @Override
    public String toString(){
        return "Empleado Nro: "+this.id+"\n\tNombre: "+this.nombre+"\n\tPuesto: "+this.puesto+"\n\tSalario: $"+this.salario+".";
    }
    
    
}
