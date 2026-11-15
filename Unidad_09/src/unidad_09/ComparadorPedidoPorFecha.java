/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad_09;

import java.util.Comparator;

/**
 *
 * @author Christian Leiva
 */
public class ComparadorPedidoPorFecha implements Comparator<Pedido> {

    @Override
    public int compare(Pedido o1, Pedido o2) {
        return o1.getFecha().compareTo(o2.getFecha());
    }
    
}
