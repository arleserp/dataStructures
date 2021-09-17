/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linearstructures.list;

/**
 *
 * @author Arles
 */
public class Amigo {
    protected String nombre;
    protected Amigo amigo;

    public Amigo(String nombre, Amigo amigo) {
        this.nombre = nombre;
        this.amigo = amigo;
    }    

    @Override
    public String toString() {
        return "Amigo{" + "nombre=" + nombre + ", amigo=" + amigo + '}';
    }        
}
