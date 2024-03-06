// En el archivo Visitante.java
package visitante;

import habitat.Habitat;

public class Visitante {
    private String name;
    private String interest;

    public Visitante(String name, String interest) {
        this.name = name;
        this.interest = interest;
    }

    // Métodos getter y setter para cada atributo

    public void visit(Habitat habitat) {
        // Implementar la lógica para que el visitante visite un hábitat
        System.out.println("Visitando el hábitat: " + habitat.getClass().getSimpleName());
    }

    public void consultarVacunas(Animal animal) {
        // Implementar la lógica para que el visitante consulte las vacunas de un animal
        System.out.println("Consultando las vacunas del animal: " + animal.getNombre());
    }
}