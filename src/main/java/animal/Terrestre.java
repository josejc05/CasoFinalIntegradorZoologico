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
        System.out.println("Nombre: " + getNombre());
        System.out.println("Alimentación: " + getAlimentacion());
        System.out.println("Salud: " + getSalud());
        System.out.println("Comportamiento: " + getComportamiento());
        System.out.println("Tipo de suelo: " + tipoSuelo);
    }
}