/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linearstructures.list;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Arles
 */
public class LinkedListJavaExample {

    public static void main(String[] args) {
        LinkedList L = new LinkedList();
        L.add(5);
        L.add(2);
        L.add(4);
        L.add(8);
        L.add(9);
        System.out.println(L);
        System.out.println("Cantidad de elementos " + L.size());
        System.out.println("Esta vacía " + L.isEmpty());
        System.out.println("Posicion del elemento 6: " + L.indexOf(6));
        System.out.println("Posicion del elemento 4: " + L.indexOf(4));
        L.remove(2);
        System.out.println("L borrando pos 2" + L);
        
        while(!L.isEmpty()){
            L.remove(0);
            System.out.println(L);
        }
        System.out.println("Esta vacía " + L.isEmpty());
    }
}
