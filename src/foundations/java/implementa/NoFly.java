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
public class NoFly implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println("I don´t fly :(");   
    }
    
}
