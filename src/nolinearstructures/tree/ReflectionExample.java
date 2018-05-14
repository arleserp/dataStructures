/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nolinearstructures.tree;

import java.lang.reflect.Method;
import java.util.ArrayList;

/**
 * Reflection example: The purpose of this class is to have a
 * simpler example than the binary tree class.
 * @author Arles
 */
public class ReflectionExample {

    ArrayList<Integer> numbers;
    static Method theSums;    // method to sum array Elements
    static Method thePrint;   // method to print array Elements
    
    // Define arguments to call methods
    static Object[] visitArgs = new Object[1];
    
    // define parameter type of visit method
    static Class[] paramType = {Integer.class};
    
    //to use in the method theSums
    static int sum = 0;

    // initialize the possible call to methods
    static {
        try {
            Class lbt = ReflectionExample.class;
            thePrint = lbt.getMethod("output", paramType);
            theSums = lbt.getMethod("sum", paramType);
        } catch (Exception e) {
        }
        // exception not possible
    }

    // the output method to call
    public static void output(Integer n) {
        System.out.print(n + ",");
    }
    
    //the sum method to call
    public static void sum(Integer n){
        sum+=n;
    }
    
    //class constructor
    public ReflectionExample() {
        numbers = new ArrayList<>();
    }

    // visit each Integer in number and apply method
    public void recorrer(Method m) {
        for (Integer i : numbers) {            
            applyMethod(i, m);
        }
    }

    /**
     * Apply method m on integer n
     */
    static void applyMethod(Integer n, Method m) {
        visitArgs[0] = n;
        try {
            //call the method
            m.invoke(null, visitArgs);
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
    
    private void print() {
        recorrer(thePrint);
    }
    
    private void sum() {
        recorrer(theSums);
    }
    
    //Add element to numbers
    private void add(int i) {
        numbers.add(i);
    }
    
    public static void main(String[] args) {
        ReflectionExample x = new ReflectionExample();
        x.add(1);
        x.add(2);
        x.add(3);
        x.add(4);
        
        x.print();
        System.out.println("");   
        x.sum();
        System.out.println("the sum is: " + sum);
        
    }


}


