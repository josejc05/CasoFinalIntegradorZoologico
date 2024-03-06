package habitat;

public class HabitatAcuatico extends Habitat {
    private double nivelAgua;

    public HabitatAcuatico(String id, double temperatura, double humedad, boolean limpieza, double nivelAgua) {
        super(id, temperatura, humedad, limpieza);
        this.nivelAgua = nivelAgua;
    }

    public double getNivelAgua() {
        return nivelAgua;
    }

    public void setNivelAgua(double nivelAgua) {
        this.nivelAgua = nivelAgua;
    }

    @Override
    public void monitorear() {
        System.out.println("Monitoreando el hábitat acuático...");
        System.out.println("Temperatura: " + getTemperatura());
        System.out.println("Humedad: " + getHumedad());
        System.out.println("Limpieza: " + isLimpieza());
        System.out.println("Nivel de agua: " + getNivelAgua());
    }
}