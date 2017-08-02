/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foundations.java;

/**
 * Because Java passes arguments by value, this code does not work to swap the value of the variables.
 * @author Arles
 */
public class TestSwap2 {

    public static void swap(Object x, Object y) {
        Object temp;
        temp = x;
        x = y;
        y = temp;
    }

    public static void main(String[] args) {
        Integer a = new Integer(4);
        Integer b = new Integer(5);
        swap(a, b);
        System.out.println("a=" + a); // 4
        System.out.println("b=" + b); // 5
    }
}
