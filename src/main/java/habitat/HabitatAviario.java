package habitat;

public class HabitatAviario extends Habitat {

    public HabitatAviario(String id, double temperatura, double humedad, boolean limpieza) {
        super(id, temperatura, humedad, limpieza);
    }

    @Override
    public void monitorear() {
        System.out.println("Monitoreando el hábitat aviario...");
        System.out.println("Temperatura: " + getTemperatura());
        System.out.println("Humedad: " + getHumedad());
        System.out.println("Limpieza: " + isLimpieza());
    }
}