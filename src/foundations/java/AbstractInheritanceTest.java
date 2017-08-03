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
import java.text.DecimalFormat;

public class AbstractInheritanceTest {

    public static void main(String args[]) {
        DecimalFormat twoDigits = new DecimalFormat("0.00");
        Shape a[] = {
            new PointXY(7, 11),
            new Circle(22, 8, 3.5),
            new Cylinder(20, 30, 3.3, 10.75)};
        
        for (int i = 0; i < a.length; i++) {
            System.out.println(
                    a[i].getName() + ": "
                    + a[i].toString() + "\nArea="
                    + twoDigits.format(a[i].getArea())
                    + "\nVolume = "
                    + twoDigits.format(a[i].getVolume()));
            System.out.println();
        }
    }
}
