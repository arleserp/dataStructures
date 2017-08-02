/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foundations.java;

/**
 * This example pretends to show that Arguments passed to Java methods are passed by value. 
 * That is, a copy of the arguments is made and passed to the corresponding parameters.
 * @author Arles
 */
public class TestSwap {
    
    public static void swap(int x, int y) {
        int temp; 
        temp = x;
        x = y;
        y = temp;
    }
    
    public static void main(String[] args) {
        int a=4;
        int b=5;
        swap(a, b);
        System.out.println("a=" + a); // 4
        System.out.println("b=" + b); // 5
    }
}
