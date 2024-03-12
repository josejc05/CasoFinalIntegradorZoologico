package visitante;

import animal.Animal;

public class Visitante {
    private String nombre;
    private int edad;

    public Visitante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void visitarAnimal(Animal animal) {
        System.out.println("El visitante " + nombre + " está visitando al animal: " + animal.getNombre());
        animal.mostrarInformacion();
    }
}