/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilities;

import java.lang.reflect.Array;

/**
 *
 * @author Arles
 */
public class ChangeArrayLength {
    
    // full array a is to be copied into new array
    public static Object[] changeLength1D(Object[] a,
            int newLength) {
        return changeLength1D(a, a.length, newLength);
    }

    public static Object[] changeLength1D(Object[] a,
            int n, int newLength) {
        // make sure new length is adequate
        if (n > newLength) {
            throw new IllegalArgumentException("new length is too small");
        }
        // allocate a new array of desired length and same type
        Object[] newArray = (Object[]) Array.newInstance(a.getClass().getComponentType(), newLength);
        // copy from old space to new space
        System.arraycopy(a, 0, newArray, 0, n);
        return newArray;
    }

}
