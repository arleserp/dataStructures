/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fundations.recursion;

import java.util.Scanner;

/**
 *
 * @author Arles
 */
public class Tribonacci {

    private static double tribonacci(double n) {
        System.out.printf("tribonnaci(%f) = ", n);
        if (n == 0) {
            System.out.println("0");
            return 0;
        }
        if (n == 1) {
            System.out.println("1");
            return 1;
        }
        if (n == 2) {
            System.out.println("1");
            return 1;
        }
        System.out.printf("tribonnaci(%f) + tribonnaci(%f) + tribonnaci(%f) \n", (n - 1), (n - 2), (n - 3));
        return tribonacci(n - 1) + tribonacci(n - 2) + tribonacci(n - 3);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println("tribonnacci " + tribonacci(number));
    }
}
