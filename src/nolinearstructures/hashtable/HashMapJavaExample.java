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
        HashMap<String, Integer> hm = new HashMap();
        
        //agregar: put(llave, element);
        hm.put("Caracol", 1006);
        hm.put("RCN", 1008);
        hm.put("Señal Colombia", 1010);
        System.out.println(hm);

        //retorna si la llave está en el diccionario
        if (hm.containsKey("Caracol")) {
            System.out.println("El valor caracol contiene: " + hm.get("Caracol"));
        }
        
        if(!hm.containsKey("Arles")){
            System.out.println("El diccionario no contiene la llave Arles");
        }
        
        //key: String, valores: ArrayList
        HashMap<String, ArrayList> frasesGente = new HashMap<>();
        ArrayList<String> frasesArles = new ArrayList<>();
        frasesArles.add("El miercoles es el parcial");
        frasesArles.add("hoy se vence el trabajo con bases de datos");
        frasesArles.add("hooy se vence la tarea de ordenamientos");
        frasesGente.put("Arles", frasesArles);
        
        System.out.println("antes:" + frasesGente.get("Arles"));
        frasesGente.get("Arles").add("Nos quedan dos minutos para terminar la clase");
        System.out.println("despues: " + frasesGente.get("Arles"));

    }

}
