/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linearstructures.queue;

import utilities.MyInputStream;

/**
 *
 * @author arlese.rodriguezp
 */
public class WireRouter {

    // data members
    private static int[][] grid;
    private static int size;
    private static int pathLength;
    private static ArrayQueue q;
    private static Position start, finish;
    private static Position[] path;// the shortest path

    private static class Position {

        //data members
        private int row; //row number of the position
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

    private static void inputData() {
        MyInputStream keyboard = new MyInputStream();
        System.out.println("Enter grid size");
        size = keyboard.readInteger();
        System.out.println("Enter the start position");
        start = new Position(keyboard.readInteger(), keyboard.readInteger());
        System.out.println("Enter the finish position");
        finish = new Position(keyboard.readInteger(), keyboard.readInteger());
        // create and input the wiring grid array
        grid = new int[size + 2][size + 2];
        System.out.print("Enter the wiring grid ");
        System.out.println("in row-major order");
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                grid[i][j] = keyboard.readInteger();
            }
        }
    }

    private static void outputPath() {
        System.out.println("The wire path is");
        for (int i = 0; i < pathLength; i++) {
            System.out.println(path[i]);
        }
    }

    private static boolean findPath() {
        if ((start.row == finish.row) && (start.col == finish.col)) {
            // start == finishpathLength = 0;
            return true;
        }
        // initialize offsets
        Position[] offset = new Position[4];
        offset[0] = new Position(0, 1); //right
        offset[1] = new Position(1, 0);  //down
        offset[2] = new Position(0, -1); //left
        offset[3] = new Position(-1, 0); //up
        // initialize wall of blocks around the grid
        for (int i = 0; i <= size + 1; i++) {
            grid[0][i] = grid[size + 1][i] = 1;
            grid[i][0] = grid[i][size + 1] = 1;
        }

        Position here = new Position(start.row, start.col);
        grid[start.row][start.col] = 2; //block
        int numOfNbrs = 4; // neighbors of a grid position
        ArrayQueue q = new ArrayQueue();
        Position nbr = new Position(0, 0);
        do {
            // label neighbors of here
            for (int i = 0; i < numOfNbrs; i++) {
                // check out neighbors of here
                nbr.row = here.row + offset[i].row;
                nbr.col = here.col + offset[i].col;
                if (grid[nbr.row][nbr.col] == 0) { // unlabeled nbr, label it
                    grid[nbr.row][nbr.col] = grid[here.row][here.col] + 1;
                    if ((nbr.row == finish.row) && (nbr.col == finish.col)) {
                        break; //done
                    }                    // put on queue for later expansion
                    q.put(new Position(nbr.row, nbr.col));
                }
            }
            // have we reached finish?
            if ((nbr.row == finish.row) && (nbr.col == finish.col)) {
                break;// done
            }
            if (q.isEmpty()) {
                return false;// no path
            }
            here = (Position) q.remove();// get next position
        } while (true);
        // construct path
        pathLength = grid[finish.row][finish.col] - 2;
        path = new Position[pathLength];
        // trace backwards from finish
        here = finish;
        for (int j = pathLength - 1; j >= 0; j--) {
            path[j] = here;
            // find predecessor position
            for (int i = 0; i < numOfNbrs; i++) {
                nbr.row = here.row + offset[i].row;
                nbr.col = here.col + offset[i].col;
                if (grid[nbr.row][nbr.col] == j + 2) {
                    break;
                }
            }
            here = new Position(nbr.row, nbr.col);
        }
        return true;
    }

    public static void main(String[] args) {
        inputData();
        if (findPath()) {
            outputPath();
        } else {
            System.out.println("There is no wire path");
        }
    }
}

/*
7
3 2
4 6
0 0 1 0 0 0 0
0 0 1 1 0 0 0
0 0 0 0 1 0 0
0 0 0 1 1 0 0
1 0 0 0 1 0 0
1 1 1 0 0 0 0
1 1 1 0 0 0 0
*/