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

        Habitat acuatico = new Habitat("Acuático", 100.0, 75.0, true);
        Habitat aviario = new Habitat("Aviario", 200.0, 150.0, false);
        Habitat terrestre = new Habitat("Terrestre", 300.0, 225.0, true);

        // Crear los animales y añadirlos a los hábitats
        AnimalConcreto tiburon = new AnimalConcreto("Tiburón", "Carnívoro", "Saludable", "Agresivo");
        AnimalConcreto delfin = new AnimalConcreto("Delfín", "Carnívoro", "Saludable", "Amigable");
        AnimalConcreto ballena = new AnimalConcreto("Ballena", "Herbívoro", "Saludable", "Tranquilo");

        acuatico.agregarAnimal(tiburon);
        acuatico.agregarAnimal(delfin);
        acuatico.agregarAnimal(ballena);

        AnimalConcreto aguila = new AnimalConcreto("Águila", "Carnívoro", "Saludable", "Agresivo");
        AnimalConcreto loro = new AnimalConcreto("Loro", "Herbívoro", "Saludable", "Amigable");
        AnimalConcreto pinguino = new AnimalConcreto("Pingüino", "Carnívoro", "Saludable", "Tranquilo");

        aviario.agregarAnimal(aguila);
        aviario.agregarAnimal(loro);
        aviario.agregarAnimal(pinguino);

        AnimalConcreto leon = new AnimalConcreto("León", "Carnívoro", "Saludable", "Agresivo");
        AnimalConcreto elefante = new AnimalConcreto("Elefante", "Herbívoro", "Saludable", "Amigable");
        AnimalConcreto jirafa = new AnimalConcreto("Jirafa", "Herbívoro", "Saludable", "Tranquilo");

        terrestre.agregarAnimal(leon);
        terrestre.agregarAnimal(elefante);
        terrestre.agregarAnimal(jirafa);

        if (userType.equalsIgnoreCase("T")) {
            System.out.println("Eres un trabajador. ¿Qué tarea quieres realizar? (Vigilar/Seguimiento)");
            String tarea = scanner.nextLine();

            if (tarea.equalsIgnoreCase("Vigilar")) {
                System.out.println("¿Qué hábitat quieres vigilar? (Acuático/Aviario/Terrestre)");
                String habitatChoice = scanner.nextLine();

                Habitat habitatSeleccionado;
                switch (habitatChoice.toLowerCase()) {
                    case "acuático":
                        habitatSeleccionado = acuatico;
                        break;
                    case "aviario":
                        habitatSeleccionado = aviario;
                        break;
                    case "terrestre":
                        habitatSeleccionado = terrestre;
                        break;
                    default:
                        System.out.println("No se reconoce el hábitat seleccionado.");
                        return;
                }

                Vigilar vigilante = new Vigilar("Pedro", 30, habitatSeleccionado);
                vigilante.vigilarHabitat();

            } else if (tarea.equalsIgnoreCase("Seguimiento")) {
                System.out.println("¿Qué hábitat quieres seleccionar para el seguimiento? (Acuático/Aviario/Terrestre)");
                String habitatChoice = scanner.nextLine();

                Habitat habitatSeleccionado;
                switch (habitatChoice.toLowerCase()) {
                    case "acuático":
                        habitatSeleccionado = acuatico;
                        break;
                    case "aviario":
                        habitatSeleccionado = aviario;
                        break;
                    case "terrestre":
                        habitatSeleccionado = terrestre;
                        break;
                    default:
                        System.out.println("No se reconoce el hábitat seleccionado.");
                        return;
                }

                System.out.println("¿Qué animal quieres seleccionar para el seguimiento? (1/2/3)");
                int animalChoice = scanner.nextInt();
                scanner.nextLine(); // consume the newline

                if (animalChoice < 1 || animalChoice > habitatSeleccionado.getAnimales().size()) {
                    System.out.println("No se reconoce el animal seleccionado.");
                    return;
                }

                Seguimiento seguimiento = new Seguimiento("Pedro", 30, habitatSeleccionado.getAnimales().get(animalChoice - 1));
                seguimiento.hacerSeguimiento();
            } else {
                System.out.println("No se reconoce la tarea seleccionada.");
            }
        } else if (userType.equalsIgnoreCase("V")) {
            System.out.println("Eres un visitante. ¿Qué hábitat quieres visitar? (Acuático/Aviario/Terrestre)");
            String habitatChoice = scanner.nextLine();

            Habitat habitatSeleccionado;
            switch (habitatChoice.toLowerCase()) {
                case "acuático":
                    habitatSeleccionado = acuatico;
                    break;
                case "aviario":
                    habitatSeleccionado = aviario;
                    break;
                case "terrestre":
                    habitatSeleccionado = terrestre;
                    break;
                default:
                    System.out.println("No se reconoce el hábitat seleccionado.");
                    return;
            }

            habitatSeleccionado.mostrarAnimales();
            System.out.println("¿Qué animal quieres visitar? (1/2/3)");
            int animalChoice = scanner.nextInt();
            scanner.nextLine(); // consume the newline

            if (animalChoice < 1 || animalChoice > habitatSeleccionado.getAnimales().size()) {
                System.out.println("No se reconoce el animal seleccionado.");
                return;
            }

            Animal animalSeleccionado = habitatSeleccionado.getAnimales().get(animalChoice - 1);
            Visitante visitante = new Visitante("Juan", 25);
            visitante.visitarAnimal(animalSeleccionado);
        } else {
            System.out.println("No se reconoce el tipo de usuario seleccionado.");
        }
    }
}