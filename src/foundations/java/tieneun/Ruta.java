/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foundations.java.tieneun;

/**
 *
 * @author Arles
 */
public class Ruta {
    private String origen;
    private String destino;

    public Ruta(String origen, String destino) {
        this.origen = origen;
        this.destino = destino;
    }

    @Override
    public String toString() {
        return "Ruta{" + "origen=" + origen + ", destino=" + destino + '}';
    }
            
}
