/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linearstructures.stack;

/**
 *
 * @author arlese.rodriguezp
 */
public class RoutingProblem {

    public static void main(String[] args) {
        int[] net = {1, 2, 3, 4, 4, 2, 3, 5, 5, 1};
        DerivedLinkedStack s = new DerivedLinkedStack();
        
        for (int i = 0; i < net.length; i++){
            if(!s.empty() && s.peek().equals(net[i])){
                s.pop();
            }else{
                s.push(net[i]);
            }                   
        }   
        
        if(s.empty()){
            System.out.println("network routable");        
        }else{
            System.out.println("network not routable");
        }
    }

}
