package animal;

public class Acuatico extends Animal {
    private boolean esMarino;

    public Acuatico(String nombre, String alimentacion, String salud, String comportamiento, boolean esMarino) {
        super(nombre, alimentacion, salud, comportamiento);
        this.esMarino = esMarino;
    }

    // getters y setters

    @Override
    public void mostrarInformacion() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Alimentación: " + getAlimentacion());
        System.out.println("Salud: " + getSalud());
        System.out.println("Comportamiento: " + getComportamiento());
        System.out.println("Es marino: " + (esMarino ? "Sí" : "No"));
    }
}