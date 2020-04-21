/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linearstructures.queue;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
/**
 *
 * @author usuario
 */
public class TestQueueJava {
    public static void main(String[] args) {
        Deque q =  new LinkedList(); //usamos deque por getFirst y getLast
        q.add("A");
        q.add("B");
        q.add("C");
        q.add("D");
        System.out.println(q); // A B C D
        
        System.out.println("First Element:" + q.getFirst());
        System.out.println("Last Element:" + q.getLast());
        
        int rotaciones = 3;
        for (int i = 0; i < rotaciones; i++) {
            q.add(q.remove()); //operacion mágica :v
        }
        
        System.out.println(q);
        
        //Ciclo tradicional
        while(!q.isEmpty()){
            System.out.println("atiende a " + q.remove());
        }
    }
}
