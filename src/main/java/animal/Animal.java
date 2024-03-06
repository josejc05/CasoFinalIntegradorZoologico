// En el archivo Animal.java
package animal;

public abstract class Animal {
    private String nombre;
    private String tipo;
    private String estado;

    public Animal(String nombre, String tipo, String estado) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.estado = estado;
    }

    // Métodos getter y setter para cada atributo

    public abstract String comer();
    public abstract String dormir();
}