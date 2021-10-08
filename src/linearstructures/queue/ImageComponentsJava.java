/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linearstructures.queue;

import java.io.IOException;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;
import static linearstructures.queue.WireRouter.br;

/**
 *
 * @author Arles
 */
public class ImageComponentsJava {

    //static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));     //fast read
    static Scanner sc = new Scanner(System.in);

    // data members
    private static int[][] pixel;
    private static int size;

    // methods
    private static void inputImage() throws IOException {
        // define the input stream to be the standard
        // input stream        
        System.out.println("Enter image size");
        size = sc.nextInt(); //Integer.parseInt(br.readLine());
        // create and input the pixel array
        pixel = new int[size + 2][size + 2];
        System.out.print("Enter the pixel array ");
        System.out.println("in row-major order");
        for (int i = 1; i <= size; i++) {
            /* //uncoment for fast reading using BufferedReader
            int[] row = Arrays.stream(br.readLine().split(" ")).mapToInt(x -> Integer.parseInt(x)).toArray(); //fast read
            for (int j = 1; j <= size; j++) {
                pixel[i][j] = row[j - 1];
            }*/
            for (int j = 1; j <= size; j++) {
                pixel[i][j] = sc.nextInt();
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
        Deque q = new LinkedList();
        Position nbr = new Position(0, 0);
        int id = 1; // component id

        // scan all pixels labeling components
        for (int r = 1; r <= size; r++) {
            for (int c = 1; c <= size; c++) {
                if (pixel[r][c] == 1) { // new component
                    pixel[r][c] = ++id; // get next id
                    Position here = new Position(r, c);
                    q.add(here);
                    while (!q.isEmpty()) { // find rest of component
                        here = (Position) q.remove();
                        for (int i = 0; i < numOfNbrs; i++) { // check all neighbors of here
                            nbr.row = here.row + offset[i].row;
                            nbr.col = here.col + offset[i].col;
                            if (pixel[nbr.row][nbr.col] == 1) { // pixel is part of current component
                                pixel[nbr.row][nbr.col] = id;
                                q.add(new Position(nbr.row, nbr.col));
                            }
                        }
                    }
                }
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

    public static void main(String[] args) throws IOException {
        inputImage();
        labelComponents();
        outputImage();
    }
}

class Position {

    // data members
    int row; // row number of the position
    int col; // column number of the position
    // constructor

    public Position(int theRow, int theCol) {
        row = theRow;
        col = theCol;
    }

    // convert to string suitable for output
    @Override
    public String toString() {
        return row + " " + col;
    }
}
/*
Input: 
7
0 0 1 0 0 0 0
0 0 1 1 0 0 0
0 0 0 0 1 0 0
0 0 0 1 1 0 0
1 0 0 0 1 0 1
1 1 1 0 0 0 1
1 1 1 0 0 1 1
 */
