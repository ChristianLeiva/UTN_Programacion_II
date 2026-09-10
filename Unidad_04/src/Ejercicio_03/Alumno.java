/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_03;

/**
 *
 * @author Christian Leiva
 */
public class Alumno {
    private String nombre;
    private double promedio;
    static private double notaAprobacion = 6;
    
    
    public Alumno(String _nombre, double _promedio) {
        setNombre(_nombre);
        setPromedio(_promedio);
    }
    
    public Alumno(String _nombre) {
        setNombre(_nombre);
        this.promedio = 0.0;
    }
    
    //Metodos utiles
    private boolean validarString(String cadena) {
        return cadena.length() > 0 ? true : false;
    }
    
    private boolean validarNota (double _promedio) {
        return (_promedio >= 0.0 && _promedio <= 10.0) ? true : false;
    }    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String _nombre) {
        if(validarString(_nombre)) {
            this.nombre = _nombre;           
        }else{
            System.out.println("Error: No se puede cargar un nombre vacio.");
        }
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double _promedio) {
        if(validarNota(_promedio)) {
            this.promedio = _promedio;
        }else{
            System.out.println("Error: Se debe cargar un promedio entre 0 y 10");
        }
    }
    
    //Metodos para actualizar el promedio
    public void actualizarPromedio(double _promedio) {
        if(validarNota(_promedio)){
            this.promedio = _promedio;
        }else{
            System.out.println("Error: No se pudo actualizar el promedio.");
        }        
    }
    
    public void actualizarPromedio(double[] notas) {
        double acum = 0;
        int cont = 0;
        for (int i = 0; i < notas.length; i++ ){
            if(validarNota(notas[i])){
                acum += notas[i];
                cont ++;
            }else{
                System.out.println("Error: la nota ingresada debe estar entre 0 y 10");
            }                            
        }
        this.promedio =  acum/cont;        
    }
    
    //Metodo para saber si aprobo o no
    public boolean mostrarCondicion(){
        return (this.promedio >= notaAprobacion) ? true : false;
    }
    
    //Metodo para cambiar la nota de aprobacion
    public static void actualizarNotaAprobacion(int nota) {
        if(nota >= 0 || nota<= 10){
            notaAprobacion = nota;         
        }else{
            System.out.println("Error: No se puedo actualzar la nota de aprobacion.");
        }
    }
    
    //ToString
    @Override
    public String toString() {
        return "\nEl alumno: "+this.nombre+"\nPromedio: "+this.promedio+"\nCondicion: "+(this.promedio > notaAprobacion ? "Aprueba" : "Desaprueba");
    }
}
