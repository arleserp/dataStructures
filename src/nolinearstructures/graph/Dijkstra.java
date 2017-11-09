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

public class Dijkstra {

    static class Node implements Comparable<Node> {

        public int adjacent;
        public int cost;

        public Node(int ady, int c) {
            this.adjacent = ady;
            this.cost = c;
        }

        @Override
        public int compareTo(Node o) {
            if (this.cost >= o.cost) {
                return 1;
            } else {
                return -1;
            }
        }

        @Override
        public String toString() {
            return "Node{" + "adjacent=" + adjacent + ", cost=" + cost + '}';
        }
        
        
    }

    static int v, e; //v = cantidad de nodos, e = cantidad de aristas
    static int MAX = 1000; //Cantidad Máxima de Nodos
    static ArrayList<Node> ady[] = new ArrayList[MAX]; //Lista de Adyacencia del grafo
    static boolean marked[] = new boolean[MAX]; //Estructura auxiliar para marcar los grafos visitados
    static long distance[] = new long[MAX];
    static int prev[] = new int[MAX]; //Estructura auxiliar para almacenar las rutas

    //Recibe el nodo inicial s
    static void dijkstra(int s) {
        PriorityQueue<Node> pq = new PriorityQueue<Node>();
        pq.add(new Node(s, 0));//se inserta a la cola el nodo Inicial.
        distance[s] = 0;
        int actual, j, adjacent;
        long weight;
        
        while (pq.size() > 0) {
            actual = pq.peek().adjacent;
            pq.poll();
            if (!marked[actual]) {
                marked[actual] = true;
                for (j = 0; j < ady[actual].size(); j++) {
                    adjacent = ady[actual].get(j).adjacent;
                    weight = ady[actual].get(j).cost;
                    //System.out.println("xxx");
                    if (!marked[adjacent]) {
                        if (distance[adjacent] > distance[actual] + weight) {
                            distance[adjacent] = distance[actual] + weight;
                            prev[adjacent] = actual;
                            //System.out.println("ac");
                            pq.add(new Node(adjacent, (int) distance[adjacent]));
                        }
                    }
                }
            }
        }
    }

    //Retorna en un String la ruta desde s hasta t
    //Recibe el nodo destino t
    static String path(int t) {
        String r = "";
        while (prev[t] != -1) {
            r = "-" + t + r;
            t = prev[t];
        }
        if (t != -1) {
            r = t + r;
        }
        return r;
    }

    public static void main(String[] args) {
        int origen, destino, costo;
        Scanner sc = new Scanner(System.in);

        //Al iniciar cada caso de prueba
        v = sc.nextInt();
        e = sc.nextInt();
        init();

        while (e > 0) {
            origen = sc.nextInt() - 1;
            destino = sc.nextInt() - 1;
            costo = sc.nextInt();

            ady[origen].add(new Node(destino, costo));
            ady[destino].add(new Node(origen, costo));
            
            e--;
        }
        for (int i = 0; i < v; i++) {
            System.out.println("ady " + i + ":" + ady[i]);
        }
        
        dijkstra(0);
        // System.out.println("path:" + path(1));
        for (int i = 0; i < v; i++) {
            System.out.println(i + ":" + path(i));
        }

        //dfs(4);
        /*
        bfs(1);
        System.out.println("Distances from node 1");
        for (int i = 0; i < v; i++) {
            System.out.println(i + " :" + distance[i]);
        }
        
         */
 /*  for (int i = 0; i < v; i++) {
            if (!marked[i]) {
                dfs(i);
                System.out.println("");
            }
        }*/
    }

    static void init() {
        int i;
        for (i = 0; i < v; i++) {
            ady[i] = new ArrayList<>();
            distance[i] = Integer.MAX_VALUE;
            prev[i] = -1;
            marked[i] = false;
        }
    }
}
    