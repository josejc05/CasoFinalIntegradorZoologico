// En el archivo Aviario.java
package animal;

public class Aviario extends Animal {
    public Aviario(String nombre, String estado) {
        super(nombre, "Aviario", estado);
    }

    public String volar() {
        return "El " + getNombre() + " está volando";
    }
}