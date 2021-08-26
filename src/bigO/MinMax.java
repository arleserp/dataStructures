/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bigO;

/**
 *
 * @author Arles
 */
public class MinMax {

    // O(a) donde a es el numero de elementos de array
    public static void minMax1(Integer[] array) {
        Integer min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (Integer e : array) {
            min = Math.min(e, min);
        }
        for (Integer e : array) {
            max = Math.max(e, max);
        }
        System.out.println("min: " + min + ", max: " + max);
    }

    
    // O(a) donde a es el numero de elementos de array
    public static void minMax2(Integer[] array) {
        Integer min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (Integer e : array) {
            min = Math.min(e, min);
            max = Math.max(e, max);
        }
        System.out.println("min: " + min + ", max: " + max);
    }
    
    
    public static void main(String[] args) {
        Integer[] nums = new Integer[3];
        nums[0] = 1;
        nums[1] = 2;
        nums[2] = 5;
        minMax1(nums);
        minMax2(nums);
    }
}
