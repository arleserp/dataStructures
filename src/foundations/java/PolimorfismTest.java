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
public class PolimorfismTest {

    public static double totalArea(Shape[] arr) {
        double total = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                total += arr[i].getArea();
            }
        }
        return total;
    }

    public static void printAll(Shape[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                System.out.println(arr[i].getName() + ": "
                        + arr[i].toString() + "\nArea="
                        + arr[i].getArea() + "\nVolume = "
                        + arr[i].getVolume()
                        + "\n");
            }
        }
    }


    public static void main(String args[]) {
        Shape[] a = {new PointXY(7, 11),
            new Circle(22, 8, 3.5), null,
            new Cylinder(20, 30, 3.3, 10.75)};
        printAll(a);
        System.out.println("Total area=" + totalArea(a));
    }
}
