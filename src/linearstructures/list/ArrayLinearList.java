/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linearstructures.list;

import utilities.ChangeArrayLength;


/**
 *
 * @author Arles
 */
public class ArrayLinearList implements LinearList {

    // data members
    protected Object[] element; // array of elements
    protected int size; // number of elements in array

    /**
     * create a list with initial capacity initialCapacity
     *
     * @throws IllegalArgumentException when initialCapacity < 1
     */
    public ArrayLinearList(int initialCapacity) {
        if (initialCapacity < 1) {
            throw new IllegalArgumentException("initialCapacity must be >= 1");
        }
        element = new Object[initialCapacity];
    }

    /**
     * create a list with initial capacity 10
     */
    public ArrayLinearList() {// use default capacity of 10
        this(10);
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
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

    /**
     * @return element with specified index
     * @throws IndexOutOfBoundsException when index is not between 0 and size -
     * 1
     */
    @Override
    public Object get(int index) {
        checkIndex(index);
        return element[index];
    }

    /**
     * @return index of first occurrence of theElement, return -1 if theElement
     * not in list
     */
    @Override
    public int indexOf(Object theElement) {
        // search element[] for theElement
        for (int i = 0; i < size; i++) {
            if (element[i].equals(theElement)) {
                return i;
            }
        }
        // theElement not found
        return -1;
    }

    /**
     * Remove the element with specified index. All elements with higher index
     * have their index reduced by 1.
     *
     * @throws IndexOutOfBoundsException when index is not between 0 and size -
     * 1
     * @return removed element
     */
    public Object remove(int index) {
        checkIndex(index);
        // valid index, shift elements with higher index
        Object removedElement = element[index];
        for (int i = index + 1; i < size; i++) {
            element[i - 1] = element[i];
        }
        element[--size] = null;
        return removedElement;
    }

    /**
     * All elements with equal or higher index have their index increased by 1.
     *
     * @param index
     * @param theElement
     * @throws IndexOutOfBoundsException when index is not between 0 and size
     */
    @Override
    public void add(int index, Object theElement) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("index = " + index + " size = " + size);
        }
        if (size == element.length) // no space, double capacity
        {
            element = ChangeArrayLength.changeLength1D(element, 2 * size);
        }
        // shift elements right one position
        for (int i = size - 1; i >= index; i--) {
            element[i + 1] = element[i];
        }
        element[index] = theElement;
        size++;
    }

    /**
     * convert to a string
     */
    @Override
    public String toString() {
        StringBuffer s = new StringBuffer("[");
        // put elements into the buffer
        for (int i = 0; i < size; i++) {
            if (element[i] == null) {
                s.append("null, ");
            } else {
                s.append(element[i].toString() + ", ");
            }
        }
        if (size > 0) {
            s.delete(s.length() - 2, s.length());
        }
        s.append("]");
        // create equivalent String
        return new String(s);
    }

    public static void main(String[] args) {
        LinearList x = new ArrayLinearList();
        System.out.println("Initial size is " + x.size());
        if (x.isEmpty()) {
            System.out.println("List is empty");
        } else {
            System.out.println("The list is not empty");
        }
        x.add(0, new Integer(2));
        x.add(1, new Integer(6));
        x.add(0, new Integer(1));
        x.add(2, new Integer(4));
        System.out.println("List size is " + x.size());
        System.out.println("The list is " + x);
        int index = x.indexOf(new Integer(4));
        if (index < 0) {
            System.out.println("4 not found");
        } else {
            System.out.println("The index of 4 is " + index);
        }
        index = x.indexOf(new Integer(3));
        if (index < 0) {
            System.out.println("3 not found");
        } else {
            System.out.println("The index of 3 is " + index);
        }
        System.out.println("Element at 0 is " + x.get(0));
        System.out.println("Element at 3 is " + x.get(3));
        System.out.println(x.remove(1) + " removed");
        System.out.println("The list is " + x);
        System.out.println(x.remove(2) + " removed");
        System.out.println("The list is " + x);
        if (x.isEmpty()) {
            System.out.println("List is empty");
        } else {
            System.out.println("List is not empty");
        }
        System.out.println("List size is " + x.size());
    }

}
