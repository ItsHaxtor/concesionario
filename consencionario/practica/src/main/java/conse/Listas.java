package conse;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

abstract public class Listas extends Vehiculo {

    private ArrayList<Vehiculo> inventario_vehiculos;

    public Listas() {
        this.inventario_vehiculos = new ArrayList<>();
    }

    protected void addVehiculo(Scanner input) {
        Vehiculo vehiculo;
        System.out.println("Que tipo de vehiculo desea agregar?");
        System.out.println("1. Camioneta");
        System.out.println("2. Motocicleta");
        System.out.println("3. Camion");
        System.out.println("4. Automovil");
        switch (input.nextInt()) {
            case 1 -> {
                System.out.println("ingrese el numero de plazas");
                setPlazas(input.nextInt());
                System.out.println("ingresse el color");
                setColor(input.next());
                System.out.println("ingrese el modelo");
                setModelo(input.next());
                System.out.println("ingrese el año");
                setAño(input.nextInt());
                System.out.println("ingrese el número de llantas");
                setNumLLantas(input.nextInt());
                System.out.println("ingrese la capavidad del valde");
                int capValde = input.nextInt();
                vehiculo = new Camioneta(generarCodigoUnico(), getPlazas(), getColor(), getModelo(), getAño(),
                        getNumLLantas(), true,
                        capValde);
                this.inventario_vehiculos.add(vehiculo);

            }
            case 2 -> {
                System.out.println("ingrese el numero de plazas");
                setPlazas(input.nextInt());
                System.out.println("ingresse el color");
                setColor(input.next());
                System.out.println("ingrese el modelo");
                setModelo(input.next());
                System.out.println("ingrese el año");
                setAño(input.nextInt());
                System.out.println("ingrese el número de llantas");
                setNumLLantas(input.nextInt());
                System.out.println("ingrese el tipo de manubrio");
                String tipoManubrio = input.next();
                vehiculo = new Motocicleta(generarCodigoUnico(), getPlazas(), getColor(), getModelo(), getAño(),
                        getNumLLantas(), true,
                        tipoManubrio);
                this.inventario_vehiculos.add(vehiculo);
            }
            case 3 -> {
                System.out.println("ingrese el numero de plazas");
                setPlazas(input.nextInt());
                System.out.println("ingresse el color");
                setColor(input.next());
                System.out.println("ingrese el modelo");
                setModelo(input.next());
                System.out.println("ingrese el año");
                setAño(input.nextInt());
                System.out.println("ingrese el número de llantas");
                setNumLLantas(input.nextInt());
                System.out.println("ingrese la capacidad del bodega");
                int capBodega = input.nextInt();
                vehiculo = new Camion(generarCodigoUnico(), getPlazas(), getColor(), getModelo(), getAño(),
                        getNumLLantas(), true,
                        capBodega);
                this.inventario_vehiculos.add(vehiculo);
            }
            case 4 -> {
                System.out.println("ingrese el numero de plazas");
                setPlazas(input.nextInt());
                System.out.println("ingresse el color");
                setColor(input.next());
                System.out.println("ingrese el modelo");
                setModelo(input.next());
                System.out.println("ingrese el año");
                setAño(input.nextInt());
                System.out.println("ingrese el número de llantas");
                setNumLLantas(input.nextInt());
                System.out.println("ingrese si es convertible");
                boolean convertible = input.nextBoolean();
                vehiculo = new Automovil(generarCodigoUnico(), getPlazas(), getColor(), getModelo(), getAño(),
                        getNumLLantas(), true,
                        convertible);
                this.inventario_vehiculos.add(vehiculo);
            }

            default -> {
                System.out.println("Opción no válida, regresando al menú principal");
            }

        }
    }

    public void quitarVehiculo(Scanner input) {
        if (this.inventario_vehiculos.isEmpty()) {
            System.out.println("No hay vehículos en el inventario para eliminar.");
        } else {
            listarVehiculos_posiciones();
            System.out.println("Ingrese el número del vehículo que desea eliminar:");
            int opcion = input.nextInt();
            if (opcion >= 0 && opcion < this.inventario_vehiculos.size()) {
                this.inventario_vehiculos.remove(opcion);
                System.out.println("Vehículo eliminado exitosamente.");
            } else {
                System.out.println("Opción no válida, por favor intente de nuevo.");
            }
        }

    }

    public void comprarVehiculo(Scanner input) {
        if (this.inventario_vehiculos.isEmpty()) {
            System.out.println("no hay vehiculos en el inventario disponibles para su venta");
        } else {
            System.out.println("ingrese el vehiculo que desea comprar");
            listarVehiculos_posiciones();
            int opcion = input.nextInt();
            if (opcion >= 0 && opcion < this.inventario_vehiculos.size()
                    && this.inventario_vehiculos.get(opcion).getDisponible()) {
                this.inventario_vehiculos.get(opcion).setDisponible(false);
                System.out.println("Vehículo vendido exitosamente.");
            } else {
                System.out.println("Opción no válida, por favor intente de nuevo.");
            }
        }
    }

    // recorre la lista de vehiculos y muestra sus caracteristicas junto con su
    // posicion en la lista
    public void listarVehiculos_espesifico() {
        if (this.inventario_vehiculos.isEmpty()) {
            System.out.println("No hay vehículos en el inventario");
        } else {
            int pos = 0;
            for (var v : this.inventario_vehiculos) {

                System.out.println("posicion: " + pos + "   " + v.toStringGeneral());
                pos++;
            }
        }

    }

    // recorre la lista de vehiculos y muestra sus caracteristicas junto con su
    // posicion en la lista
    public void listarVehiculos_posiciones() {
        if (this.inventario_vehiculos.isEmpty()) {
            System.out.println("No hay vehículos en el inventario");
        } else {
            int pos = 0;
            for (var v : this.inventario_vehiculos) {

                System.out.println(v.toStringEspesifico() + "   posicion: " + pos);
                pos++;
            }
        }

    }

    private String generarCodigoUnico() {
        String cod;
        LocalDateTime fechaHoraActual = LocalDateTime.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
        cod = fechaHoraActual.format(formato);
        return cod;
    }
    

}
