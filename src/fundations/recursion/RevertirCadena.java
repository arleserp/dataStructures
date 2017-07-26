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
public class RevertirCadena {
    
    private static String revertCadena(String in){
        if(in.length() == 0){
            return in;
        }
        return in.substring(in.length()-1)+revertCadena(in.substring(0, in.length()-1));
    }
           
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cad = sc.nextLine();
        
        System.out.println("inv:" + revertCadena(cad));
    }
    
}
