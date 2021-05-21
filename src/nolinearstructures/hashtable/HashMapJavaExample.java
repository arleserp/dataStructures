/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nolinearstructures.hashtable;

/**
 *
 * @author Arles
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Arles
 */
public class HashMapJavaExample {

    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<>();

        //agregar: put(llave, element);
        hm.put(105, "Natalia");
        hm.put(106, "Carlos");
        hm.put(107, "Jhoser");
        System.out.println(hm);

        System.out.println("Get 106:" + hm.get(106));
        System.out.println("Contiene 108?" + hm.containsKey(108));
        System.out.println("lista llaves: " + hm.keySet());
               
        //key: String, valores: ArrayList
        HashMap<String, ArrayList> frasesGente = new HashMap<>();
        ArrayList<String> frasesArles = new ArrayList<>();
        frasesArles.add("Ya no hay parcial :(");
        frasesArles.add("Espero que estén bien");        
        frasesGente.put("Arles", frasesArles);
                        
        System.out.println("Frases de Arles antes:" + frasesGente.get("Arles"));
        frasesGente.get("Arles").add("Nos quedan doce minutos para terminar la clase");
        System.out.println("Frases de Arles despues: " + frasesGente.get("Arles"));
        
        ArrayList<String> frasesDaniel = new ArrayList<>();
        frasesDaniel.add("no seria mas simple manejar el arraylist de una?");
        frasesGente.put("Daniel", frasesDaniel);
        System.out.println("Frases de Daniel: " + frasesGente.get("Daniel"));
        System.out.println(frasesGente);
    }

}
