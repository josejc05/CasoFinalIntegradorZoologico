public class Terrestre extends Animal {
    public Terrestre(String nombre, String estado) {
        super(nombre, "Terrestre", estado);
    }

    public String correr() {
        return "El " + getNombre() + " está corriendo";
    }
}