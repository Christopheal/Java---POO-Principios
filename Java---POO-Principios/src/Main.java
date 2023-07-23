public class Main {
    public static void main(String[] args) {
        Producto producto1 = new Producto(1, "Camiseta", 20.0, 3);
        Producto producto2 = new Producto(2, "Libro", 15.5, 2);
        Electronico producto3 = new Electronico(3, "Teléfono", 500.0, 1, "MarcaX");
        Orden orden = new Orden();
        orden.agregarProducto(producto1);
        orden.agregarProducto(producto2);
        orden.agregarProducto(producto3);
        orden.mostrarDetallesOrden();
    }
}
