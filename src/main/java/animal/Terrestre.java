// En el archivo Terrestre.java
package animal;

public class Terrestre extends Animal {
    public Terrestre(String nombre, String estado) {
        super(nombre, "Terrestre", estado);
    }

    public String caminar() {
        return "El " + getNombre() + " está caminando";
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