/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad_09;

import java.time.LocalDate;

/**
 *
 * @author Christian Leiva
 */
public class Pedido implements Identificable<Integer>, Comparable<Pedido> {
    
    private Integer id;
    private double total;
    private LocalDate fecha;
    
    public Pedido(Integer id, double total, LocalDate fecha){
        this.id = id;
        this.total = total;
        this.fecha = fecha;
    }

    @Override
    public Integer getId() {
        return id;
    }
    
    public double getTotal(){
        return total;
    }
    
    public LocalDate getFecha(){
        return fecha;
    }

    @Override
    public int compareTo(Pedido o) {
        return Double.compare(this.total, o.total);
    }

    @Override
    public String toString() {
        return "Pedido{" + "id=" + id + ", total=" + total + ", fecha=" + fecha + '}';
    }   
    
}
