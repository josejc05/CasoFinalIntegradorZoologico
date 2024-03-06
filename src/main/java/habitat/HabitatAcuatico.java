// En el archivo HabitatAcuatico.java
package habitat;

public class HabitatAcuatico extends Habitat {
    private double waterQuality;

    public HabitatAcuatico(double waterQuality) {
        this.waterQuality = waterQuality;
    }

    // Métodos getter y setter para waterQuality

    @Override
    public void monitorConditions() {
        // Implementar la lógica para monitorear las condiciones del hábitat acuático
    }
}