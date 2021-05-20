/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nolinearstructures.hashtable;

import java.util.Stack;

/**
 *
 * @author Arles
 */
public class HashCodeExample {
    public static void main(String[] args) {
        Integer a = 5;
        System.out.println("Hashcode de a: " + a.hashCode());
        Stack<Integer> st = new Stack<>();
        System.out.println("Hashcode de st: " + st.hashCode());
        EstudianteHowgarts e = new EstudianteHowgarts(7762828, "Hermione Granger");
        System.out.println("Hashcode de e: " + e.hashCode());
    }
}

class EstudianteHowgarts{
    Integer edad;
    String nombre;

    public EstudianteHowgarts(Integer edad, String nombre) {
        this.edad = edad;
        this.nombre = nombre;
    }        
}