/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linearstructures.list;

public interface LinearListGenerics<E> {

    public boolean isEmpty();

    public int size();

    public E get(int index);

    public int indexOf(E theElement);

    public E remove(int index);

    public void add(int index, E theElement);

    @Override
    public String toString();
}
