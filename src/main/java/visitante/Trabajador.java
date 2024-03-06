import animal.Animal;

public class Trabajador {
    private String name;

    public Trabajador(String name) {
        this.name = name;
    }

    // Métodos getter y setter para cada atributo

    public void administrarVacunas(Animal animal) {
        // Implementar la lógica para que el trabajador administre las vacunas a un animal
        System.out.println("Administrando vacunas al animal: " + animal.getNombre());
    }
}