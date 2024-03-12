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

    public String getNombre() {
        return nombre;
    }

    public String getAlimentacion() {
        return alimentacion;
    }

    public String getSalud() {
        return salud;
    }

    public String getComportamiento() {
        return comportamiento;
    }

    public abstract void mostrarInformacion();
}