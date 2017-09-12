/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linearstructures.stack;

import java.util.EmptyStackException;
import linearstructures.list.Chain;
import linearstructures.list.ChainNode;

/**
 *
 * @author arlese.rodriguezp
 */
public class DerivedLinkedStack extends Chain implements Stack {
    // data members
    public DerivedLinkedStack(int initialCapacity) {
        super();
    }

    public DerivedLinkedStack() {
        this(0);
    }

    @Override
    public boolean empty() {
        return isEmpty();
    }

    @Override
    public Object peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return get(0);
    }

    @Override
    public void push(Object theObject) {        
        add(0, theObject);        
    }

    @Override
    public Object pop() {
        if (empty()) {
            throw new EmptyStackException();
        }
        return remove(0);
    }

}
