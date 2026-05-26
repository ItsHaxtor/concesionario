package conse;


abstract public class Vehiculo  {
    private String codUnico;
    private int plazas;
    private String color;
    private String modelo;
    private int año;
    private int numLLantas;
    private boolean disponible;

    public Vehiculo(String codUnico, int plazas, String color, String modelo, int año, int numLLantas,
            boolean disponible) {
        this.codUnico = codUnico;
        this.plazas = plazas;
        this.color = color;
        this.modelo = modelo;
        this.año = año;
        this.numLLantas = numLLantas;
        this.disponible = disponible;
    }

    public Vehiculo() {
    }

    public void encender() {
        System.out.println("El vehículo se ha encendido.");
    };

    public void acelerar() {
        System.out.println("El vehículo está acelerando.");
    };

    public void apagar() {
        System.out.println("El vehículo se ha apagado.");
    }

    public void frenar() {
        System.out.println("El vehículo está frenando.");
    }

    public int getPlazas() {
        return this.plazas;
    }

    public void setPlazas(int plazas) {
        this.plazas = plazas;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getNumLLantas() {
        return numLLantas;
    }

    public void setNumLLantas(int numLLantas) {
        this.numLLantas = numLLantas;
    }

    public boolean getDisponible() {
        return disponible;

    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    public String toStringEspesifico() {
        return "Vehiculo " + " disponible:  " + getDisponible();
    }
    public String toStringGeneral() {
        return "Vehiculo " + " color: " + getColor() + " modelo: " + getModelo() + " año: " + getAño()+ " numLLantas: " + getNumLLantas() + " plazas: " + getPlazas();
    }
    public String getCodUnico() {
        return codUnico;  
    }  
     

}
