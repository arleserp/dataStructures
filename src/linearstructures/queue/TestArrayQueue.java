/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linearstructures.queue;

/**
 *
 * @author Arles
 */
public class TestArrayQueue {
    public static void main(String[] args) {
        ArrayQueue q = new ArrayQueue(3);
        q.put(new Integer(1));
        q.put(new Integer(2));
        q.put(new Integer(3));
        q.put(new Integer(4));
        while (!q.isEmpty()) {
            System.out.println("Rear element is "
                    + q.getRearElement());
            System.out.println("Front element is "
                    + q.getFrontElement());
            System.out.println("Removed the element "
                    + q.remove());
        }
    }
}
