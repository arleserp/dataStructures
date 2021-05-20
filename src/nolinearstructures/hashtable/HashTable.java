/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nolinearstructures.hashtable;

import java.util.ArrayList;
import sorting.MagiciansC;

/**
 *
 * @author Arles
 */
public class HashTable {

    // data members of HashTable
    protected int divisor; // hash function divisor
    protected HashEntry[] table; // hash table array
    protected int size; // number of elements in table

    // constructor
    public HashTable(int theDivisor) {
        divisor = theDivisor;

        // allocate hash table array
        table = new HashEntry[divisor];
    }

    // methods
    /**
     * @return true iff the table is empty
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * @return current number of elements in the table
     */
    public int size() {
        return size;
    }

    /**
     * search an open addressed hash table for an element with key theKey
     *
     * @return location of matching element if found, otherwise return location
     * where an element with key theKey may be inserted provided the hash table
     * is not full
     */
    private int search(Object theKey) {
        int i = Math.abs(theKey.hashCode()) % divisor;  // home bucket
        int j = i;    // start at home bucket
        do {
            if (table[j] == null || table[j].key.equals(theKey)) {
                return j;
            }
            j = (j + 1) % divisor;  // next bucket
        } while (j != i);          // returned to home bucket?

        return j;  // table full
    }

    /**
     * @return element with specified key
     * @return null if no matching element
     */
    public Object get(Object theKey) {
        // search the table
        int b = search(theKey);

        // see if a match was found at table[b]
        if (table[b] == null || !table[b].key.equals(theKey)) {
            return null;           // no match
        }
        return table[b].element;  // matching element
    }

    /**
     * insert an element with the specified key overwrite old element if there
     * is already an element with the given key
     *
     * @throws IllegalArgumentException when the table is full
     * @return old element (if any) with key theKey
     */
    public Object put(Object theKey, Object theElement) {
        // search the table for a matching element
        int b = search(theKey);

        // check if matching element found
        if (table[b] == null) {
            // no matching element and table not full
            table[b] = new HashEntry(theKey, theElement);
            size++;
            return null;
        } else if (table[b].key.equals(theKey)) {
            Object elementToReturn = table[b].element;
            table[b].element = theElement; //overwrite if key is equal
            return elementToReturn;
        } else //table is full
        {
            throw new IllegalArgumentException("table is full");
        }
    }

    /**
     * output the hash table
     */
    public void output() {
        for (int i = 0; i < divisor; i++) {
            if (table[i] == null) {
                System.out.println("null");
            } else {
                System.out.println(table[i].key + "\t" + table[i].element);
            }
        }
    }

    /**
     * test method
     */
    public static void main(String[] args) {
        HashTable h = new HashTable(11);
        h.put(new Integer(80), new Integer(80));
        h.put(new Integer(40), new Integer(40));
        h.put(new Integer(65), new Integer(65));

        h.put(new Integer(14), new Integer(14));
        h.output();/*
        System.out.println();
        h.put(new Integer(58), new Integer(58));
        h.put(new Integer(24), new Integer(24));
        h.output();
      System.out.println();
      h.put(new Integer(2), new Integer(2));
      h.put(new Integer(13), new Integer(13));
      h.put(new Integer(46), new Integer(46));
     /* h.put(new Integer(16), new Integer(16));
      h.put(new Integer(7), new Integer(7));
      h.put(new Integer(21), new Integer(21));*/
 /*h.output();
      System.out.println();
     /* try {h.put(new Integer(99), new Integer(99));}
      catch (Exception e)
      {System.out.println(" No memory for 99");}
      System.out.println();*/
        // update element
        /*h.put(new Integer(7), new Integer(29));
      h.put(new Integer(7), new Integer(17));
      h.output();*/

        ArrayList<String> frases = new ArrayList<>();
        frases.add("Hogwarts es nuestro lugar seguro");
        frases.add("corred insensatos");       
        MagiciansC mago = new MagiciansC("Dumbledore", 2019);
        System.out.println("mago:" + mago.hashCode());        
        h.put(mago, frases);
        h.output();
    }
}
