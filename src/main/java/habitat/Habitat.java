package habitat;

import animal.*;
import java.util.ArrayList;
import java.util.List;

public class Habitat {
    private String nombre;
    private double area;
    private double temperatura;
    private boolean esNatural;
    private List<Animal> animales; // Lista de animales en el hábitat

    public Habitat(String nombre, double area, double temperatura, boolean esNatural) {
        this.nombre = nombre;
        this.area = area;
        this.temperatura = temperatura;
        this.esNatural = esNatural;
        this.animales = new ArrayList<>();
    }

    // getters y setters

    public List<Animal> getAnimales() {
        return animales;
    }

    public void agregarAnimal(Animal animal) {
        this.animales.add(animal);
    }

    // Método para mostrar todos los animales en el hábitat
    public void mostrarAnimales() {
        System.out.println("Animales en el hábitat " + nombre + ":");
        for (Animal animal : animales) {
            System.out.println("- " + animal.getNombre());
        }
    }

    // Método para buscar un animal específico en el hábitat
    public Animal buscarAnimal(String nombreAnimal) {
        for (Animal animal : animales) {
            if (animal.getNombre().equalsIgnoreCase(nombreAnimal)) {
                return animal;
            }
        }
        return null;
    }

    // Otros métodos...
}