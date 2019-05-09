/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Este código muestra como llamar el algoritmo de RecursiveMerge con una clase creada por el 
 * programador
 * @author arlese.rodriguezp
 */
public class MagiciansCCallRecursiveMerge {
    
    public static void main(String[] args) {
        ArrayList<MagiciansC> magicians = new ArrayList<>();
        magicians.add(new MagiciansC("Gandalf", 2019));
        magicians.add(new MagiciansC("Dumbledore", 150));
        magicians.add(new MagiciansC("Lorgia", 68));
        magicians.add(new MagiciansC("Houdini", 52));
        magicians.add(new MagiciansC("McGonagall", 84));
        
        // Las siguientes dos líneas convierten un ArrayList<MagiciansCCallRecursiveMerge> en MagiciansCCallRecursiveMerge[]
        MagiciansC[] magiciansArray = new MagiciansC[magicians.size()];
        magiciansArray = magicians.toArray(magiciansArray);
        
        //Aqui ya puedo llamar nuestro recursiveMergeSort        
        System.out.println("before sort: " + magicians);
        RecursiveMergeSort.mergesort((Comparable[])magiciansArray);
        System.out.println("after sort: " + magicians);
        
    }        
}
