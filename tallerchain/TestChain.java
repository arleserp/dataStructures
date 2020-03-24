/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerlistas;

import java.util.Scanner;

/**
 *
 * @author Arles
 */
public class TestChain {

    public static void menu(Scanner sc, Chain x) {
        int opc = Integer.parseInt(sc.nextLine());

        switch (opc) {
            case 1: //test count
                Integer num = Integer.parseInt(sc.nextLine());
                //System.out.println("x:"  + x);
                System.out.println("count(" + num + ")=" + x.count(num));
                break;
            case 2: //test peek
                System.out.println("peek=" + x.peek());
                break;
            case 3: //test pop
                System.out.println("size antes:" + x.size());
                System.out.println("pop=" + x.pop());
                System.out.println("size después:" + x.size());
                break;
            case 4: //test contains
                int numc = Integer.parseInt(sc.nextLine());
                System.out.println("contains(" + numc + ")=" + x.contains(numc));
                break;
            case 5: //test sorted insert
                int data = Integer.parseInt(sc.nextLine());
                x.sortedInsert(data);
                System.out.println("sorted insert: " + x + " size: " + x.size());
                break;
            case 6: //test append
                int n = Integer.parseInt(sc.nextLine());
                int i = 0;
                Chain y = new Chain();
                while (i < n) {
                    y.add(i, sc.nextInt());
                    i++;
                }
                System.out.println("primera lista: " + x);
                System.out.println("segunda lista: " + y);
                x.append(y);
                System.out.println("Después de utilizar append");
                System.out.println("primera lista: " + x + " size: " + x.size());
                System.out.println("segunda lista: " + y + " size: " + y.size());
                break;
            case 7: //remove duplicates
                System.out.println("Lista con elementos duplicados: " + x + " size: " + x.size());
                x.removeDuplicates();
                System.out.println("Lista sin duplicados: " + x + " size: " + x.size());
                break;
            case 8:
                int to = Integer.parseInt(sc.nextLine());
                System.out.println("El ultimo indice de " + to + " es: " + x.lastIndexOf(to));
                break;
            case 9:
                String[] pals = sc.nextLine().split(" ");
                i = 0;
                Chain<String> palabras = new Chain<>();
                while (i < pals.length) {
                    palabras.add(i, pals[i]);
                    i++;
                }
                while (!palabras.isEmpty()) {
                    System.out.print(palabras.pop().toUpperCase() + " ");
                }
                break;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Chain x = new Chain();

        //carga una lista enlazada x con elementos de la entrada estándar
        int n = Integer.parseInt(sc.nextLine());
        if (n > 0) {
            String[] list = sc.nextLine().split(" ");
            int i = 0;
            while (i < n) {
                x.add(i, Integer.parseInt(list[i]));
                i++;
            }
        }
        menu(sc, x);
    }
}
