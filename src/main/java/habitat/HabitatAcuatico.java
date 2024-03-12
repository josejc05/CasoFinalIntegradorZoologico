package habitat;

public class HabitatAcuatico extends Habitat {
    private double nivelAgua;
    private boolean esSalado;

    public HabitatAcuatico(String id, double temperatura, double humedad, boolean limpieza, double nivelAgua, boolean esSalado) {
        super(id, temperatura, humedad, limpieza);
        this.nivelAgua = nivelAgua;
        this.esSalado = esSalado;
    }

    public double getNivelAgua() {
        return nivelAgua;
    }

    public boolean esSalado() {
        return esSalado;
    }

    @Override
    public void monitorear() {
        super.monitorear();
        System.out.println("Nivel de agua: " + getNivelAgua());
        System.out.println("Es salado: " + (esSalado() ? "Sí" : "No"));
    }
}