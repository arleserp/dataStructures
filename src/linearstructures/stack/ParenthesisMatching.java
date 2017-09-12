/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linearstructures.stack;

/**
 *
 * @author arlese.rodriguezp
 */
public class ParenthesisMatching {

    public static void main(String[] args) {
        String expr = "(((a+b)*c+d*e)/((f+g)-h))";
        DerivedArrayStack stack = new DerivedArrayStack();

        for (int i = 0; i < expr.length(); i++) {
            char c = expr.charAt(i);
            if (c == '(') {
                stack.push(i);
            }
            if (c == ')') {
                try {
                    int loc = (Integer) stack.pop();
                    System.out.println(loc + "  " + i);
                } catch (Exception e) { // stack was empty, no match exists
                    System.out.println("No match for right parenthesis"
                            + " at " + i);
                }
            }
        }
        while (!stack.empty()) {
            System.out.println("No match for right parenthesis"
                    + " at " + stack.pop());
        }
    }
}
