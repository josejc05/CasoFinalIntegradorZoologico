package mantenimientoYseguridad;

import animal.Animal;
import habitat.Habitat;

public class Seguimiento {
    private String nombre;
    private int edad;
    private Animal animal;
    private Habitat habitat;

    public Seguimiento(String nombre, int edad, Animal animal, Habitat habitat) {
        this.nombre = nombre;
        this.edad = edad;
        this.animal = animal;
        this.habitat = habitat;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public Animal getAnimal() {
        return animal;
    }

    public Habitat getHabitat() {
        return habitat;
    }

    public void hacerSeguimiento() {
        System.out.println("El trabajador " + nombre + " está haciendo seguimiento al animal: " + animal.getNombre());
        animal.mostrarInformacion();
        habitat.mostrarInformacion();
    }
}