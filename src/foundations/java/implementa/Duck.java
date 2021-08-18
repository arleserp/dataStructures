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
public class Duck {
    private String name;
    private FlyBehavior flybehavior;

    public Duck(String name, FlyBehavior flybehavior) {
        this.name = name;
        this.flybehavior = flybehavior;
    }

    public String getName() {
        return name;
    }

    public void setFlybehavior(FlyBehavior flybehavior) {
        this.flybehavior = flybehavior;
    }
            
    public void fly(){
        flybehavior.fly();
    }

    public FlyBehavior getFlybehavior() {
        return flybehavior;
    }
        
        
}
