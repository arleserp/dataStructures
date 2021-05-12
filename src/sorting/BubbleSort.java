/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;


/**
 *
 * @author Arles
 */
public class BubbleSort {

    private static void swap(Comparable[] a, int i, int j) {
        Comparable aux = a[i];
        a[i] = a[j];
        a[j] = aux;
    }

    /**
     * bubble largest element in a[0:n-1] to right
     */
    private static void bubble(Comparable[] a, int n) {
        for (int i = 0; i < n - 1; i++) {
            if (a[i].compareTo(a[i + 1]) > 0) {
                swap(a, i, i + 1);
            }
        }
    }

    /**
     * sort the array a using the bubble sort method
     *
     * @param a array to sort
     */
    public static void bubbleSort(Comparable[] a) {
        for (int size = a.length; size > 1; size--) {
            bubble(a, size);
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
        bubbleSort(a);
        System.out.println("\nThe sorted order is");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

}
