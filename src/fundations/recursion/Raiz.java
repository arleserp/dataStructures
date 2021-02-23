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
public class Raiz {

    private static double buscar(double n, double st, double end) {
        //System.out.println(st + "-" + end);    
        double mid = (st + end) / 2;
        if (Math.abs(mid * mid - n) < 1e-12) {
            return mid;
        } else if (mid * mid > n) {
            return buscar(n, st, mid);
        } else {
            return buscar(n, mid, end);
        }
    }

    public static double raiz(double n) {
        return buscar(n, 0, n);
    }

    public static void main(String[] args) {
        System.out.println(raiz(3.0));
    }
}

