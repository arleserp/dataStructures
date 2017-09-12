/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linearstructures.list;

/**
 * Este código define cada nodo en una lista enlazada
 * El nodo tiene un elemento que hace referencia al objeto que 
 * se va a almacenar y adicionalmente tiene una referencia al siguiente nodo
 * conocido como el siguiente (next).
 * @author Arles
 */
public class ChainNode {

    public Object element;
    public ChainNode next;
    
    //package visible constructors
    public ChainNode() {
    }

    public ChainNode(Object element) {
        this.element = element;
    }

    public ChainNode(Object element, ChainNode next) {
        this.element = element;
        this.next = next;
    }
}