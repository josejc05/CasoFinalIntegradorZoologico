// En el archivo Acuatico.java
package animal;

public class Acuatico extends Animal {
    public Acuatico(String nombre, String estado) {
        super(nombre, "Acuatico", estado);
    }

    public String nadar() {
        return "El " + getNombre() + " está nadando";
    }

    @Override
    public String comer() {
        return "El " + getNombre() + " está comiendo";
    }

    @Override
    public String dormir() {
        return "El " + getNombre() + " está durmiendo";
    }
}