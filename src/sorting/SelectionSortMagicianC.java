/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sorting;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Arles
 */
public class SelectionSortMagicianC {
    public static void main(String[] args) {
        ArrayList<MagiciansC> magicians = new ArrayList<>();
        magicians.add(new MagiciansC("Gandalf", 2019));
        magicians.add(new MagiciansC("Dumbledore", 150));
        magicians.add(new MagiciansC("Lorgia", 68));
        magicians.add(new MagiciansC("Lorgia", 84));
        magicians.add(new MagiciansC("Houdini", 52));
        magicians.add(new MagiciansC("McGonagall", 84));
        
        // Las siguientes dos líneas convierten un ArrayList<MagiciansCCallRecursiveMerge> en MagiciansCCallRecursiveMerge[]
        MagiciansC[] magiciansArray = new MagiciansC[magicians.size()];
        magiciansArray = magicians.toArray(magiciansArray);
        
        //Aqui ya puedo llamar nuestro recursiveMergeSort        
        System.out.println("before sort: " + magicians);
        SelectionSort.selectionSort((Comparable[])magiciansArray);
        System.out.println("after sort: " + Arrays.asList(magiciansArray));
    }
}
