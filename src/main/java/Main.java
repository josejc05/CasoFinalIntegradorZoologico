package main;

import animal.*;
import mantenimientoYseguridad.*;
import habitat.*;
import recursos.*;
import visitante.*;

public class Main {
    public static void main(String[] args) {
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
        Habitat habitat = new Habitat();
        Recursos recursos = new Recursos();
        Visitante visitante = new Visitante();

        // Utilizamos los métodos de estas clases para interactuar con los animales y el entorno
        habitat.albergarAnimal(terrestre);
        recursos.proveerAlimento(terrestre);
        visitante.visitarAnimal(terrestre);
    }
}