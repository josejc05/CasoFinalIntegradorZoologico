public class Animal {
    private String nombre;
    private String tipo;
    private String estado;

    public Animal(String nombre, String tipo, String estado) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.estado = estado;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String comer() {
        return "El " + nombre + " está comiendo";
    }

    public String dormir() {
        return "El " + nombre + " está durmiendo";
    }
}