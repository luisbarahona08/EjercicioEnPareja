import java.util.Scanner;

public class pruebaFactura {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("=== REGISTRO DE FACTURA ===");

        System.out.print("Ingrese número de pieza: ");
        String numero = entrada.nextLine();

        System.out.print("Ingrese descripción de la pieza: ");
        String descripcion = entrada.nextLine();

        System.out.print("Ingrese cantidad: ");
        int cantidad = entrada.nextInt();

        System.out.print("Ingrese precio unitario: ");
        double precio = entrada.nextDouble();

        // Instancia del objeto Factura
        Factura factura = new Factura(numero, descripcion, cantidad, precio);

        // Mostrar resumen
        System.out.println("\n Detalle de Factura");
        System.out.println("Número de pieza: " + factura.obtenerNumeroPieza());
        System.out.println("Descripción: " + factura.obtenerDescripcionPieza());
        System.out.println("Cantidad: " + factura.obtenerCantidad());
        System.out.println("Precio unitario: $" + factura.obtenerPrecioPorArticulo());
        System.out.println("Monto total a pagar: $" + factura.obtenerMontoFactura());

        entrada.close();
    }
}

