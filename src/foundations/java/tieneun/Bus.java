/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foundations.java.tieneun;

import java.util.ArrayList;

/**
 *
 * @author Arles
 */
public class Bus {    
    private String placa;
    private ArrayList<Pasajero> pasajeros;
    private Ruta ruta;

    public Bus(Ruta ruta, String placa, ArrayList<Pasajero> pasajeros) {
        this.ruta = ruta;
        this.placa = placa;
        this.pasajeros = pasajeros;
    }

    @Override
    public String toString() {
        String salida = "Bus{" + "Ruta=" + ruta + ", placa=" + placa;
        salida += ", pasajeros=\n";
        
        for(Pasajero p: pasajeros){
           salida += p.toString() + "\n";
        }
        return salida;
    }    
}
