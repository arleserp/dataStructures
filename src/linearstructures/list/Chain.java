/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linearstructures.list;

/**
 *
 * @author Arles
 */
public class Chain implements LinearList {

    //data members
    protected ChainNode firstNode;
    protected int size;

    //Constructors
    public Chain(int initialCapacity) {

    }

    public Chain() {
        this(0);
    }

    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * @throws IndexOutOfBoundsException when index is not between 0 and size -
     * 1
     */
    void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("index = " + index + " size = " + size);
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Object get(int index) {
        checkIndex(index);
        ChainNode currentNode = firstNode;
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.next;
        }
        return currentNode.element;
    }

    @Override
    public int indexOf(Object theElement) {
        ChainNode currentNode = firstNode;
        int index = 0;
        while (currentNode != null
                && !currentNode.element.equals(theElement)) {
            currentNode = currentNode.next;
            index++;
        }
        if (currentNode == null) {
            return -1;
        } else {
            return index;
        }
    }

    @Override
    public Object remove(int index) {
        checkIndex(index);
        Object removedElement;
        if (index == 0) // remove first node
        {
            removedElement = firstNode.element;
            firstNode = firstNode.next;
        } else { // use q to get to predecessor of desired node
            ChainNode q = firstNode;
            for (int i = 0; i < index - 1; i++) {
                q = q.next;
            }
            removedElement = q.next.element;
            q.next = q.next.next; // remove desired node
        }
        size--;
        return removedElement;
    }

    @Override
    public void add(int index, Object theElement) {
        if (index < 0 || index > size) // invalid list position
        {
            throw new IndexOutOfBoundsException("index = " + index + "  size = " + size);
        }
        if (index == 0) // insert at front
        {
            firstNode = new ChainNode(theElement, firstNode);
        } else { // find predecessor of new element
            ChainNode p = firstNode;
            for (int i = 0; i < index - 1; i++) {
                p = p.next;
            }
            // insert after p
            p.next = new ChainNode(theElement, p.next);
        }
        size++;
    }

    @Override
    public String toString() {
        StringBuffer s = new StringBuffer("[");
        // put elements into the buffer
        for (ChainNode currentNode = firstNode; currentNode != null; currentNode = currentNode.next) {
            if (currentNode.element == null) {
                s.append("null, ");
            } else {
                s.append(currentNode.element.toString()).append(", ");
            }
        }
        /*ChainNode currentNode = firstNode
            while (currentNode != null) {
            if (currentNode.element == null) {
                s.append("null, ");
            } else {
                s.append(currentNode.element.toString() + ", ");
            }
            currentNode = currentNode.next;
        }*/
        // remove last ", "
        if (size > 0) {
            s.delete(s.length() - 2, s.length());
        }
        s.append("]");
        // create equivalent String
        return new String(s);
    }

}
