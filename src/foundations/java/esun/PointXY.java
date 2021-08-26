/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foundations.java.esun;

/**
 *
 * @author Arles
 */
public class PointXY extends Shape {
    private int x;
    private int y;

    public PointXY() {
    }

    public PointXY(int xValue, int yValue) {
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
    public String toString() {
        return "[" + getX() + ", " + getY() + "]";
    }


    
    public static void main(String[] args) {
        PointXY k = new PointXY(2, 3);
        System.out.println(k.getName());
        System.out.println(k.getArea());
        System.out.println(k.getVolume());
        System.out.println(k);
    }

    @Override
    public String getName() {
        return "Point";
    }
}

