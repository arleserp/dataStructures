/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilities;

/**
 *
 * @author Arles
 */
/**
 * input utility
 */
import java.io.*;
import java.util.*;
import exceptions.*;



public class MyInputStream {
    // data members

    private BufferedReader in;
    private StringTokenizer line;

    /**
     * Constructor to set up BufferedReader for standard input stream System.in.
     * Typically, this is the keyboard.
     */
    public MyInputStream() {
        in = new BufferedReader(new InputStreamReader(System.in));
    }

    /**
     * Constructor to set up BufferedReader for input from a file.
     */
    public MyInputStream(String fileName) {
        try {
            in = new BufferedReader(new FileReader(fileName));
        } catch (FileNotFoundException e) {
            throw new MyInputException(e.getMessage());
        }
    }

    /**
     * Discard remainder of current line.
     */
    public void flushCurrentLine() {
        line = null;
    }

    /**
     * Extract next token from input stream.
     *
     * @return next token in input stream
     * @exception MyInputException thrown if some error occurs while inputting a
     * new line or if the end of file is reached
     */
    private String nextToken() {
        // ensure that the current line has a token
        while (line == null || !line.hasMoreTokens()) {
            try {
                // attempt to input another line
                String newLine = in.readLine();
                if (newLine == null) // end of file encountered
                {
                    throw new MyInputException("End of file");
                }

                // convert newLine to tokens
                line = new StringTokenizer(newLine);
            } catch (IOException e) {
                throw new MyInputException(e.getMessage());
            }

        }

        // extract and return the next token
        return line.nextToken();
    }

    /**
     * Input an integer.
     *
     * @exception MyInputException
     * @exception NumberFormatException
     * @return next token as an integer number
     */
    public int readInteger() {
        return Integer.parseInt(nextToken());
    }

    /**
     * Input a long.
     */
    public long readLong() {
        return Long.parseLong(nextToken());
    }

    /**
     * Input a short.
     */
    public short readShort() {
        return Short.parseShort(nextToken());
    }

    /**
     * Input a byte.
     */
    public byte readByte() {
        return Byte.parseByte(nextToken());
    }

    /**
     * Input a float.
     */
    public float readFloat() {
        return new Float(nextToken()).floatValue();
    }

    /**
     * Input a double.
     */
    public double readDouble() {
        return new Double(nextToken()).doubleValue();
    }

    /**
     * Input a string.
     */
    public String readString() {
        return nextToken();
    }

    /**
     * Input a boolean.
     */
    public boolean readBoolean() {
        String b = nextToken();
        if (b.equals("true")) {
            return true;
        }
        if (b.equals("false")) {
            return false;
        }
        throw new MyInputException("Input is not a boolean");
    }

    /**
     * test program
     */
    public static void main(String[] args) {
        boolean b;
        int i, j, k;
        double d;
        byte c;
        short f;
        String g;

        // define a MyInputStream object to input
        // from System.in and another to input from
        // the file utilities\MyInputStream.file
        MyInputStream keyboard = new MyInputStream(),
                file = new MyInputStream("utilities/MyInputStream.file");

        System.out.println("Enter a boolean, an integer "
                + "a double, a byte, a short, "
                + " and a string");
        System.out.flush();  // force output of last line

        b = keyboard.readBoolean();
        i = keyboard.readInteger();
        d = keyboard.readDouble();
        c = keyboard.readByte();
        f = keyboard.readShort();
        g = keyboard.readString();
        keyboard.flushCurrentLine();

        System.out.println("The input is " + b
                + " " + i + " " + d + " "
                + c + " " + f + " " + g);

        // now read from the file and output
        b = file.readBoolean();
        i = file.readInteger();
        d = file.readDouble();
        keyboard.flushCurrentLine();

        System.out.println("The file input is " + b
                + " " + i + " " + d);

        System.out.println("Enter three integers, "
                + "one to a line");
        System.out.flush();  // force output of last line
        i = keyboard.readInteger();
        keyboard.flushCurrentLine();
        j = keyboard.readInteger();
        keyboard.flushCurrentLine();
        k = keyboard.readInteger();
        keyboard.flushCurrentLine();

        System.out.println("The input is " + i
                + " " + j + " " + k);

        // try another read from the file
        // should throw end of file exception
        file.flushCurrentLine();
        try {
            b = file.readBoolean();
        } catch (MyInputException e) {
            System.out.println("MyInputException: " + e.getMessage());
        }
    }
}
