/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foundations.java.tieneun.empresa;

/**
 *
 * @author Arles
 */
public class Empleado {
    private String nombre;
    private int codigo;
    private double salario;

    public Empleado(String nombre, int codigo, double salario) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "nombre: " + nombre + "\ncodigo:" + codigo + "\nsalario:" + salario;
    }
    
    
}
