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
public class PrintPairs {
    
    //O(n^2), donde n es la cantidad de elementos que tiene array
    public static void printPairs(Object[] array){
        for(Object x: array){
            for (Object y: array) {
                System.out.println("("+x+","+y+")");
            }
        }
    }
    
    public static void main(String[] args) {
        Integer[] nums = new Integer[3];
        nums[0] = 1;
        nums[1] = 2;
        nums[2] = 5;
        printPairs(nums);
    }
 }
