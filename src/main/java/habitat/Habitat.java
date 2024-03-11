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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public double getHumedad() {
        return humedad;
    }

    public void setHumedad(double humedad) {
        this.humedad = humedad;
    }

    public boolean isLimpieza() {
        return limpieza;
    }

    public void setLimpieza(boolean limpieza) {
        this.limpieza = limpieza;
    }

    public void monitorear() {
        System.out.println("Monitoreando el hábitat...");
        System.out.println("ID: " + getId());
        System.out.println("Temperatura: " + getTemperatura());
        System.out.println("Humedad: " + getHumedad());
        System.out.println("Limpieza: " + isLimpieza());
    }
}