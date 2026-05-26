package conse;

public class Camion extends Vehiculo implements Cargable {
    private double capacidadCarga;

    public Camion(String codUnico, int plazas, String color, String modelo, int año, int numLLantas,boolean disponible, double capacidadCarga) {
        super(codUnico, plazas, color, modelo, año, numLLantas, disponible);
        this.capacidadCarga = capacidadCarga;
    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    @Override
    public void encender() {
        System.out.println("El camión se ha encendido.");
    }

    @Override
    public void acelerar() {
        System.out.println("El camión está acelerando.");
    }

    @Override
    public void frenar() {
        System.out.println("El camión está frenando.");
    }

    @Override
    public void apagar() {
        System.out.println("El camión se ha apagado.");
    }

    @Override
    public void cargar(double peso) {
        System.out.println("Cargando " + peso + " kg en el camión.");
    }

    @Override
    public void descargar(double peso) {
        System.out.println("Descargando " + peso + " kg del camión.");
    }

@Override
    public String toStringEspesifico() {
        return  ("Camion "+ " disponible:  " +getDisponible());
    }
    @Override
    public String toStringGeneral() {
        return ("Camion "+" codUnico: " + getCodUnico() + " color: " + getColor() + " modelo: " + getModelo() + " año: " + getAño()+ " numLLantas: " + getNumLLantas() + " plazas: " + getPlazas() + " capacidadCarga: " + getCapacidadCarga());
    }

  

}
