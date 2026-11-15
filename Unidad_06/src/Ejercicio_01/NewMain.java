package Ejercicio_01;

/**
 * Ejercicio 01 de la unidad 06
 * @author Christian Leiva
 */
public class NewMain {

    public static void main(String[] args) {
       // Inicialización del inventario
        Inventario inventario = new Inventario();

        Producto p1 = new Producto("P001", "Arroz 1kg", 1200.0, 50, CategoriaProducto.ALIMENTOS);
        Producto p2 = new Producto("P002", "Auriculares Bluetooth", 2500.0, 15, CategoriaProducto.ELECTRONICA);
        Producto p3 = new Producto("P003", "Remera", 1800.0, 30, CategoriaProducto.ROPA);
        Producto p4 = new Producto("P004", "Lampara LED", 950.0, 40, CategoriaProducto.HOGAR);
        Producto p5 = new Producto("P005", "Fideos 500g", 800.0, 100, CategoriaProducto.ALIMENTOS);

        inventario.agregarProducto(p1);
        inventario.agregarProducto(p2);
        inventario.agregarProducto(p3);
        inventario.agregarProducto(p4);
        inventario.agregarProducto(p5);


        System.out.println("=== Listar todos los productos ===");
        inventario.listarProductos();
        System.out.println();

        System.out.println("=== Buscar un producto por ID (P002) ===");
        Producto buscado = inventario.buscarProductoPorId("P002");
        if (buscado != null) {
            buscado.mostrarInfo();
        } else {
            System.out.println("Producto no encontrado.");
        }
        System.out.println();

        System.out.println("=== Filtrar por categoria ===");
        inventario.filtrarPorCategoria(CategoriaProducto.ALIMENTOS);
        System.out.println();

        System.out.println("=== Eliminar un producto por ID ===");
        if (inventario.eliminarProducto("P004")) {
            System.out.println("Producto P004 eliminado correctamente.");
        } else {
            System.out.println("No se pudo eliminar el producto.");
        }
        System.out.println("--- Lista actualizada de productos ---");
        inventario.listarProductos();
        System.out.println();

        System.out.println("=== Actualizar el stock de un producto ===");
        inventario.actualizarStock("P001", 75);
        Producto pActualizado = inventario.buscarProductoPorId("P001");
        if (pActualizado != null) {
            pActualizado.mostrarInfo();
        }
        System.out.println();

        System.out.println("=== Mostrar el total de stock disponible ===");
        System.out.println("Total de unidades en stock: " + inventario.obtenerTotalCantidad());
        System.out.println();

        System.out.println("=== Obtener y mostrar el producto con mayor stock ===");
        Producto mayorStock = inventario.obtenerProductoMayorStock();
        if (mayorStock != null) {
            System.out.print("Producto con mayor stock: ");
            mayorStock.mostrarInfo();
        }
        System.out.println();

        System.out.println("=== Filtrar productos con precio entre $1000 y $3000 ===");
        inventario.filtrarProductosPorPrecio(1000.0, 3000.0);
        System.out.println();

        System.out.println("=== Mostrar las categorias disponibles con sus descripciones ===");
        inventario.mostrarCategoriasDisponibles();
    }

}
