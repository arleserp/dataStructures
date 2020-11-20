/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Este código define una clase que implementa la interfaz comparable se puede
 * observar como se pueden comparar dos magos por nombre (comentariado) o por
 * edad.
 *
 * @author arlese.rodriguezp
 */
public class MagiciansC implements Comparable<MagiciansC> {

    public String name;
    public int age;

    public MagiciansC(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //por edad y si son iguales las edades compara por nombre
    @Override
    public int compareTo(MagiciansC o) {
        int res = this.age - o.age; //compara por edad
        if(res == 0){ //compara por nombre
            return this.name.compareTo(o.name);
        }
        return res;
    }

    /*
    by name
    @Override
    public int compareTo(MagiciansC other) {
        return this.name.compareTo(other.name);
    }
     */
    //by age
    /*@Override
    public int compareTo(MagiciansC other) {
        //return this.age-other.age;
        if(this.age == other.age){
            return 0;//igual
        }else if(this.age > other.age){
            return 1; //mayor
        }else{
            return -1; //menor
        }
    }*/
    @Override
    public String toString() {
        return "name=" + name + " age=" + age;
    }

    public static void main(String[] args) {
        ArrayList<MagiciansC> magicians = new ArrayList<>();
        magicians.add(new MagiciansC("Gandalf", 150));
        magicians.add(new MagiciansC("McGonagall", 150));
        magicians.add(new MagiciansC("Dumbledore", 150));
        magicians.add(new MagiciansC("Lorgia", 68));
        magicians.add(new MagiciansC("Houdini", 52));
        magicians.add(new MagiciansC("Harry Potter", 22));

        System.out.println("before sort: " + magicians);
        //El ordenamiento aquí funciona porque Magician implementa Comparable
        Collections.sort(magicians); //Se llama Collections.sort para utilizar la librería de Java que ordena un ArrayList

        System.out.println("after sort: " + magicians);

    }

}
