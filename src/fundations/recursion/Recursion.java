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
public class Recursion {

    
    
    private static String invertirCadena(String z, int len){
        if(len == 1){
            return String.valueOf(z.charAt(0));
        }
        return z.charAt(len-1)+invertirCadena(z, len-1);    
    }
    
    private static int factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        System.out.println("fact:" + factorial(5));
        System.out.println("inv:" + invertirCadena("hola", 4));
    }
}
