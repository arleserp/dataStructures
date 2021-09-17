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
public class FibonacciCiclos {

    private static long fibonacci(long n) {
        long fibo = 1;
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        long antant = 0;
        long ant = 1;
        for (int i = 2; i <= n; i++) {
            fibo = ant + antant;
            antant = ant;
            ant = fibo;
        }
        return fibo;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println("fibonnacci " + fibonacci(number));
    }
}
