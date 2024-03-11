package recursos;

public class Recursos {
    private int cantidadDeAlimento;
    private int cantidadDeMedicinas;
    private int cantidadDePersonal;

    public Recursos(int cantidadDeAlimento, int cantidadDeMedicinas, int cantidadDePersonal) {
        this.cantidadDeAlimento = cantidadDeAlimento;
        this.cantidadDeMedicinas = cantidadDeMedicinas;
        this.cantidadDePersonal = cantidadDePersonal;
    }

    public int getCantidadDeAlimento() {
        return cantidadDeAlimento;
    }

    public void setCantidadDeAlimento(int cantidadDeAlimento) {
        this.cantidadDeAlimento = cantidadDeAlimento;
    }

    public int getCantidadDeMedicinas() {
        return cantidadDeMedicinas;
    }

    public void setCantidadDeMedicinas(int cantidadDeMedicinas) {
        this.cantidadDeMedicinas = cantidadDeMedicinas;
    }

    public int getCantidadDePersonal() {
        return cantidadDePersonal;
    }

    public void setCantidadDePersonal(int cantidadDePersonal) {
        this.cantidadDePersonal = cantidadDePersonal;
    }

    public void gestionarRecursos() {
        System.out.println("Cantidad de alimento: " + cantidadDeAlimento);
        System.out.println("Cantidad de medicinas: " + cantidadDeMedicinas);
        System.out.println("Cantidad de personal: " + cantidadDePersonal);
    }
}