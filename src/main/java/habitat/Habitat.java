// En el archivo Habitat.java
package habitat;

public abstract class Habitat {
    private double temperature;
    private double humidity;
    private boolean isClean;

    // Métodos getter y setter para cada atributo

    public abstract void monitorConditions();
}