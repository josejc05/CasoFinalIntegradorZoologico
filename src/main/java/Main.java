// En el archivo Aviario.java
package animal;

public class Aviario extends Animal {
    public Aviario(String nombre, String estado) {
        super(nombre, "Aviario", estado);
    }

    public String volar() {
        return "El " + getNombre() + " está volando";
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