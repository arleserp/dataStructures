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
public class Main {
    public static void main(String[] args) {
        ArrayList<Empleado> empleados = new ArrayList<>();
        Empleado e = new Empleado("Joseph", 1, 3000000);
        empleados.add(e);
        empleados.add(new Empleado("David", 2, 3500000));
        empleados.add(new Empleado("Juana", 3, 4000000));
        empleados.add(new Empleado("Camilo", 4, 4000000));
        empleados.add(new Empleado("Pedro", 5, 5000000));
        
        Empresa emp = new Empresa("Google", empleados);
        
        System.out.println(emp);
        
        
    }
}
