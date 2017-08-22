/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linearstructures.list;

/**
 *
 * @author Arles
 */
public class TestCircular {

    public static void main(String[] args) {
        CircularWithHeader x = new CircularWithHeader();
        for (int i = 0; i < 10; i++) {
            x.add(i, new Integer(i));
        }

        System.out.println("List=" + x);

        System.out.println("index of " + 232 + ":" + x.indexOf(232));
        
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " is element "
                    + x.indexOf(new Integer(i)));
        }
        
        for (int i = 0; i < 10; i++) {
            x.remove(0);
        }
        System.out.println("List=" + x);
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " is element "
                    + x.indexOf(new Integer(i)));
        }
    }
}
