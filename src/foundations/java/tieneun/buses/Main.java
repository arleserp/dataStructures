/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foundations.java.tieneun.buses;

import java.util.ArrayList;

/**
 *
 * @author Arles
 */
public class Main {
    public static void main(String[] args) {
        Ruta r = new Ruta("Bogotá", "Medellín");
        ArrayList<Pasajero> pasajeros = new ArrayList<>();
        pasajeros.add(new Pasajero("Arles", 789354));
        pasajeros.add(new Pasajero("Felipe", 34343));
        pasajeros.add(new Pasajero("Luigui", 389783));
        pasajeros.add(new Pasajero("Juan Pablo", 389783));
        Bus b = new Bus(r, "FJE 783", pasajeros);
        System.out.println(b);
        
    }
}
