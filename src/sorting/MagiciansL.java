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
public class MagiciansL {

    public String name;
    public Integer age;

    public MagiciansL(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "name=" + name + " age=" + age;
    }

    public static void main(String[] args) {
        ArrayList<MagiciansL> magicians = new ArrayList<>();
        magicians.add(new MagiciansL("Gandalf", 65));
        magicians.add(new MagiciansL("Dumbledore", 116));
        magicians.add(new MagiciansL("Lorgia", 65));
        magicians.add(new MagiciansL("Houdini", 52));
        magicians.add(new MagiciansL("McGonagall", 65));

        System.out.println("before sort: " + magicians);        

        //Expresión lambda para ordenar un arreglo comparando por nombre.
        Collections.sort(magicians, (o1, o2) -> {
            return o1.name.compareTo(o2.name);
        });
        System.out.println("sorted ascending by name: " + magicians);

        //Expresión lambda para ordenar un arreglo comparando los magos por edad descendente.
        //si dos edades son iguales compara por nombre.
        Collections.sort(magicians, (o1, o2)->{            
            int res = (o1.age - o2.age)*-1;
            if(res == 0){
                return o1.name.compareTo(o2.name);
            }
            return res;
        });
        System.out.println("sorted descending by age:" + magicians);
        
    }
}
