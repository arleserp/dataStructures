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
public class QuickSort {
    // data member

    static Comparable[] a; // array of elements to sort

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

    private static void quickSort(int leftEnd, int rightEnd) {
        if (leftEnd >= rightEnd) {
            return;
        }
        int leftCursor = leftEnd, // left-to-right cursor
                rightCursor = rightEnd + 1; // right-to-left cursor
        Comparable pivot = a[leftEnd];
        // swap elements >= pivot on left side
        // with elements <= pivot on right side
        while (true) {
            do { // find >= element on left side
                leftCursor++;
            } while (a[leftCursor].compareTo(pivot) < 0);
            do { // find <= element on right side
                rightCursor--;
            } while (a[rightCursor].compareTo(pivot) > 0);
            if (leftCursor >= rightCursor) {
                break;
            }
            swap(a, leftCursor, rightCursor);
        }
        a[leftEnd] = a[rightCursor];
        a[rightCursor] = pivot;
        quickSort(leftEnd, rightCursor - 1);
        quickSort(rightCursor + 1, rightEnd);
    }

    public static void quickSort(Comparable[] a) {
        QuickSort.a = a;
        if (a.length <= 1) {
            return;
        }
        // move largest element to right end
        swap(a, a.length - 1, maxPos(a, a.length - 1));
        quickSort(0, a.length - 2);
    }
    
    public static void main(String[] args) {
        Integer[] a = {new Integer(6), new Integer(5),
            new Integer(8), new Integer(4),
            new Integer(3), new Integer(1)};
        System.out.println("The elements are");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        quickSort(a);
        System.out.println("\nThe sorted order is");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
