/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linearstructures.stack;

/**
 *
 * @author arlese.rodriguezp
 */
public class TestLinkedStack {

    public static void main(String[] args) {
        DerivedLinkedStack s = new DerivedLinkedStack();
        // add a few elements
        
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        //System.out.println("stack is" + s.toString());
        // delete all elements
        while (!s.empty()) {
            System.out.println("Top element is " + s.peek());
            System.out.println("Removed the element " + s.pop());
        }
    }
}
