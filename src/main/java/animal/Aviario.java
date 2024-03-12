package animal;

public class Aviario extends Animal {
    private boolean puedeVolar;
    private int altitudMaxima;
    private String habitat; // nuevo atributo

    public Aviario(String nombre, String alimentacion, String salud, String comportamiento, boolean puedeVolar, int altitudMaxima, String habitat) {
        super(nombre, alimentacion, salud, comportamiento);
        this.puedeVolar = puedeVolar;
        this.altitudMaxima = altitudMaxima;
        this.habitat = habitat; // inicializar el nuevo atributo
    }

    // getters y setters

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Alimentación: " + getAlimentacion());
        System.out.println("Salud: " + getSalud());
        System.out.println("Comportamiento: " + getComportamiento());
        System.out.println("Puede volar: " + (puedeVolar ? "Sí" : "No"));
        System.out.println("Altitud máxima: " + altitudMaxima);
        System.out.println("Hábitat: " + getHabitat()); // mostrar el hábitat
    }
}