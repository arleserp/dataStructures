/**
 * This exception is thrown when an input exception occurs. It is used by
 * MyInputStream to convert checked exceptions such as FileNotFoundException
 * and EOFException into unchecked runtime exceptions.
 */
package utilities;

public class MyInputException extends RuntimeException {

    public MyInputException() {
        super();
    }

    public MyInputException(String message) {
        super(message);
    }
}
