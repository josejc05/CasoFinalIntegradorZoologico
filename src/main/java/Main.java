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
        System.out.println("¿Eres un visitante o un trabajador? (V/T)");
        String userType = scanner.nextLine(); // Aquí el usuario introduce su tipo

        Habitat sabana = new Habitat("Sabana", 100.0, 75.0, true); // Aquí debes crear el hábitat de la sabana
        Habitat oceano = new Habitat("Océano", 200.0, 150.0, false); // Aquí debes crear el hábitat del océano
        Habitat montanas = new Habitat("Montañas", 300.0, 225.0, true); // Aquí debes crear el hábitat de las montañas

        // Crear los animales y añadirlos a los hábitats
        AnimalConcreto leon = new AnimalConcreto("León", "Carnívoro");
        AnimalConcreto tiburon = new AnimalConcreto("Tiburón", "Carnívoro");
        AnimalConcreto oso = new AnimalConcreto("Oso", "Omnívoro");

        sabana.agregarAnimal(leon);
        oceano.agregarAnimal(tiburon);
        montanas.agregarAnimal(oso);

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
        } else if (userType.equalsIgnoreCase("V")) {
            // Aquí puedes agregar el código para manejar las acciones del visitante
        } else {
            System.out.println("No se reconoce el tipo de usuario seleccionado.");
        }
    }
}