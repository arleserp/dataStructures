/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foundations.java.tieneun.empresa;

import java.util.ArrayList;

/**
 *
 * @author Arles
 */
public class Empresa {
    private String nombre;
    private ArrayList<Empleado> empleados; //Empresa tiene * Empleado

    public Empresa(String nombre, ArrayList<Empleado> empleados) {
        this.nombre = nombre;
        this.empleados = empleados;
    }

    @Override
    public String toString() {
        
        String s = "Empresa " + "nombre: " + nombre + ", empleados: \n";
        for(Empleado em: empleados){
            s += em.toString() + "\n";
        }
        return s;
    }        
}
