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
public class RecursiveMergeSort {

    public static void mergesort(Comparable[] array) {
        mergesort(array, new Comparable[array.length], 0, array.length - 1);
    }

    private static void mergesort(Comparable[] array, Comparable[] temp, int leftStart, int rightEnd) {
        if (leftStart >= rightEnd) {
            return;
        }
        int middle = (leftStart + rightEnd) / 2;
        mergesort(array, temp, leftStart, middle);
        mergesort(array, temp, middle + 1, rightEnd);
        mergeHalves(array, temp, leftStart, rightEnd);
    }

    private static void mergeHalves(Comparable[] array, Comparable[] temp, int leftStart, int rightEnd) {
        int leftEnd = (rightEnd + leftStart) / 2;
        int rightStart = leftEnd + 1;
        int size = rightEnd - leftStart + 1;

        int left = leftStart;
        int right = rightStart;
        int index = leftStart;

        while (left <= leftEnd && right <= rightEnd) {
            if (array[left].compareTo(array[right]) == -1 || array[left].compareTo(array[right]) == 0) {
                temp[index] = array[left];
                left++;
            } else {
                temp[index] = array[right];
                right++;
            }
            index++;
        }

        // take care of leftovers
        if (left > leftEnd) {
            System.arraycopy(array, right, temp, index, rightEnd - right + 1);
            /*for (int q = right; q <=  rightEnd; q++) {
                temp[index++] = array[q];
            }*/
        } else {
            System.arraycopy(array, left, temp, index, leftEnd - left + 1);
            /*for (int q = left ; q <= leftEnd; q++) {
                temp[index++] = array[q];
            }*/
        }

        System.arraycopy(temp, leftStart, array, leftStart, size);
    }

    public static void main(String[] args) {
        Integer[] a = {new Integer(6), new Integer(5),
            new Integer(8), new Integer(4),
            new Integer(3), new Integer(1)};
        System.out.println("The elements are");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        mergesort(a);
        System.out.println("\nThe sorted order is");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

}
