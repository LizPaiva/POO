import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private int numeroPedido;
    private String nombreCliente;
    private double total;
    private List<String> productos;


    public Pedido() {
        this.productos = new ArrayList<>();
        this.total = 0;
    }


    public Pedido(int numeroPedido, String nombreCliente) {
        this.numeroPedido = numeroPedido;
        this.nombreCliente = nombreCliente;
        this.productos = new ArrayList<>();
        this.total = 0;
    }


    public void agregarProducto(String producto, double precio) {
        productos.add(producto);
        total += precio;
        System.out.println("Producto: " + producto + " ($" + precio + ")");
    }

    public void calcularDescuento(double porcentaje) {
        if (porcentaje >= 0 && porcentaje <= 100) {
            double descuento = total * (porcentaje / 100);
            total -= descuento;
            System.out.println(" Descuento: " + porcentaje + "% (-$" + descuento + ")");
        } else {
            System.out.println(" inválido. Debe estar entre 0 y 100.");
        }
    }

    public void mostrarPedido() {
        System.out.println(" Pedido: " + numeroPedido);
        System.out.println("Cliente: " + nombreCliente);
        System.out.println("Productos:");
        for (String producto : productos) {
            System.out.println(" - " + producto);
        }
        System.out.println("Total: $" + total);
        System.out.println("-----------------------------");
    }


}

