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
public interface Stack {

    //return true if stack is empty false otherwise
    public boolean empty();

    //return top element in the stack
    public Object peek();

    //Add element at the top of the stack
    public void push(Object theObject);

    //Remove and return the element at the top of the stack
    public Object pop();
}
