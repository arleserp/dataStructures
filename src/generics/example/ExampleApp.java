/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generics.example;

import java.util.ArrayList;

/**
 *
 * @author Arles
 */
public class ExampleApp {
    public static void main(String[] args) {
        ArrayList<String> palabras = new ArrayList<>();
        palabras.add("hola");
        palabras.add("a");
        palabras.add("todos");
        
        for (String palabra: palabras) {
            System.out.println(palabra.toUpperCase());
        }
        
    }
}
