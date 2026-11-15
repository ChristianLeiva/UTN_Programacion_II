/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package unidad_09;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NewMain {
    public static void main(String[] args) {
        System.out.println("=== CREACION Y GESTION DEL CARRITO ===");
        
        Producto<Integer> p1 = new Producto<>(101, "Teclado Mecánico", 45000.0);
        Producto<Integer> p2 = new Producto<>(102, "Mouse Gamer", 25000.0);
        Producto<Integer> p3 = new Producto<>(103, "Auriculares Wireless", 60000.0);

        Carrito<Producto<Integer>> carrito = new Carrito<>();
        carrito.agregarProducto(p1);
        carrito.agregarProducto(p2);
        carrito.agregarProducto(p3);

        // Calcular y mostrar el total inicial
        System.out.println("Total del carrito: $" + carrito.calcularTotal());

        // Eliminar un producto y recalcular
        carrito.eliminarProducto(p2);
        System.out.println("Se elimino: " + p2.getNombre());
        System.out.println("Total del carrito actualizado: $" + carrito.calcularTotal());

        System.out.println("\n=== PEDIDOS Y ORDENAMIENTO ===");
        
        // Crear lista de Pedidos
        List<Pedido> listaPedidos = new ArrayList<>();
        listaPedidos.add(new Pedido(1, 150000.50, LocalDate.of(2026, 10, 15)));
        listaPedidos.add(new Pedido(2, 85000.00, LocalDate.of(2026, 10, 28)));
        listaPedidos.add(new Pedido(3, 210000.00, LocalDate.of(2026, 10, 01)));

        // Ordenar por Total (Comparable)
        Collections.sort(listaPedidos);
        System.out.println("\nPedidos ordenados por TOTAL:");
        for (Pedido p : listaPedidos) {
            System.out.println(p);
        }

        // Ordenar por Fecha (Comparator externo)
        Collections.sort(listaPedidos, new ComparadorPedidoPorFecha());
        System.out.println("\nPedidos reordenados por FECHA:");
        for (Pedido p : listaPedidos) {
            System.out.println(p);
        }

        System.out.println("\n=== BUSQUEDA POR ID ===");
        
        Buscador<Pedido, Integer> buscador = new Buscador<>();

        // Búsqueda existente
        Integer idExistente = 2;
        Pedido pedidoEncontrado = buscador.buscarPorId(listaPedidos, idExistente);
        if (pedidoEncontrado != null) {
            System.out.println("Resultado busqueda ID " + idExistente + ": " + pedidoEncontrado);
        } else {
            System.out.println("El pedido con ID " + idExistente + " no existe.");
        }

        // Búsqueda inexistente
        Integer idInexistente = 99;
        Pedido pedidoNoEncontrado = buscador.buscarPorId(listaPedidos, idInexistente);
        if (pedidoNoEncontrado != null) {
            System.out.println("Resultado busqueda ID " + idInexistente + ": " + pedidoNoEncontrado);
        } else {
            System.out.println("El pedido con ID " + idInexistente + " no existe.");
        }
    }
}