package habitat;

public abstract class Habitat {
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

    public abstract void monitorear();
}