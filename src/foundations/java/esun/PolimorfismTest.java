/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foundations.java.esun;

import java.util.ArrayList;

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
        Shape p = new PointXY(7, 11);
        Shape c = new Circle(22, 8, 3.5);
        Shape k = null;
        Shape cil = new Cylinder(20, 30, 3.3, 10.75);

        Shape[] figuras = {p, c, k, cil};

        System.out.println("------ print all ------------");
        printAll(figuras);

        System.out.println("----- for each Arrays -----");
        for (Shape fig : figuras) {
            if (fig != null) {
                System.out.println(fig.getName() + "," + fig);
            }
        }
        System.out.println("-----for each ArrayList--------");
        ArrayList<Shape> figurasArrayList = new ArrayList<>();
        figurasArrayList.add(c);
        figurasArrayList.add(cil);
        figurasArrayList.add(p);
        figurasArrayList.add(p);
        figurasArrayList.add(cil);

        for (Shape f : figurasArrayList) {
            System.out.println(f.getName() + "," + f);
        }
    }
}
