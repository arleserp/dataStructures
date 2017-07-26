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
public class Interes {

    private static double interes(double m, double i, int n) {
        if (n == 0) {
            return m;
        }
        return (i + 1) * interes(m, i, n - 1);
    }

    public static void main(String[] args) {
        System.out.println("valor a pagar" + interes(1000000, 0.05, 12));
    }
}
