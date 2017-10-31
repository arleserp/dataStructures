/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nolinearstructures.tree;

import java.lang.reflect.Method;

/**
 *
 * @author arlese.rodriguezp
 */
public interface BinaryTree {

    public boolean isEmpty();

    public Object root();

    public void makeTree(Object root, Object left, Object right);

    public BinaryTree removeLeftSubtree();

    public BinaryTree removeRightSubtree();

    public void preOrder(Method visit);

    public void inOrder(Method visit);

    public void postOrder(Method visit);

    public void levelOrder(Method visit);
}
