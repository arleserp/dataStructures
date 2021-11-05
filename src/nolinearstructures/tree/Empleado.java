/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nolinearstructures.tree;

/**
 *
 * @author Arles
 */
public class Empleado {
    String nombre;
    Double salario;

    public Empleado(String name, Double salary) {
        this.nombre = name;
        this.salario = salary;
    }

    @Override
    public String toString() {
        return nombre + ", " + salario;
    }
    
    public void subirSalario(double aumento){
        salario += aumento;
    }
    
    public void bajarSalario(double dism){
        salario -= dism;
    }
    
}
