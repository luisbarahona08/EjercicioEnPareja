import java.util.Scanner;

public class MenuPrincipal {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n Menu Principal");
            System.out.println("1. Factura");
            System.out.println("2. Frecuencias Cardiacas");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opcion: ");

            if (entrada.hasNextInt()) {
                opcion = entrada.nextInt();
                entrada.nextLine();
            } else {
                System.out.println("Error: ingrese un numero valido.");
                entrada.nextLine();
                opcion = 0;
            }

            switch (opcion) {

                case 1:
                    System.out.println("\n--- MODULO FACTURA ---");
                    pruebaFactura.main(new String[0]);
                    break;

                case 2:
                    // Pendiente: integracion de Frecuencias Cardiacas
                    // Esta parte la realizara mi companera.
                    System.out.println("Modulo pendiente de integrar.");
                    break;

                case 3:
                    System.out.println("Gracias por utilizar el programa.");
                    break;

                default:
                    System.out.println("Opcion no valida.");
                    break;
            }

        } while (opcion != 3);
    }
}