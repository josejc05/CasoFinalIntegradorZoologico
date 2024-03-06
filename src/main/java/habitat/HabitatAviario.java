// En el archivo HabitatAviario.java
package habitat;

public class HabitatAviario extends Habitat {
    private int numberOfBirds;

    public HabitatAviario(int numberOfBirds) {
        this.numberOfBirds = numberOfBirds;
    }

    // Métodos getter y setter para numberOfBirds

    @Override
    public void monitorConditions() {
        // Implementar la lógica para monitorear las condiciones del aviario
    }
}