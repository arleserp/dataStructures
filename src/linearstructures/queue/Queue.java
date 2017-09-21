/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linearstructures.queue;

/**
 *
 * @author Arles
 */
public interface Queue {

    //indica si la cola está vacía
    public boolean isEmpty();

    //Obtiene el elemento en la cabeza de la cola
    public Object getFrontElement();

    //Obtiene el elemento en la parte trasera de la cola
    public Object getRearElement();

    //Agrega un elemento en la posición trasera de la cola
    public void put(Object theObject);

    //remueve el elemento en la cabeza de la cola
    public Object remove();
}
