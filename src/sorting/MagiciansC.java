/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author arlese.rodriguezp
 */
public class MagiciansC implements Comparable {
    public String name;
    public int age;

    public MagiciansC(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    /*
    @Override
    public int compareTo(Object t) {
        return this.name.compareTo(((MagiciansC)t).name);
    }*/
    
    //by age
    @Override
    public int compareTo(Object t) {
        MagiciansC temp = (MagiciansC)t;
        if(this.age == temp.age){
            return 0;
        }else if(this.age > temp.age){
            return 1;
        }else{
            return -1;
        }
    }

    @Override
    public String toString() {
        return "name=" + name + " age=" + age;
    }        
    
    public static void main(String[] args) {
        ArrayList<MagiciansC> magicians = new ArrayList<>();
        magicians.add(new MagiciansC("Gandalf", 2019));
        magicians.add(new MagiciansC("Dumbledore", 150));
        magicians.add(new MagiciansC("Lorgia", 68));
        magicians.add(new MagiciansC("Houdini", 52));
        magicians.add(new MagiciansC("McGonagall", 84));
        
        System.out.println("before sort: " + magicians);
        Collections.sort(magicians);
        System.out.println("after sort: " + magicians);
        
    }
    
    
}
