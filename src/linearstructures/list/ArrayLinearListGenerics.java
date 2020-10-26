/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linearstructures.list;

import utilities.ChangeArrayLength;
import java.lang.reflect.Array;
import java.util.Iterator;

/**
 *
 * @author Arles
 * @param <E>
 */
public class ArrayLinearListGenerics<E> implements LinearListGenerics<E>, Iterable<E> {

    // data members
    protected E[] element; // array of elements
    protected int size; // number of elements in array

    /**
     * create a list with initial capacity initialCapacity
     *
     * @throws IllegalArgumentException when initialCapacity < 1
     */
    public ArrayLinearListGenerics(int initialCapacity) {
        if (initialCapacity < 1) {
            throw new IllegalArgumentException("initialCapacity must be >= 1");
        }
        element = (E[]) new Object[initialCapacity];
    }

    /**
     * create a list with initial capacity 10
     */
    public ArrayLinearListGenerics() {// use default capacity of 10
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
    public E get(int index) {
        checkIndex(index);
        return (E) element[index];
    }

    /**
     * @return index of first occurrence of theElement, return -1 if theElement
     * not in list
     */
    @Override
    public int indexOf(E theElement) {
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
    public E remove(int index) {
        checkIndex(index);
        // valid index, shift elements with higher index
        E removedElement = element[index];
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
    public void add(int index, E theElement) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("index = " + index + " size = " + size);
        }
        if (size == element.length) // no space, double capacity
        {
            // allocate a new array of desired length and same type
            Object[] newArray = (Object[]) Array.newInstance(element.getClass().getComponentType(), 2 * size);
            // copy from old space to new space
            System.arraycopy(element, 0, newArray, 0, size);
            element = (E[])newArray;
            // element = ChangeArrayLength.changeLength1D(element, 2 * size);
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
        ArrayLinearListGenerics<Cientifico> ciencia = new ArrayLinearListGenerics<>();
        ciencia.add(0, new Cientifico("Hawking", "It would not be much of a universe if it wasn't home to the people you love"));
        ciencia.add(0, new Cientifico("Einstein", "If you can't explain it to a six year old, you don't understand it yourself."));
        ciencia.add(0, new Cientifico("Arles", "I hope you learn a lot in this data structures course. I hope to be a scientist some day."));
               
        System.out.println("Recorrer con foreach");
        for(Cientifico c: ciencia){
            System.out.println(c);       
        }
        
        System.out.println("Recorrer la lista con iterador");
        Iterator<Cientifico> it = ciencia.iterator();
        while(it.hasNext()){
            System.out.println(it.next().baba());
        }                

    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            int i=0;
            @Override
            public boolean hasNext() {
                return i < size;
            }

            @Override
            public E next() {
                return element[i++];          
            }
        };
    }
}

class Cientifico {

    String nombre;
    String frase;

    public Cientifico(String nombre, String frase) {
        this.nombre = nombre;
        this.frase = frase;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public String baba() {
        return "hahahahahha";
    }

    @Override
    public String toString() {
        return "Cientifico{" + "nombre=" + nombre + ", frase=" + frase + '}';
    }

}
