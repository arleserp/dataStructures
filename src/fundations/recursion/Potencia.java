/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fundations.recursion;

/**
 *
 * @author arlese.rodriguezp
 */
public class Potencia {

    private static double potencia(double b, int n) {
        if (n == 0) {
            return 1;
        }
        return b*potencia(b, n - 1);
    }

    
    public static void main(String[] args) {
        System.out.println("potencia:" + potencia(2, 10));
    }
}
