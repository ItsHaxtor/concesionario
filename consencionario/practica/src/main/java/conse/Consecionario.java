package conse;

import java.util.Scanner;

public class Consecionario extends Menu {
    private String nombre;
    private String direccion;
    private String telefono;

    public Consecionario(String nombre, String direccion, String telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void cliente(Scanner input) {

        mostrarMenuCliente(input);
    }

    public void vendedor(Scanner input) {

        mostrarMenuVendedor(input);

    }

}
