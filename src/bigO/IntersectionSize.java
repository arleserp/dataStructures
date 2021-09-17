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
public class IntersectionSize {

    //O(n*m) donde n es es numero de elementos de A,
    // y m es el numero de elementos de B
    static int intersectionSize(Object[] A, Object[] B) {
        int count = 0;
        for (Object a : A) {
            for (Object b : B) {
                if(a.equals(b)){
                    count++;
                }
            }
        }
        return count;
    }
    
    public static void main(String[] args) {
        Integer[] A = {1, 2, 3, 4, 5, 7};
        Integer[] B = { 12, 3, 15};
        System.out.println(intersectionSize(A, B));
    }
}
