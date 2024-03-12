package visitante;

import animal.*;

public class Visitante {
    private String nombre;
    private int edad;

    public Visitante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void visitarAnimal(Animal animal) {
        System.out.println(nombre + " está visitando a " + animal.getNombre());
        animal.mostrarInformacion();
    }
}