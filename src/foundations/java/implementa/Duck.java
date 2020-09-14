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
public class Duck implements ShapeInterface, SayHelloInterface {

    @Override
    public double getArea() {
        return 50;
    }

    @Override
    public double getVolume() {
        return 100.0;
    }

    @Override
    public String getName() {
        return "Patito";
    }

    @Override
    public String toString() {
        return "Patito";
    }

    @Override
    public void sayHello() {
        System.out.println("Quack Quack");
    }    
}
