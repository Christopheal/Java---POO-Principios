public class Electronico extends Producto {
    private String marca;
    public Electronico(int id, String nombre, double precio, int cantidad, String marca) {
        super(id, nombre, precio, cantidad);
        this.marca = marca;
    }
    public String getMarca() {
        return marca;
    }
    public double calcularDescuento() {
        if (getCantidad() >= 5) {
            return getPrecio() * 0.1;
        }
        return 0;
    }
}
