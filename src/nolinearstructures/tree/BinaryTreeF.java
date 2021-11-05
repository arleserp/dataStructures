/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nolinearstructures.tree;

import java.util.function.Consumer;

/**
 *
 * @author arlese.rodriguezp
 */
public interface BinaryTreeF {

    public boolean isEmpty();

    public Object root();

    public void makeTree(Object root, Object left, Object right);

    public BinaryTreeF removeLeftSubtree();

    public BinaryTreeF removeRightSubtree();

    public void preOrder(Consumer<BinaryTreeNode> visit);

    public void inOrder(Consumer<BinaryTreeNode> visit);

    public void postOrder(Consumer<BinaryTreeNode> visit);

    public void levelOrder(Consumer<BinaryTreeNode> visit);
}
