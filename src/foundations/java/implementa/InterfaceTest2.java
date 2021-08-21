/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foundations.java.implementa;

/**
 *
 * @author Arles
 */
import java.util.ArrayList;

public class InterfaceTest2 {

    public static void main(String args[]) {
        Duck gomito = new Duck("Pato de Goma", new NoFly());
        Duck silvestre = new Duck("Pato silvestre", new LongFly());
        Duck parque = new Duck("Pato de parque", new ShortFly());
        Duck future = new Duck("Pato avanzado", new FutureFlyBehavior());
        
        ArrayList<Duck> paticos = new ArrayList<>();
        paticos.add(gomito);
        paticos.add(silvestre);
        paticos.add(parque);
        paticos.add(future);
        for (Duck p: paticos) {
            System.out.print(p.getName() + " - ");
            p.fly();
        }
                
        System.out.println("El patico del futuro....");
        ((DefaultTeleport)future.getFlybehavior()).teleport("mars!");
    }
}

