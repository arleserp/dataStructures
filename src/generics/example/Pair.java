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
public class Pair {
    Object key;
    Object value;

    public Pair(Object key, Object value) {
        this.key = key;
        this.value = value;
    }

    public Object getKey() {
        return key;
    }

    public void setKey(Object key) {
        this.key = key;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "[" + key + ", " + value + ']';
    }
    
    
    public static void main(String[] args) {
        Pair p = new Pair("HOLA", 2.5);
        System.out.println("key in lowercase: "+ ((String)p.getKey()).toLowerCase());
        System.out.println("Value multiplied by Pi: "+ ((Double)p.getValue())*Math.PI);
        
    }
    
    
}
