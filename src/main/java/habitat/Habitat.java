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

    // getters y setters

    public abstract void monitorear();
}