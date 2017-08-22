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
public class CircularWithHeader implements LinearList {

    // data members
    protected ChainNode headerNode;
    protected int size;

    public CircularWithHeader() {
        headerNode = new ChainNode();
        headerNode.next = headerNode;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }

    void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("index = " + index + "  size = " + size);
        }
    }

    @Override
    public Object get(int index) {
        checkIndex(index);
        ChainNode currentNode = headerNode.next;
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.next;
        }
        return currentNode.element;
    }

    @Override
    public int indexOf(Object theElement) {
        headerNode.element = theElement;
        ChainNode currentNode = headerNode.next;
        int index = 0;
        while (!currentNode.element.equals(theElement)) {
            currentNode = currentNode.next;
            index++;
        }
        if (currentNode == headerNode) {
            return -1;
        } else {
            return index;
        }
    }

    @Override
    public Object remove(int index) {
        checkIndex(index);
        Object removedElement;
        ChainNode q = headerNode;
        for (int i = 0; i < index; i++) {
            q = q.next;
        }
        removedElement = q.next.element;
        q.next = q.next.next;
        size--;
        return removedElement;
    }

    @Override
    public void add(int index, Object theElement) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("index = " + index + "  size = " + size);
        }
        ChainNode p = headerNode; 
        for (int i = 0; i < index; i++) {
            p = p.next;
        }
        p.next = new ChainNode(theElement, p.next);
        size++;
    }

    
}
