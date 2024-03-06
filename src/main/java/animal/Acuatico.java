public class Acuatico extends Animal {
    public Acuatico(String nombre, String estado) {
        super(nombre, "Acuático", estado);
    }

    public String nadar() {
        return "El " + getNombre() + " está nadando";
    }
}