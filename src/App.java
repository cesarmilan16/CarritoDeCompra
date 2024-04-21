import java.util.Collections;
import java.util.Comparator;

public class App {
    public static void main(String[] args) throws Exception {
        CarritoDeCompra carrito = new CarritoDeCompra();
        Producto producto1 = new Producto("Lomo",5.5, 2);
        Producto producto2 = new Producto("Tomate",0.5, 10);
        Producto producto3 = new Producto("Atun",2.5, 4);
        Producto producto4 = new Producto("Refresco",1.5, 3);

        System.out.println("\nMostramos los productos: ");
        String mostrarProducto1 = producto1.toString();
        System.out.println(mostrarProducto1);
        String mostrarProducto2 = producto2.toString();
        System.out.println(mostrarProducto2);
        String mostrarProducto3 = producto3.toString();
        System.out.println(mostrarProducto3);
        String mostrarProducto4 = producto4.toString();
        System.out.println(mostrarProducto4);

        System.out.println("\nMostramos los precios totales: ");
        double precioTotal1 = producto1.calcularTotal();
        System.out.println("El precio total de " + producto1.getNombre() + " es: " + precioTotal1);
        double precioTotal2 = producto2.calcularTotal();
        System.out.println("El precio total de " + producto2.getNombre() + " es: " + precioTotal2);
        double precioTotal3 = producto3.calcularTotal();
        System.out.println("El precio total de " + producto3.getNombre() + " es: " + precioTotal3);
        double precioTotal4 = producto4.calcularTotal();
        System.out.println("El precio total de " + producto4.getNombre() + " es: " + precioTotal4);
        
        System.out.println();
        carrito.agregarProducto(producto1);
        carrito.agregarProducto(producto2);
        carrito.agregarProducto(producto3);
        carrito.agregarProducto(producto4);

        carrito.eliminarProducto(producto4);

        Collections.sort(carrito.getProductos(), new Comparator<Producto>() {
            @Override
            public int compare(Producto p1, Producto p2) {
                return p1.getNombre().compareTo(p2.getNombre());
            }
        });
        
        carrito.mostrarCarrito();
    }
}