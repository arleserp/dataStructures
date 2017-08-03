/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foundations.java;

/**
 *
 * @author Arles
 */
public abstract class Shape extends Object {

    public double getArea() {
        return 0.0;
    }

    public double getVolume() {
        return 0.0;
    }

    public abstract String getName();
}
