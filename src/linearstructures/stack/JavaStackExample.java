/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linearstructures.stack;

import java.util.Stack;
/**
 *
 * @author Arles
 */
public class JavaStackExample {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        
        System.out.println("Elemento en el tope:" + s.peek());
        while(!s.empty()){
            System.out.println(s.pop());
        }
    }
}
