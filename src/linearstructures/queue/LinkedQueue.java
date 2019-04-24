/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linearstructures.queue;

import linearstructures.list.ChainNode;

/**
 *
 * @author arlese.rodriguezp
 */
public class LinkedQueue implements Queue {

    // data members
    protected ChainNode front;
    protected ChainNode rear;

    public LinkedQueue() {
    }

    @Override
    public boolean isEmpty() {
        return front == null;
    }

    @Override
    public Object getFrontElement() {
        if (isEmpty()) {
            return null;
        } else {
            return front.element;
        }
    }

    @Override
    public Object getRearElement() {
        if (isEmpty()) {
            return null;
        } else {
            return rear.element;
        }

    }

    @Override
    public void put(Object theObject) {
        // create a node for theElement
        ChainNode p = new ChainNode(theObject, null);
        // append p to the chain
        if (front == null) {
            front = p; // empty queue
        } else {
            rear.next = p;// nonempty queue
        }
        rear = p;
    }

    @Override
    public Object remove() {
        if (isEmpty()) {
            return null;
        }
        Object frontElement = front.element;
        front = front.next;
        if (isEmpty()) {
            rear = null;// enable garbage collectionreturnfrontElement;
        }
        return frontElement;
    }

}
