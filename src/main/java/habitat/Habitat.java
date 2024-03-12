package habitat;

import java.util.ArrayList;
import java.util.List;
import animal.Animal;

public class Habitat {
    private String id;
    private double temperatura;
    private double humedad;
    private boolean limpieza;
    private List<Animal> animales;

    public Habitat(String id, double temperatura, double humedad, boolean limpieza) {
        this.id = id;
        this.temperatura = temperatura;
        this.humedad = humedad;
        this.limpieza = limpieza;
        this.animales = new ArrayList<>();
    }

    // getters y setters

    public void monitorear() {
        System.out.println("ID: " + id);
        System.out.println("Temperatura: " + temperatura);
        System.out.println("Humedad: " + humedad);
        System.out.println("Limpieza: " + (limpieza ? "Sí" : "No"));
    }

    public void agregarAnimal(Animal animal) {
        this.animales.add(animal);
    }

    public void removerAnimal(Animal animal) {
        this.animales.remove(animal);
    }

    public Animal buscarAnimal(String nombre) {
        for (Animal animal : this.animales) {
            if (animal.getNombre().equals(nombre)) {
                return animal;
            }
        }
        return null;
    }

    public void mostrarAnimales() {
        System.out.println("Animales en el hábitat:");
        for (Animal animal : this.animales) {
            System.out.println("- " + animal.getNombre());
        }
    }
}