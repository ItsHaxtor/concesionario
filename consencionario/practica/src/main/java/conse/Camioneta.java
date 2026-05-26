package conse;

public class Camioneta extends Vehiculo implements Cargable {
    private double capacidadValde;

    public Camioneta(String codUnico, int plazas, String color, String modelo, int año, int numLLantas, boolean disponible,
            double capacidadValde) {
        super(codUnico, plazas, color, modelo, año, numLLantas, disponible);
        this.capacidadValde = capacidadValde;
    }

    public double getCapacidadValde() {
        return capacidadValde;
    }

    public void setCapacidadValde(double capacidadValde) {
        this.capacidadValde = capacidadValde;
    }

    @Override
    public void encender() {
        System.out.println("La camioneta se ha encendido.");
    }

    @Override
    public void acelerar() {
        System.out.println("La camioneta está acelerando.");
    }

    @Override
    public void frenar() {
        System.out.println("La camioneta está frenando.");
    }

    @Override
    public void apagar() {
        System.out.println("La camioneta se ha apagado.");
    }

    @Override
    public void cargar(double peso) {
        System.out.println("Cargando " + peso + " kg en la camioneta.");
    }

    @Override
    public void descargar(double peso) {
        System.out.println("Descargando " + peso + " kg de la camioneta.");
    }

@Override
    public String toStringEspesifico() {
        return  ("Camioneta "+ " disponible:  " +getDisponible());
    }
    @Override
    public String toStringGeneral() {
        return ("Camioneta "+" codUnico: " + getCodUnico() + " color: " + getColor() + " modelo: " + getModelo() + " año: " + getAño()+ " numLLantas: " + getNumLLantas() + " plazas: " + getPlazas() + " capacidadValde: " + getCapacidadValde());
    }

   

}
