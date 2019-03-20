/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generics.example;

/**
 *
 * @author arlese.rodriguezp
 */
public class GenericPair<K, V> {

    K key;
    V value;

    public GenericPair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "[" + key + ", " + value + "]";
    }

    public static void main(String[] args) {
        GenericPair<String, Double> p = new GenericPair<>("Hola", 2.5);
        System.out.println("key in lowercase: " + p.getKey().toLowerCase()); //don't need casting
        System.out.println("Value multiplied by Pi: " + (p.getValue() * Math.PI));

    }

}
