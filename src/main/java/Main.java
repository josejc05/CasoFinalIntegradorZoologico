import java.util.Scanner;

// package main;

import animal.*;
import mantenimientoYseguridad.*;
import habitat.*;
import recursos.*;
import visitante.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Instanciamos las clases de la carpeta animal
        Terrestre terrestre1 = new Terrestre("Elefante", "Herbívoro", "Saludable", "Pacífico", "Terrestre", "Sabana");
        Terrestre terrestre2 = new Terrestre("León", "Carnívoro", "Saludable", "Agresivo", "Terrestre", "Sabana");
        Terrestre terrestre3 = new Terrestre("Jirafa", "Herbívoro", "Saludable", "Pacífico", "Terrestre", "Sabana");
        Acuatico acuatico1 = new Acuatico("Tiburón", "Carnívoro", "Saludable", "Agresivo", true, "Océano");
        Acuatico acuatico2 = new Acuatico("Delfín", "Carnívoro", "Saludable", "Pacífico", true, "Océano");
        Acuatico acuatico3 = new Acuatico("Ballena", "Herbívoro", "Saludable", "Pacífico", true, "Océano");
        Aviario aviario1 = new Aviario("Águila", "Carnívoro", "Saludable", "Agresivo", true, 2000, "Montañas");
        Aviario aviario2 = new Aviario("Halcón", "Carnívoro", "Saludable", "Agresivo", true, 2000, "Montañas");
        Aviario aviario3 = new Aviario("Cóndor", "Carnívoro", "Saludable", "Agresivo", true, 2000, "Montañas");

        // Instanciamos los hábitats y agregamos los animales a cada uno
        Habitat sabana = new Habitat("Sabana", 100.0, 75.0, true);
        sabana.agregarAnimal(terrestre1);
        sabana.agregarAnimal(terrestre2);
        sabana.agregarAnimal(terrestre3);

        Habitat oceano = new Habitat("Océano", 200.0, 15.0, true);
        oceano.agregarAnimal(acuatico1);
        oceano.agregarAnimal(acuatico2);
        oceano.agregarAnimal(acuatico3);

        Habitat montanas = new Habitat("Montañas", 50.0, 10.0, true);
        montanas.agregarAnimal(aviario1);
        montanas.agregarAnimal(aviario2);
        montanas.agregarAnimal(aviario3);

        // Instanciamos la clase Vigilar de la carpeta mantenimientoYseguridad y la utilizamos para supervisar a los animales
        // ...

        // Instanciamos las clases de las carpetas habitat, recursos y visitante
        // ...

        System.out.println("¿Eres un trabajador o un visitante? (T/V)");
        String userType = scanner.nextLine();

        if (userType.equalsIgnoreCase("V")) {
            System.out.println("¿Qué hábitat quieres visitar? (Sabana/Océano/Montañas)");
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

            System.out.println("¿Qué animal quieres visitar? (1/2/3)");
            int animalChoice = scanner.nextInt();

            if (animalChoice < 1 || animalChoice > 3) {
                System.out.println("No se reconoce el animal seleccionado.");
                return;
            }

            Visitante visitante = new Visitante("Juan", 25);
            visitante.visitarAnimal(habitatSeleccionado.getAnimales().get(animalChoice - 1));
        } else if (userType.equalsIgnoreCase("T")) {
            System.out.println("Eres un trabajador. Realiza tus tareas.");
        } else {
            System.out.println("No se reconoce el tipo de usuario seleccionado.");
        }
    }
}