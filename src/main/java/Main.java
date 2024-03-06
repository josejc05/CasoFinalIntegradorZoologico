import habitat.*;
import animal.*;
import visitor.*;
import resource.*;
import maintenance.*;
import security.*;

public class Main {
    public static void main(String[] args) {
        // Crear instancias de las clases de los diferentes módulos
        AquaticHabitat aquaticHabitat = new AquaticHabitat();
        Lion lion = new Lion();
        Visitor visitor = new Visitor();
        Food food = new Food();
        Maintenance maintenance = new Maintenance();
        Camera camera = new Camera();

        // Llamar a los métodos de las instancias para ejecutar las funcionalidades del sistema
        aquaticHabitat.monitorConditions();
        lion.eat(food);
        visitor.takeTour();
        maintenance.performMaintenance();
        camera.monitorArea();
    }
}