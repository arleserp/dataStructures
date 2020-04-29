/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author stive
 */
public class Sort {

    public static void main(String[] args) {
        int numeros[] = {4, 3, 2, 4, 2, 1, 3, 123, 13, 123, 123, 235, 456, 34, 234};

        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println("");
        Arrays.sort(numeros);

        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println("");

        ArrayList<Estudiantes> estudiantes = new ArrayList<>();
        estudiantes.add(new Estudiantes("stiven", 22, 2.2f, "1", false));
        estudiantes.add(new Estudiantes("arles", 22, 4.2f, "4", true));
        estudiantes.add(new Estudiantes("daniel", 15, 5.0f, "5", false));
        estudiantes.add(new Estudiantes("daniela", 15, 5.0f, "3", true));
        estudiantes.add(new Estudiantes("maria", 15, 3.5f, "2", true));

        for (Estudiantes estudiante : estudiantes) {
            System.out.println(estudiante);
        }
        System.out.println("ordenada por edad y nombre");
        Collections.sort(estudiantes);
        for (Estudiantes estudiante : estudiantes) {
            System.out.println(estudiante);
        }
        System.out.println("orden por codigo");
        Collections.sort(estudiantes, (t, t1) -> {
            int compare = 0;
            compare = t.codigo.compareTo(t1.codigo);
            return compare;
        });
        for (Estudiantes estudiante : estudiantes) {
            System.out.println(estudiante);
        }
        System.out.println("orden por promedio, edad, codigo, nombre");
        Collections.sort(estudiantes, (estudiante1, estudiante2) -> {
            int compare = 0;
            //equivalentes
            compare = (int) (estudiante1.promedio.compareTo(estudiante2.promedio)) * -1;
            compare = (int) (estudiante1.promedio - estudiante2.promedio) * -1;
            if (compare == 0) {
                compare = estudiante1.edad - estudiante2.edad;
                if (compare == 0) {
                    compare = estudiante1.nombre.compareTo(estudiante2.nombre);
                    if (compare == 0) {
                        compare = estudiante1.codigo.compareTo(estudiante2.codigo);
                    }
                }
            }
            return compare;
        });
        for (Estudiantes estudiante : estudiantes) {
            System.out.println(estudiante);
        }

    }

}

class Estudiantes implements Comparable<Estudiantes> {

    String nombre;
    Integer edad;
    Float promedio;
    String codigo;
    boolean estaActivo;

    public Estudiantes(String nombre, Integer edad, Float promedio, String codigo, boolean estaActivo) {
        this.nombre = nombre;
        this.edad = edad;
        this.promedio = promedio;
        this.codigo = codigo;
        this.estaActivo = estaActivo;
    }

    @Override
    public String toString() {
        return "Estudiantes{" + "nombre=" + nombre + ", edad=" + edad + ", promedio=" + promedio + ", codigo=" + codigo + ", estaActivo=" + estaActivo + '}';
    }

    @Override
    public int compareTo(Estudiantes otro) {
        int compare = 0;
        if (this.estaActivo && otro.estaActivo) {
            compare = 0;
        }
        if (this.estaActivo && !otro.estaActivo) {
            compare = 1;
        }
        if (!this.estaActivo && otro.estaActivo) {
            compare = -1;
        }
//        compare = (this.edad - otro.edad) * -1;
//        compare = otro.edad - this.edad;
//        if (compare == 0) {
//            compare = this.nombre.compareTo(otro.nombre);
//        }
        //compare 0 son iguales
        //compare - this es menor que otro
        //compare + this es mayor que otro
        return compare;
    }
}
