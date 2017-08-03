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
public class Circle extends PointXY {

    private double radius;

    public Circle() {
    }

    public Circle(int x, int y, double radiusValue) {
        super(x, y);
        radius = radiusValue;
    }

    public void setRadius(double radiusValue) {
        radius = (radiusValue < 0.0 ? 0.0 : radiusValue);
    }

    public double getRadius() {
        return radius;
    }

    public double getDiameter() {
        return 2 * getRadius();
    }

    public double getCircumference() {
        return Math.PI * getDiameter();
    }

    public double getArea() {
        return Math.PI * getRadius() * getRadius();
    }

    public String getName() {
        return "Circle";
    }

    @Override
    public String toString() {
        return "Center = " + super.toString() + "; Radius = " + getRadius();
    }
}
