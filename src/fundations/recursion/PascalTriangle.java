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
public class PascalTriangle {
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
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(C(i,j) + " ");
            }
            System.out.println();
        }
    }
}
