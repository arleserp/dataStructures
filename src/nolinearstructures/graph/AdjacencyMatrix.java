/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nolinearstructures.graph;

/**
 *
 * @author Arles
 */
import java.util.*;

public class AdjacencyMatrix {

    static int v, e; //v = cantidad de nodos, e = cantidad de aristas
    static int MAX = 1000; //Cantidad Máxima de Nodos
    static int ady[][] = new int[MAX][MAX];

    public static void main(String[] args) {
        int origen, destino;
        Scanner sc = new Scanner(System.in);

        //Al iniciar cada caso de prueba
        v = sc.nextInt();
        e = sc.nextInt();
        init();

        while (e > 0) {
            origen = sc.nextInt();
            destino = sc.nextInt();

            ady[origen][destino] = 1;
            ady[destino][origen] = 1;
            e--;
        }
        
        int i ,j;
        for (i = 0; i < v; i++) {
            for (j = 0; j < v; j++) {
                System.out.print(ady[i][j] + "\t");
            }
            System.out.println("");
        }
    }

    static void init() {
        int i, j;
        for (i = 0; i < v; i++) {
            for (j = 0; j < v; j++) {
                ady[i][j] = 0;
            }
        }
    }
}
