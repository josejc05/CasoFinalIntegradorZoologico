package habitat;

public class HabitatTerrestre extends Habitat {
    private String tipoTerreno;
    private boolean tieneCuevas;

    public HabitatTerrestre(String id, double temperatura, double humedad, boolean limpieza, String tipoTerreno, boolean tieneCuevas) {
        super(id, temperatura, humedad, limpieza);
        this.tipoTerreno = tipoTerreno;
        this.tieneCuevas = tieneCuevas;
    }

    public String getTipoTerreno() {
        return tipoTerreno;
    }

    public void setTipoTerreno(String tipoTerreno) {
        this.tipoTerreno = tipoTerreno;
    }

    public boolean tieneCuevas() {
        return tieneCuevas;
    }

    public void setTieneCuevas(boolean tieneCuevas) {
        this.tieneCuevas = tieneCuevas;
    }

    @Override
    public void monitorear() {
        super.monitorear();
        System.out.println("Tipo de terreno: " + getTipoTerreno());
        System.out.println("Tiene cuevas: " + (tieneCuevas() ? "Sí" : "No"));
    }
}