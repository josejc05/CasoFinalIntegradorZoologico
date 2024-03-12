package habitat;

public class HabitatAviario extends Habitat {
    private int altitudMaxima;
    private boolean tieneNidos;

    public HabitatAviario(String id, double temperatura, double humedad, boolean limpieza, int altitudMaxima, boolean tieneNidos) {
        super(id, temperatura, humedad, limpieza);
        this.altitudMaxima = altitudMaxima;
        this.tieneNidos = tieneNidos;
    }

    public int getAltitudMaxima() {
        return altitudMaxima;
    }

    public void setAltitudMaxima(int altitudMaxima) {
        this.altitudMaxima = altitudMaxima;
    }

    public boolean tieneNidos() {
        return tieneNidos;
    }

    public void setTieneNidos(boolean tieneNidos) {
        this.tieneNidos = tieneNidos;
    }

    @Override
    public void monitorear() {
        super.monitorear();
        System.out.println("Altitud máxima: " + getAltitudMaxima());
        System.out.println("Tiene nidos: " + (tieneNidos() ? "Sí" : "No"));
    }
}