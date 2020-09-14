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
import java.text.DecimalFormat;

public class InterfaceTest {

    public static void main(String args[]) {
        DecimalFormat twoDigits = new DecimalFormat("0.00");
        ShapeInterface a[] = {
            new PointXYImpl(7, 11),
            new PointXYImpl(3, 5),
            new PointXYImpl(7, 4),
            new Duck(),
        };

        for(int i = 0; i < a.length; i++) {
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

