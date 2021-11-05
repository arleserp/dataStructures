/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nolinearstructures.tree;

import java.util.ArrayList;
import java.util.function.Consumer;

/**
 * Consumer example
 * usage of functional expressions to define something that is capable of applying 
 * one operation of Empleado taking advantage of recorrer
 * @author Arles
 */
public class ConsumerExample {
    ArrayList<Empleado> empleados; 

    public ConsumerExample() {
        this.empleados = new ArrayList<>();        
    }
    
    public void addEmpleado(String nombre, double salario){
        Empleado e = new Empleado(nombre, salario);
        empleados.add(e);
    }
    
    public void recorrer(Consumer<Empleado> operacion){
        for(Empleado e: empleados){
            operacion.accept(e);
        }
    }

    @Override
    public String toString() {        
        String sal = "-------Empleados--------\n";
        for(Empleado e: empleados){
            sal += e.toString() + "\n";
        }
        return sal;
    }
    
    
    
    public static void main(String[] args) {
        ConsumerExample c = new ConsumerExample();
        c.addEmpleado("Berlin", 5000000);
        c.addEmpleado("Rio", 1000000);
        c.addEmpleado("Nairobi", 6000000);
        c.addEmpleado("Tokyo", 4000000);
        
        System.out.println(c);
        c.recorrer(e->e.subirSalario(1000));
        System.out.println(c);
        c.recorrer(e->e.bajarSalario(1000000));
        System.out.println(c);
        
    }


}


