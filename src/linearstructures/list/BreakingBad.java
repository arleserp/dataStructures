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
public class BreakingBad {
    public static void main(String[] args) {
        Amigo gus = new Amigo("Gus", null);
        Amigo jane = new Amigo("Jane", gus);
        Amigo saul = new Amigo("Saul", jane);
        Amigo walter = new Amigo("Walter", saul);
        System.out.println(walter.amigo);
    }
}
