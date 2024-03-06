public class HabitatAcuatico extends Habitat {
    private double nivelAgua;

    public HabitatAcuatico(String id, double temperatura, double humedad, boolean limpieza, double nivelAgua) {
        super(id, temperatura, humedad, limpieza);
        this.nivelAgua = nivelAgua;
    }

    // getters y setters

    @Override
    public void monitorear() {
        // implementar monitoreo específico para hábitat acuático
    }
}