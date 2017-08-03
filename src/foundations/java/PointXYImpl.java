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
public class PointXYImpl implements ShapeInterface{

    private int x, y;

    public PointXYImpl() {
    }

    public PointXYImpl(int xValue, int yValue) {
        x = xValue;
        y = yValue;
    }

    public void setX(int xValue) {
        x = xValue;
    }

    public int getX() {
        return x;
    }

    public void setY(int yValue) {
        y = yValue;
    }

    public int getY() {
        return y;
    }

    @Override
    public double getArea() {
        return 0.0;
    }

    public double getVolume() {
        return 0.0;
    }

    @Override
    public String getName() {
        return "Point";
    }

    @Override
    public String toString() {
        return "[" + getX() + ", " + getY() + "]";
    }

}
