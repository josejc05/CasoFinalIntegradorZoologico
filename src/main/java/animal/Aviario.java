package animal;

public class Aviario extends Animal {
    private boolean puedeVolar;

    public Aviario(String nombre, String alimentacion, String salud, String comportamiento, boolean puedeVolar) {
        super(nombre, alimentacion, salud, comportamiento);
        this.puedeVolar = puedeVolar;
    }

    // getters y setters

    @Override
    public void mostrarInformacion() {
        // Implementación del método mostrarInformacion
    }
}