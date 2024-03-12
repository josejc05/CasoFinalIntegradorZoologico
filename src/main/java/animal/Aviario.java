package animal;

public class Aviario extends Animal {
    private boolean puedeVolar;
    private int alturaMaximaDeVuelo;

    public Aviario(String nombre, String alimentacion, String salud, String comportamiento, boolean puedeVolar, int alturaMaximaDeVuelo) {
        super(nombre, alimentacion, salud, comportamiento);
        this.puedeVolar = puedeVolar;
        this.alturaMaximaDeVuelo = alturaMaximaDeVuelo;
    }

    // getters y setters

    @Override
    public void mostrarInformacion() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Alimentación: " + getAlimentacion());
        System.out.println("Salud: " + getSalud());
        System.out.println("Comportamiento: " + getComportamiento());
        System.out.println("Puede volar: " + (puedeVolar ? "Sí" : "No"));
        System.out.println("Altura máxima de vuelo: " + alturaMaximaDeVuelo);
    }
}