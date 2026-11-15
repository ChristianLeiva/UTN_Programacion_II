/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_12;

/**
 *
 * @author Christian Leiva
 */
public class Impuesto {
    
    private double monto;
    private Contribuyente contribuyente;

    public Impuesto(double _monto, Contribuyente _contribuyente) {
        setMonto(_monto);
        this.contribuyente = _contribuyente;
    }

    public double getMonton() {
        return monto;
    }

    public void setMonto(double monto) {
        if(monto > 0.0){
            this.monto = monto;
        }else{
            System.out.println("Error: Ingrese un monto valido.");
        }
    }

    @Override
    public String toString() {
        return "\nImpuesto: "+ monto + contribuyente;
    }
    
    
    
    
    
}
