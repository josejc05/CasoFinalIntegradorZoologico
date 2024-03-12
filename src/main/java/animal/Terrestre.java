package animal;

public class Terrestre extends Animal {
    private String tipo;
    private String habitat; // nuevo atributo

    public Terrestre(String nombre, String alimentacion, String salud, String comportamiento, String tipo, String habitat) {
        super(nombre, alimentacion, salud, comportamiento);
        this.tipo = tipo;
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
        System.out.println("Tipo: " + tipo);
        System.out.println("Hábitat: " + getHabitat()); // mostrar el hábitat
    }
}