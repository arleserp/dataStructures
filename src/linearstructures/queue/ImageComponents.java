/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linearstructures.queue;

import utilities.MyInputStream;

/**
 *
 * @author Arles
 */
public class ImageComponents {

    // top-level nested class
    private static class Position {

        // data members
        private int row; // row number of the position
        private int col; // column number of the position
        // constructor

        private Position(int theRow, int theCol) {
            row = theRow;
            col = theCol;
        }

        // convert to string suitable for output
        public String toString() {
            return new String(row + " " + col);
        }
    }

    // data members
    private static int[][] pixel;
    private static int size;

    // methods
    private static void inputImage() {
        // define the input stream to be the standard
        // input stream
        MyInputStream keyboard = new MyInputStream();
        System.out.println("Enter image size");
        size = keyboard.readInteger();
        // create and input the pixel array
        pixel = new int[size + 2][size + 2];
        System.out.print("Enter the pixel array ");
        System.out.println("in row-major order");
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                pixel[i][j] = keyboard.readInteger();
            }
        }
    }

    private static void labelComponents() {
        // initialize offsets
        Position[] offset = new Position[4];
        offset[0] = new Position(0, 1); // right
        offset[1] = new Position(1, 0); // down
        offset[2] = new Position(0, -1); // left
        offset[3] = new Position(-1, 0); // up

        // initialize wall of 0 pixels
        for (int i = 0; i <= size + 1; i++) {
            pixel[0][i] = pixel[size + 1][i] = 0; // bottom and top
            pixel[i][0] = pixel[i][size + 1] = 0; // left and right
        }

        int numOfNbrs = 4; // neighbors of a pixel position
        ArrayQueue q = new ArrayQueue();
        Position nbr = new Position(0, 0);
        int id = 1; // component id
        
        // scan all pixels labeling components
        for (int r = 1; r <= size; r++) {
            for (int c = 1; c <= size; c++) {
                if (pixel[r][c] == 1) { // new component
                    pixel[r][c] = ++id; // get next id
                    Position here = new Position(r, c);
                    do { // find rest of component
                        for (int i = 0; i < numOfNbrs; i++) { // check all neighbors of here
                            nbr.row = here.row + offset[i].row;
                            nbr.col = here.col + offset[i].col;
                            if (pixel[nbr.row][nbr.col] == 1) { // pixel is part of current component
                                pixel[nbr.row][nbr.col] = id;
                                q.put(new Position(nbr.row, nbr.col));
                            }
                        }
                        // any unexplored pixels in component?
                        here = (Position) q.remove();
                    } while (here != null);
                } // end of if, for c, and for r
            }
        }
    }

    private static void outputImage() {
        System.out.println("The labeled image is");
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                System.out.print(pixel[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        inputImage();
        labelComponents();
        outputImage();
    }
}


/*
Input: 
7
0 0 1 0 0 0 0
0 0 1 1 0 0 0
0 0 0 0 1 0 0
0 0 0 1 1 0 0
1 0 0 0 1 0 0
1 1 1 0 0 0 0
1 1 1 0 0 0 0
*/