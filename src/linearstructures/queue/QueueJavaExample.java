/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linearstructures.queue;

import java.util.Deque;
import java.util.LinkedList;

/**
 *
 * @author Arles
 */
public class QueueJavaExample {

    public static void main(String[] args) {
        Deque q = new LinkedList();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        while (!q.isEmpty()) {
            System.out.println("Rear element is "
                    + q.getLast());
            System.out.println("Front element is "
                    + q.getFirst());
            System.out.println("Removed the element "
                    + q.remove());
        }

    }

}
