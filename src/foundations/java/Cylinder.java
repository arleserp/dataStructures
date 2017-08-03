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
public class Cylinder extends Circle {

    private double height;

    public Cylinder() {
    }

    public Cylinder(int x, int y, double radius, double heightValue) {
        super(x, y, radius);
        height = heightValue;
    }

    public void setHeight(double heightValue) {
        height = (heightValue < 0.0 ? 0.0 : heightValue);
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double getArea() {
        return 2 * super.getArea() + getCircumference() * getHeight();
    }

    public double getVolume() {
        return super.getArea() * getHeight();
    }

    @Override
    public String getName() {
        return "Cylinder";
    }

    @Override
    public String toString() {
        return super.toString() + "; Height = " + getHeight();
    }
}
