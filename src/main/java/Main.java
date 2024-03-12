import java.util.Scanner;

import animal.*;
import mantenimientoYseguridad.*;
import habitat.*;
import recursos.*;
import visitante.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Definir las variables
        String userType = "T"; // Aquí debes obtener el tipo de usuario de alguna manera
        Habitat sabana = new Habitat(); // Aquí debes crear el hábitat de la sabana
        Habitat oceano = new Habitat(); // Aquí debes crear el hábitat del océano
        Habitat montanas = new Habitat(); // Aquí debes crear el hábitat de las montañas

        // ... (El resto de tu código se mantiene igual)

        if (userType.equalsIgnoreCase("T")) {
            System.out.println("Eres un trabajador. ¿Qué tarea quieres realizar? (Vigilar/Seguimiento)");
            String tarea = scanner.nextLine();

            if (tarea.equalsIgnoreCase("Vigilar")) {
                System.out.println("¿Qué hábitat quieres vigilar? (Sabana/Océano/Montañas)");
                String habitatChoice = scanner.nextLine();

                Habitat habitatSeleccionado;
                switch (habitatChoice.toLowerCase()) {
                    case "sabana":
                        habitatSeleccionado = sabana;
                        break;
                    case "océano":
                        habitatSeleccionado = oceano;
                        break;
                    case "montañas":
                        habitatSeleccionado = montanas;
                        break;
                    default:
                        System.out.println("No se reconoce el hábitat seleccionado.");
                        return;
                }

                Vigilar vigilante = new Vigilar("Pedro", 30, habitatSeleccionado);
                vigilante.vigilarHabitat();

            } else if (tarea.equalsIgnoreCase("Seguimiento")) {
                System.out.println("¿Qué hábitat quieres seleccionar para el seguimiento? (Sabana/Océano/Montañas)");
                String habitatChoice = scanner.nextLine();

                Habitat habitatSeleccionado;
                switch (habitatChoice.toLowerCase()) {
                    case "sabana":
                        habitatSeleccionado = sabana;
                        break;
                    case "océano":
                        habitatSeleccionado = oceano;
                        break;
                    case "montañas":
                        habitatSeleccionado = montanas;
                        break;
                    default:
                        System.out.println("No se reconoce el hábitat seleccionado.");
                        return;
                }

                System.out.println("¿Qué animal quieres seleccionar para el seguimiento? (1/2/3)");
                int animalChoice = scanner.nextInt();

                if (animalChoice < 1 || animalChoice > 3) {
                    System.out.println("No se reconoce el animal seleccionado.");
                    return;
                }

                Seguimiento seguimiento = new Seguimiento("Pedro", 30, habitatSeleccionado.getAnimales().get(animalChoice - 1));
                seguimiento.hacerSeguimiento();
            } else {
                System.out.println("No se reconoce la tarea seleccionada.");
            }
        }
    }
}