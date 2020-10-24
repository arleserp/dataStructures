/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generics.example;

/**
 *
 * @author Arles
 */
public class Box<T> {

    private T object;

    public void set(T object) {
        this.object = object;
    }

    public T get() {
        return object;
    }

    public static void main(String[] args) {
        Box b = new Box();
        b.set("Hola");
        System.out.println(((String) b.get()).toUpperCase());        
        
        Box<String> d = new Box<>();
        d.set("Hola");
        System.out.println(d.get().toUpperCase());
        
        Box<Integer> i = new Box<>();
        i.set(3);
        System.out.println(i.get()+1);
        
        Box<Double> c = new Box();
        c.set(2.3);
        System.out.println(c.get() + 1.0);
    }
}
