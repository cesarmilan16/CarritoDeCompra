import java.util.ArrayList;
import java.util.List;

public class CarritoDeCompra {
    // Atributos
    private List<Producto> productos;

    // Constructor
    public CarritoDeCompra() {
        this.productos = new ArrayList<>();
    }

    // Metodos
    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public void eliminarProducto(Producto producto) {
        productos.remove(producto);
    }

    public double calcularTotal() {
        double precioTotal = 0;

        for (Producto producto : productos) {
            precioTotal += producto.getPrecio();
        }
        return precioTotal;
    }

    public void mostrarCarrito() {
        for (Producto producto : productos){
            System.out.println("CarritoDeCompra [nombre:" + producto.getNombre() + ", precio: " + 
            producto.getPrecio() + ", cantidad: " + producto.getCantidad() + "]");
        }
    }

    public List<Producto> getProductos() {
        return productos;
    }
}