/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foundations.java.implementa;

/**
 *
 * @author Arles
 */
public interface DefaultTeleport {
    default void teleport(String place){
        System.out.println("I can teleport to " + place);    
    }
}
