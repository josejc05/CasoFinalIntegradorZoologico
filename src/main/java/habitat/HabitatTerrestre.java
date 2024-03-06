package habitat;

public class HabitatTerrestre extends Habitat {
    private String tipoSuelo;

    public HabitatTerrestre(String id, double temperatura, double humedad, boolean limpieza, String tipoSuelo) {
        super(id, temperatura, humedad, limpieza);
        this.tipoSuelo = tipoSuelo;
    }

    public String getTipoSuelo() {
        return tipoSuelo;
    }

    public void setTipoSuelo(String tipoSuelo) {
        this.tipoSuelo = tipoSuelo;
    }

    @Override
    public void monitorear() {
        System.out.println("Monitoreando el hábitat terrestre...");
        System.out.println("Temperatura: " + getTemperatura());
        System.out.println("Humedad: " + getHumedad());
        System.out.println("Limpieza: " + isLimpieza());
        System.out.println("Tipo de suelo: " + getTipoSuelo());
    }
}