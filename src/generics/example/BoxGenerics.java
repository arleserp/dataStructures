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
public class BoxGenerics<T> {

    private T object;

    public void set(T object) {
        this.object = object;
    }

    public T get() {
        return object;
    }

    public static void main(String[] args) {
        BoxGenerics b = new BoxGenerics();
        b.set("Hola");
        System.out.println(((String) b.get()).toUpperCase());        
        
        BoxGenerics<String> d = new BoxGenerics<>();
        d.set("Hola");
        System.out.println(d.get().toUpperCase());
        
        BoxGenerics<Integer> i = new BoxGenerics<>();
        i.set(3);
        System.out.println(i.get()+1);
        
        BoxGenerics<Double> c = new BoxGenerics();
        c.set(2.3);
        System.out.println(c.get() + 1.0);
    }
}
