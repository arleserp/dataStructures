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
public class NaturalRecursiveQuickSort {

    private static void quicksort(Comparable[] array, int left, int right) {
        if (left >= right) {
            return;
        }
        Comparable pivot = array[(left + right) / 2];
        int index = partition(array, left, right, pivot);
        quicksort(array, left, index - 1);
        quicksort(array, index, right);
    }

    public static void quicksort(Comparable[] array) {
        quicksort(array, 0, array.length - 1);

    }

    private static void swap(Comparable[] a, int j, int size) {
        Comparable aux = a[j];
        a[j] = a[size];
        a[size] = aux;
    }

    private static int partition(Comparable[] array, int left, int right, Comparable pivot) {
        while (left <= right) {
            while (array[left].compareTo(pivot) < 0) {
                left++;
            }
            while (array[right].compareTo(pivot) > 0) {
                right--;
            }
            if (left <= right) {
                swap(array, left, right);
                left++;
                right--;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        Integer[] a = {new Integer(6), new Integer(5),
            new Integer(8), new Integer(4),
            new Integer(3), new Integer(1)};
        System.out.println("The elements are");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        quicksort(a);
        System.out.println("\nThe sorted order is");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

}
