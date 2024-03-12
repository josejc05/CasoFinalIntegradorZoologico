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
        Terrestre terrestre = new Terrestre("Elefante", "Herbívoro", "Saludable", "Pacífico", "Terrestre");
        Acuatico acuatico = new Acuatico("Tiburón", "Carnívoro", "Saludable", "Agresivo", true);
        Aviario aviario = new Aviario("Águila", "Carnívoro", "Saludable", "Agresivo", true, 2000);

        // Instanciamos la clase Vigilar de la carpeta mantenimientoYseguridad y la utilizamos para supervisar a los animales
        Vigilar vigilarTerrestre = new Vigilar(terrestre);
        Vigilar vigilarAcuatico = new Vigilar(acuatico);
        Vigilar vigilarAviario = new Vigilar(aviario);

        vigilarTerrestre.supervisarAnimal();
        vigilarAcuatico.supervisarAnimal();
        vigilarAviario.supervisarAnimal();

        // Llamamos al método mostrarInformacion() para cada animal
        terrestre.mostrarInformacion();
        acuatico.mostrarInformacion();
        aviario.mostrarInformacion();

        // Instanciamos las clases de las carpetas habitat, recursos y visitante
        Habitat habitat = new Habitat("Bosque", 100.0, 75.0, true);
        Recursos recursos = new Recursos(10, 20, 30);

        System.out.println("¿Eres un trabajador o un visitante? (T/V)");
        String userType = scanner.nextLine();

        if (userType.equalsIgnoreCase("V")) {
            System.out.println("¿Qué animal quieres visitar? (Elefante/Tiburón/Águila)");
            String animalChoice = scanner.nextLine();

            Visitante visitante = new Visitante("Juan", 25);

            switch (animalChoice.toLowerCase()) {
                case "elefante":
                    // visitante.visitarAnimal(terrestre);
                    break;
                case "tiburón":
                    // visitante.visitarAnimal(acuatico);
                    break;
                case "águila":
                    // visitante.visitarAnimal(aviario);
                    break;
                default:
                    System.out.println("No se reconoce el animal seleccionado.");
                    break;
            }
        } else if (userType.equalsIgnoreCase("T")) {
            System.out.println("Eres un trabajador. Realiza tus tareas.");
        } else {
            System.out.println("No se reconoce el tipo de usuario seleccionado.");
        }
    }
}