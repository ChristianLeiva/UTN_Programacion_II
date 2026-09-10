/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_02;

/**
 *
 * @author Christian Leiva
 */
public class Mascota {
    
    private String nombre;
    private String especie;
    private int edad;
    
    
    private boolean cargarString(String _texto){
       return (_texto != null && _texto.length() != 0) ? true : false;
    }
    
    public void mostrarInfo(){
        System.out.println("Informacion de la mascota:");
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Especie: "+this.especie);
        System.out.println("Edad: "+this.edad);
    }
    
    public void cumplirAnios(){
        this.edad += 1;
        System.out.println("Hoy es el cumpleanios de "+this.nombre+", cumplio "+this.edad+" anios.");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String _nombre) {
        if(cargarString(_nombre)){
            this.nombre = _nombre; 
        }else{
            System.out.println("Error al cargar el nombre.");  
        }              
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String _especie) {
        if(cargarString(_especie)){
            this.especie = _especie;
        }else{
            System.out.println("Error al cargar la especie.");  
        }              
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int _edad) {
        if(_edad > 0){
            this.edad = _edad;
        }else{
            System.out.println("Error al cargar la edad.");
        }       
    }    
}
