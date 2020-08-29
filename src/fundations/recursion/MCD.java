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
public class MCD {
    
    public static int mcd(int p, int q){
        if(p % q == 0){ //if(p == 0)
            return q;
        }else{
            return mcd(q, p % q);
        }    
    }
    
    public static void main(String[] args) {
        System.out.println(mcd(24,18));
    }
    
}
