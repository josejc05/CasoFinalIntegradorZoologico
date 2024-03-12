package mantenimientoYseguridad;

import animal.Animal;

public class Seguimiento {
    private String nombre;
    private int edad;
    private Animal animal;

    public Seguimiento(String nombre, int edad, Animal animal) {
        this.nombre = nombre;
        this.edad = edad;
        this.animal = animal;
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

    public void hacerSeguimiento() {
        System.out.println("El trabajador " + nombre + " está haciendo seguimiento al animal: " + animal.getNombre());
    }
}