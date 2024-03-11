package mantenimientoYseguridad;

import animal.Animal;

public class Vigilar {
    private Animal animal;

    public Vigilar(Animal animal) {
        this.animal = animal;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public void supervisarAnimal() {
        System.out.println("Supervisando al animal: " + animal.toString());
    }
}