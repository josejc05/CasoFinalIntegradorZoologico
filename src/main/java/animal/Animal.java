package animal;

public abstract class Animal {
    private String nombre;
    private String alimentacion;
    private String salud;
    private String comportamiento;

    public Animal(String nombre, String alimentacion, String salud, String comportamiento) {
        this.nombre = nombre;
        this.alimentacion = alimentacion;
        this.salud = salud;
        this.comportamiento = comportamiento;
    }

    // getters y setters

    public abstract void mostrarInformacion();
}