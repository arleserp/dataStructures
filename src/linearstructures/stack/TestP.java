/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linearstructures.stack;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author arlese.rodriguezp
 */
public class TestP {

    public static void main(String[] args) {
        Deque stack = new LinkedList<>();
        
        
        //DerivedLinkedStack stack = new DerivedLinkedStack();
        Scanner sc = new Scanner(System.in);
        String cad = sc.nextLine();
        boolean error = false;

        for (int i = 0; i < cad.length(); i++) {
            if (cad.charAt(i) == '(') {
                stack.push(i);
            }
            if (cad.charAt(i) == ')') {
                try {
                    stack.pop();
                } catch (Exception ex) {
                    System.out.println("falta abrir el parentesis que se cierra en " + i);
                    error = true;                    
                }
            }
        }
        while (!stack.isEmpty()) {
            System.out.println("Falta un ) para cerrar el parentesis abierto en " + stack.pop());
            error = true;
        } 
        if(!error) {
            System.out.println("Match!");
        }

    }

}
