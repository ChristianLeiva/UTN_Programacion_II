/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad_09;

import java.util.List;

/**
 *
 * @author Christian Leiva
 */
public class Buscador<T extends Identificable<K>, K> {
    
    public T buscarPorId(List<? extends T> Lista, K idBuscado){
        for (T elemento : Lista) {
            if(elemento.getId() != null && elemento.getId().equals(idBuscado)){
                return elemento;
            }            
        }
        return null;
    }    
}
