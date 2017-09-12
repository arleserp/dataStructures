/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linearstructures.stack;

import java.util.EmptyStackException;
import linearstructures.list.ArrayLinearList;

/**
 *
 * @author arlese.rodriguezp
 */
public class DerivedArrayStack extends ArrayLinearList implements Stack {
    // constructors
    public DerivedArrayStack(int initialCapacity) {
        super(initialCapacity);
    }

    public DerivedArrayStack() {
        this(10);
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
        return get(size - 1);
    }

    @Override
    public void push(Object theObject) {
        add(size(), theObject);
    }

    @Override
    public Object pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return remove(size - 1);
    }
}
