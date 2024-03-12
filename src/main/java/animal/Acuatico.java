package animal;

public class Acuatico extends Animal {
    private boolean esMarino;
    private String habitat; // nuevo atributo

    public Acuatico(String nombre, String alimentacion, String salud, String comportamiento, boolean esMarino, String habitat) {
        super(nombre, alimentacion, salud, comportamiento);
        this.esMarino = esMarino;
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
        System.out.println("Es marino: " + (esMarino ? "Sí" : "No"));
        System.out.println("Hábitat: " + getHabitat()); // mostrar el hábitat
    }
}