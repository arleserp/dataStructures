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
class Wrapper {

    public Object obj;
}

public class TestSwap3 {

    public static void swap(Wrapper x, Wrapper y) {
        Object temp = x.obj;
        x.obj = y.obj;
        y.obj = temp;
    }

    public static void main(String[] args) {
        Wrapper a = new Wrapper();
        a.obj = 4;
        Wrapper b = new Wrapper();
        b.obj = 5;
        swap(a, b);
        System.out.println("a=" + a.obj);
        System.out.println("b=" + b.obj);
    }

}
