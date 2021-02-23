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
public class RaizFor {
    static double raizFor(double n){
        for (double i = 0; i <= n; i+=1e-8) {
            if(Math.abs(i*i-n) < 1e-8){
                return i;
            }
        }
        return Double.NaN;
    }
    
    public static void main(String[] args) {
        System.out.println(raizFor(2.0));
    }
    
}
