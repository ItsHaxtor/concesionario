package conse;

import java.util.Scanner;

abstract public class Menu extends Listas {
    int opcion;
    public void mostrarMenuVendedor(Scanner input) {
        do {
            System.out.println("Bienvenido al menú del vendedor");
            System.out.println("1. Agregar vehículo");
            System.out.println("2. Quitar vehículo");
            System.out.println("3. Listar vehículos características");
            System.out.println("4. Listar vehículos posiciones");
            System.out.println("5. Salir");
            opcion = input.nextInt();

            switch (opcion) {
                case 1 -> addVehiculo(input);
                case 2 -> quitarVehiculo(input);
                case 3 -> listarVehiculos_espesifico();
                case 4 -> listarVehiculos_posiciones();
                case 5 -> System.out.println("Saliendo del menú...");
                default -> System.out.println("Opción no válida, por favor intente de nuevo.");
            }
        } while (opcion <= 4 && opcion > 0);
        
    }

    public void mostrarMenuCliente(Scanner input) {
        do {
            System.out.println("Bienvenido al menú del cliente");
            System.out.println("1. Caracteristicas de los vehículos");
            System.out.println("2. Listar vehículos");
            System.out.println("3. Comprar vehículo");
            System.out.println("4. Salir");
            opcion = input.nextInt();
            switch (opcion) {
                case 1 -> listarVehiculos_espesifico();
                case 2 -> listarVehiculos_posiciones();
                case 3 -> comprarVehiculo(input);
                case 4 -> System.out.println("Saliendo del menú...");
                default -> System.out.println("Opción no válida, por favor intente de nuevo.");
            }
        } while (opcion <= 3 && opcion > 0);
        return;
    }
}
