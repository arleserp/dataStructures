/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foundations.java.tieneun.buses;

/**
 *
 * @author Arles
 */
public class Pasajero {
    private String nombre;
    private int cedula;

    public Pasajero(String nombre, int cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
    }

    @Override
    public String toString() {
        return "Pasajero{" + "nombre=" + nombre + ", cedula=" + cedula + '}';
    }
    
}
