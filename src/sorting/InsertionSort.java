/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

import static sorting.BubbleSort.bubbleSort;

/**
 *
 * @author Arles
 */
public class InsertionSort {

    public static void insertionSort(Comparable[] a) {
        for (int i = 1; i < a.length; i++) { // insert a[i] into a[0:i-1]
            Comparable t = a[i];
            // find proper place for t
            int j;
            for (j = i - 1; j >= 0 && t.compareTo(a[j]) < 0; j--) {
                a[j + 1] = a[j];
            }
            a[j + 1] = t; // insert t = original a[i]
        }
    }

    public static void main(String[] args) {
        Integer[] a = {new Integer(6), new Integer(5),
            new Integer(8), new Integer(4),
            new Integer(3), new Integer(1)};
        System.out.println("The elements are");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        insertionSort(a);
        System.out.println("\nThe sorted order is");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
