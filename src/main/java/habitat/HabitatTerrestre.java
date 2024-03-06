public class HabitatTerrestre extends Habitat {
    private String tipoSuelo;

    public HabitatTerrestre(String id, double temperatura, double humedad, boolean limpieza, String tipoSuelo) {
        super(id, temperatura, humedad, limpieza);
        this.tipoSuelo = tipoSuelo;
    }

    // getters y setters

    @Override
    public void monitorear() {
        // implementar monitoreo específico para hábitat terrestre
    }
}

