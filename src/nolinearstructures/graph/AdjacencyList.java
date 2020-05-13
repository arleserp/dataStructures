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

public class AdjacencyList {

    static int v, e; //v = cantidad de nodos, e = cantidad de aristas
    static int MAX = 1000; //Cantidad Máxima de Nodos
    static ArrayList<Integer> ady[] = new ArrayList[MAX]; //Lista de Adyacencia del grafo
    static boolean marked[] = new boolean[MAX]; //Estructura auxiliar para marcar los grafos visitados
    static long distance[] = new long[MAX];

    //Recibe el nodo inicial s
    static void dfs(int s) {
        marked[s] = true;
        int i, next;
        System.out.print(s + ",");
        for (i = 0; i < ady[s].size(); i++) {
            next = ady[s].get(i);
            if (!marked[next]) {
                dfs(next);
            }
        }
    }

    //Recibe el nodo inicial s
    static void bfs(int s) {
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(s);
        distance[s] = 0;
        int actual, i, next;

        while (!q.isEmpty()) {
            actual = q.poll();
            System.out.println(actual + ",");
            for (i = 0; i < ady[actual].size(); i++) {
                next = ady[actual].get(i);
                if (distance[next] == -1) {
                    distance[next] = distance[actual] + 1;
                    q.add(next);
                }
            }
        }
    }

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

            ady[origen].add(destino);
            ady[destino].add(origen);
            e--;
        }
        
        /*
        mostrar el grafo
        System.out.println("entra");
        for (int i = 0; i < v; i++) {
            
            System.out.println(i + "->" + ady[i]);
        }
        */
        
        /*
        bfs(0);
        System.out.println("Distances from node 0");
        for (int i = 0; i < v; i++) {
            System.out.println(i + " :" + distance[i]);
        }
        */
        
        //dfs(0);
        
        /*for(int i=0; i < v; i++){
            if (!marked[i]) {
                dfs(i);
                System.out.println("");
            }
        }*/
    }

    static void init() {
        int i;
        for (i = 0; i < v; i++) {
            ady[i] = new ArrayList<Integer>();
            distance[i] = -1;
        }
    }
}


/*
6
5
0 1
1 2
3 4
3 5
4 5
*/