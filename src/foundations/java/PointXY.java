/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foundations.java;

/**
 * This class defines a point class to remember and introduce 
 * the data structures course at
 * Fundación Universitaria Konrad Lorenz
 * @author Arles
 */
public class PointXY {
    private int x, y;
    
    public PointXY(){
        x = y = 0;
    }
    
    public PointXY(int dx, int dy){
        x = dx;
        y = dy;
    }
    
    public void move(int dx, int dy){
        x += dx;
        y += dy;
    }
    
    @Override
    public String toString(){
        return "(" + x + "," + y + ")";
    }
}
