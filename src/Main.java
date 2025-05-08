//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //CuentaBancaria cuenta1 = new CuentaBancaria("258698745", "Lizeth Paiva", "Ahorros");
        //cuenta1.mostrarInformacion();
        //System.out.println("El titular de la cuenta es: " + cuenta1.getNombreTitular());





        // Libro
//        Libro libro1 = new Libro("Roma soy Yo", "Santiago Posteguillo", 2022);
//
//
//        libro1.mostrarDetalles();
//
//        libro1.prestar();
//        libro1.mostrarDetalles();
//
//        libro1.prestar();
//        libro1.mostrarDetalles();
//
//        libro1.devolver();
//        libro1.mostrarDetalles();
//
//        libro1.prestar();
//        libro1.mostrarDetalles();



        // Clase Coche con atributos privados
        Coche coche1 = new Coche();
        coche1.setMarca("Kenworth");
        coche1.setModelo("T-800");
        coche1.setAnio(2020);

        Coche coche2 = new Coche("Montero", "Pajero", 2020);


        coche1.actualizarKilometraje(2000);
        coche1.actualizarKilometraje(-50);


        System.out.println("Coche 1 - Información:");
        coche1.mostrarInformacion(false);


        System.out.println("Coche 2 - Información Detallada:");
        coche2.mostrarInformacion(true);




//        Pedido pedido1 = new Pedido();
//
//        pedido1.agregarProducto("Hamburguesa", 12000);
//        pedido1.agregarProducto("Papas Fritas", 5000);
//        pedido1.agregarProducto("Gaseosa", 4000);
//
//
//        Pedido pedido2 = new Pedido(102, "Liz Paiva");
//        pedido2.agregarProducto("Pizza", 22000);
//        pedido2.agregarProducto("Postre", 7000);
//
//
//        pedido1.calcularDescuento(10);
//        pedido2.calcularDescuento(150);
//
//
//        System.out.println("Pedido 1:");
//        pedido1.mostrarPedido();
//
//        System.out.println("Pedido 2:");
//        pedido2.mostrarPedido();
//

    }
}