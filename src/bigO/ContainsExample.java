/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bigO;

/**
 *
 * @author Arles
 */
public class ContainsExample {

    //O(n) => donde n, es el número de elementos de array. 
    public static boolean contains(Object[] array, Object x) {
        for(Object element: array){
            if(element.equals(x)){
                return true;
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
        String[] palabras = new String[4];
        palabras[0] = "Buenas";
        palabras[1] = "Noches";
        palabras[2] = "Gr";
        palabras[3] = "51";
        System.out.println(contains(palabras, "Chau"));
        
        /**/
        Integer[] numeros = new Integer[5];
        for (int i = 0; i < 5; i++) {
            numeros[i] = i;
        }
        System.out.println(contains(numeros, 0));
    }
}
