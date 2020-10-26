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
public class Box {

    private Object object;

    public void set(Object object) {
        this.object = object;
    }

    public Object get() {
        return object;
    }
    
    public static void main(String[] args) {
        Box b = new Box();
        b.set("Hola");
        System.out.println(b.get().toString().toUpperCase());
    
        Box c = new Box();
        c.set(2.3);
        double res = (double)c.get() + 1.0;
        System.out.println(res);
        
        Box d = new Box();
        d.set(new NotengoIdea("jum"));
        ((NotengoIdea)d.get()).responder();
    }        
}

class NotengoIdea{
    private String algo;

    public NotengoIdea(String algo) {
        this.algo = algo;
    }
    
    public void responder(){
        System.out.println("No tengo idea");
    }
}