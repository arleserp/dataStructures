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
public class SelectionSort {

    public static void selectionSort(Comparable[] a) {
        for (int size = a.length; size > 1; size--) {
            int j = maxPos(a, size - 1);
            swap(a, j, size - 1);
        }

    }

    private static int maxPos(Comparable[] a, int size) {
        int maxPos = 0;
        for (int j = 1; j < size; j++) {
            if (a[j].compareTo(a[maxPos]) > 0) {
                maxPos = j;
            }
        }
        return maxPos;
    }

    private static void swap(Comparable[] a, int j, int size) {
        Comparable aux = a[j];
        a[j] = a[size];
        a[size] = aux;
    }

    public static void main(String[] args) {
        Integer[] a = {new Integer(6), new Integer(5),
            new Integer(8), new Integer(4),
            new Integer(3), new Integer(1)};
        System.out.println("The elements are");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        selectionSort(a);
        System.out.println("\nThe sorted order is");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

}
