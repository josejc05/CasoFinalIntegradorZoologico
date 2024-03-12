package main;

import animal.*;
import mantenimientoYseguridad.*;

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

        // Aquí puedes agregar el código para instanciar y utilizar las clases de las carpetas habitat, recursos y visitante
    }
}