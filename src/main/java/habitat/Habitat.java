package habitat;

public class Habitat {
    private String id;
    private double temperatura;
    private double humedad;
    private boolean limpieza;

    public Habitat(String id, double temperatura, double humedad, boolean limpieza) {
        this.id = id;
        this.temperatura = temperatura;
        this.humedad = humedad;
        this.limpieza = limpieza;
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

    public void monitorear() {
        // Implementación del método monitorear
    }
}