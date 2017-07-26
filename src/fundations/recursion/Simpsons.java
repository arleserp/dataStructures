/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fundations.recursion;

/**
 *
 * @author Arles
 */
public class Simpsons {

    private static int C(int n, int k) {
        if (k > n) {
            return 1;
        }
        if (k == 0 || n == k) {
            return 1;
        }
        return C(n - 1, k - 1) + C(n - 1, k);
    }

    public static void main(String[] args) {
        System.out.println("comb: " + C(4, 2));
    }

}
