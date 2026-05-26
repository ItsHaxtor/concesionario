package conse;

public class Automovil extends Vehiculo {
    private boolean convertible;

    public Automovil(String codUnico, int plazas, String color, String modelo, int año, int numLLantas, boolean disponible,
            boolean convertible) {
        super(codUnico, plazas, color, modelo, año, numLLantas, disponible);
        this.convertible = convertible;
    }

    @Override
    public void encender() {
        System.out.println("El automóvil se ha encendido.");
    }

    @Override
    public void acelerar() {
        System.out.println("El automóvil está acelerando.");
    }

    @Override
    public void frenar() {
        System.out.println("El automóvil está frenando.");
    }

    @Override
    public void apagar() {
        System.out.println("El automóvil se ha apagado.");
    }

    public boolean isConvertible() {
        return convertible;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }


    @Override
    public String toStringEspesifico() {
        return  ("Automovil "+ " disponible:  " +getDisponible());
    }
    @Override
    public String toStringGeneral() {
        return ("Automovil " + "codUnico: " + getCodUnico() + " color: " + getColor() + " modelo: " + getModelo() + " año: " + getAño()+ " numLLantas: " + getNumLLantas() + " plazas: " + getPlazas() + " convertible: " + isConvertible());
    }

}
