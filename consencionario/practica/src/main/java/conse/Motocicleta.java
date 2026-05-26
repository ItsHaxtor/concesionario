package conse;

public class Motocicleta extends Vehiculo {
    private String tipoManubrio;
     public Motocicleta(String codUnico, int plazas, String color, String modelo, int año, int numLLantas,boolean disponible, String tipoManubrio) {
        super(codUnico, plazas, color, modelo, año, numLLantas, disponible);
        this.tipoManubrio = tipoManubrio;
    }
    public void levantarAsiento(){
        System.out.println("El asiento de la motocicleta se ha levantado.");
    }
    @Override
    public void encender() {
        System.out.println("La motocicleta se ha encendido.");
    }
    @Override
    public void acelerar() {
        System.out.println("La motocicleta está acelerando.");
    }
    @Override
    public void frenar() {
        System.out.println("La motocicleta está frenando.");
    }
    @Override
    public void apagar() {  
        System.out.println("La motocicleta se ha apagado.");
    }
    public String getTipoManubrio() {
        return tipoManubrio;
    }
    public void setTipoManubrio(String tipoManubrio) {
        this.tipoManubrio = tipoManubrio;
    }
 @Override
    public String toStringEspesifico() {
        return  ("Motocicleta "+ " disponible:  " +getDisponible());
    }
    @Override
    public String toStringGeneral() {
        return ("Motocicleta "+" codUnico: " + getCodUnico() + " color: " + getColor() + " modelo: " + getModelo() + " año: " + getAño()+ " numLLantas: " + getNumLLantas() + " plazas: " + getPlazas() + " tipoManubrio: " + getTipoManubrio());
    }
  
    


}
