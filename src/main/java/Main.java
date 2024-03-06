// En el archivo Main.java
import animal.Acuatico;
import animal.Aviario;
import animal.Terrestre;
import habitat.HabitatAcuatico;
import habitat.HabitatAviario;
import visitante.Visitante;

public class Main {
    public static void main(String[] args) {
        Acuatico acuatico = new Acuatico("Delfín", "Saludable");
        Aviario aviario = new Aviario("Águila", "Saludable");
        Terrestre terrestre = new Terrestre("Elefante", "Saludable");

        HabitatAcuatico habitatAcuatico = new HabitatAcuatico(0.9);
        HabitatAviario habitatAviario = new HabitatAviario(10);

        Visitante visitante = new Visitante("Jose", "Aves");

        // Llamar a los métodos de cada objeto
        System.out.println(acuatico.comer());
        System.out.println(acuatico.dormir());
        System.out.println(acuatico.nadar());

        System.out.println(aviario.comer());
        System.out.println(aviario.dormir());
        System.out.println(aviario.volar());

        System.out.println(terrestre.comer());
        System.out.println(terrestre.dormir());
        System.out.println(terrestre.caminar());

        visitante.visit(habitatAviario);
    }
}