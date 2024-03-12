package animal;

public class AnimalConcreto extends Animal {
    public AnimalConcreto(String nombre, String alimentacion, String salud, String comportamiento) {
        super(nombre, alimentacion, salud, comportamiento);
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Alimentación: " + getAlimentacion());
        System.out.println("Salud: " + getSalud());
        System.out.println("Comportamiento: " + getComportamiento());
    }
}