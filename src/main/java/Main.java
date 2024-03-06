// En el archivo Main.java
package main;

import animal.Acuatico;
import animal.Aviario;
import animal.Terrestre;
import habitat.Habitat;

public class Main {
    public static void main(String[] args) {
        Acuatico acuatico = new Acuatico();
        Aviario aviario = new Aviario();
        Terrestre terrestre = new Terrestre();

        // Llamar a los métodos de cada objeto
        acuatico.eat();
        acuatico.checkHealthStatus();

        aviario.eat();
        aviario.checkHealthStatus();

        terrestre.eat();
        terrestre.checkHealthStatus();
    }
}