package animal;

public class Terrestre extends Animal {
    private String tipoSuelo;

    public Terrestre(String nombre, String alimentacion, String salud, String comportamiento, String tipoSuelo) {
        super(nombre, alimentacion, salud, comportamiento);
        this.tipoSuelo = tipoSuelo;
    }

    // getters y setters

    @Override
    public void mostrarInformacion() {
        // Implementación del método mostrarInformacion
    }
}