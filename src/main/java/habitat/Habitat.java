package habitat;

import animal.Animal;
import java.util.ArrayList;

public class Habitat {
    private String id;
    private double temperatura;
    private double humedad;
    private boolean limpieza;
    private ArrayList<Animal> animales;

    public Habitat(String id, double temperatura, double humedad, boolean limpieza) {
        this.id = id;
        this.temperatura = temperatura;
        this.humedad = humedad;
        this.limpieza = limpieza;
        this.animales = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public double getHumedad() {
        return humedad;
    }

    public boolean isLimpieza() {
        return limpieza;
    }

    public ArrayList<Animal> getAnimales() {
        return animales;
    }

    public void agregarAnimal(Animal animal) {
        animales.add(animal);
    }

    public void mostrarInformacion() {
        System.out.println("ID: " + id);
        System.out.println("Temperatura: " + temperatura);
        System.out.println("Humedad: " + humedad);
        System.out.println("Limpieza: " + (limpieza ? "Limpio" : "Sucio"));
    }

    public void mostrarAnimales() {
        for (int i = 0; i < animales.size(); i++) {
            System.out.println((i + 1) + ". " + animales.get(i).getNombre());
        }
    }
}