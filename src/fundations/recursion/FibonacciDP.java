/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fundations.recursion;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Arles
 */
public class FibonacciDP {
    static long[] dp = new long[51]; //1 crear el arreglo dp
    
    static void init(){ //2 crear metodo init
        Arrays.fill(dp, -1);
        /*for (int i = 0; i < dp.length; i++) {
            dp[i] = -1;
        }*/
    }
    
    private static long fibonacci(int n) {
        if(dp[n] != -1){ //3 cargar las respuestas ya memorizadas
            return dp[n];
        }
        if (n == 0) {
            return dp[n] = 0; //4. guardar dato memo
        }
        if (n == 1) {
            return dp[n] = 1; //guardar dato memo
        }
        return dp[n] = fibonacci(n - 1) + fibonacci(n - 2); //guardar dato memo
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        init();
        System.out.println("fibonnacci " + fibonacci(number));
    }
}
