/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nolinearstructures.hashtable;

import java.util.ArrayList;
import java.util.HashMap;
import sorting.MagiciansC;

/**
 *
 * @author Ingenieria
 */
public class JavaHashMap {
    public static void main(String[] args) {
        HashMap<MagiciansC, ArrayList<String>> libroDelMago = new HashMap<>();
        MagiciansC dumbledore = new MagiciansC("Dumbledore", 116);
        MagiciansC gandalf = new MagiciansC("Gandalf", 2019);
        MagiciansC hermione = new MagiciansC("Hermione", 35);
        MagiciansC malefica = new MagiciansC("Malefica", 44);
        
        ArrayList<String> frasesDumb = new ArrayList<>();
        frasesDumb.add("Hogwarts es un lugar seguro");
        frasesDumb.add("Run ron!");
        libroDelMago.put(dumbledore, frasesDumb);
        
        ArrayList<String> frasesG = new ArrayList<>();
        frasesG.add("Corran Insensatos");
        frasesG.add("No es importante saber cuánto tiempo queda,"
                + " sino qué hacer con el tiempo que se te concede.");        
        libroDelMago.put(gandalf, frasesG);
        System.out.println("inicial: " + libroDelMago);
        
        
        if(!libroDelMago.containsKey(malefica)){
            libroDelMago.put(malefica, new ArrayList<String>());
            System.out.println("inicial con malefica sin frases " + libroDelMago);
        }
        
        libroDelMago.get(malefica).add("Tú no eres un rey para mí.");
        System.out.println("despues de poner frase" + libroDelMago);                                
        
    }
}
