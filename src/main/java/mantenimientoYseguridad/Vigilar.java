package mantenimientoYseguridad;

import habitat.Habitat;

public class Vigilar {
    private String nombre;
    private int edad;
    private Habitat habitat;

    public Vigilar(String nombre, int edad, Habitat habitat) {
        this.nombre = nombre;
        this.edad = edad;
        this.habitat = habitat;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public Habitat getHabitat() {
        return habitat;
    }

    public void vigilarHabitat() {
        System.out.println("");
    }
}