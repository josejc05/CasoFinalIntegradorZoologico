package mantenimientoYseguridad;

import animal.Animal;

public class Seguimiento {
    private Animal animal;

    public Seguimiento(Animal animal) {
        this.animal = animal;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public void rastrearComportamiento() {
        System.out.println("Rastreando el comportamiento del animal: " + animal.toString());
    }
}