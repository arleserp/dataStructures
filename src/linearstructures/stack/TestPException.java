package linearstructures.stack;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;
import java.util.Stack;
/**
 *
 * @author arlese.rodriguezp
 */
public class TestPException {

    public static void main(String[] args) {
        Stack stack = new Stack();
                
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
                    System.out.println(stack.pop() + ", " + i);
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
        /*if(!error) {
            System.out.println("Match!");
        }*/

    }

}
