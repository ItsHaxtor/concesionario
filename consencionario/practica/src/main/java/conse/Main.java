package conse;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Consecionario consecionario = new Consecionario("AutoMax", "123 Calle Principal", "555-1234");
        System.out.println("Bienvenido a " + consecionario.getNombre());
        Scanner input = new Scanner(System.in);
        int opcion; 
        do {
            System.out.println("0. Salir del programa");
            System.out.println("1. Vendedor");
            System.out.println("2. Cliente");
            opcion = input.nextInt();

            switch (opcion) {
                case 1 -> consecionario.vendedor(input);
                case 2 -> consecionario.cliente(input);
                default -> System.out.println("fin del programa");
            }

        } while (opcion != 0);
    }
}