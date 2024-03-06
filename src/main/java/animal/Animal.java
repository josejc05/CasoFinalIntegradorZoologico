// En el archivo Animal.java
package animal;

public abstract class Animal {
    private String species;
    private String diet;
    private double healthStatus;

    // Métodos getter y setter para cada atributo

    public abstract void eat();
    public abstract void checkHealthStatus();
}