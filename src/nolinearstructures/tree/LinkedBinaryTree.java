package nolinearstructures.tree;

import java.util.function.Consumer;
import linearstructures.queue.ArrayQueue;

public class LinkedBinaryTree implements BinaryTree {
    // instance data member
    BinaryTreeNode root;  // root node
    ContNodos counter = new ContNodos();// counter of nodes
    
    // instance methods
    /**
     * @return true iff tree is empty
     */
    @Override
    public boolean isEmpty() {
        return root == null;
    }

    /**
     * * @return root element if tree is not empty
     */
    @Override
    public Object root() {
        return (root == null) ? null : root.element;
    }

    /**
     * set this to the tree with the given root and subtrees CAUTION: does not
     * clone left and right
     */
    @Override
    public void makeTree(Object root, Object left, Object right) {
        this.root = new BinaryTreeNode(root,
                ((LinkedBinaryTree) left).root,
                ((LinkedBinaryTree) right).root);
    }

    /**
     * remove the left subtree
     *
     * @throws IllegalArgumentException when tree is empty
     * @return removed subtree
     */
    @Override
    public BinaryTree removeLeftSubtree() {
        if (root == null) {
            throw new IllegalArgumentException("tree is empty");
        }

        // detach left subtree and save in leftSubtree
        LinkedBinaryTree leftSubtree = new LinkedBinaryTree();
        leftSubtree.root = root.leftChild;
        root.leftChild = null;
        return (BinaryTree) leftSubtree;
    }

    /**
     * remove the right subtree
     *
     * @throws IllegalArgumentException when tree is empty
     * @return removed subtree
     */
    @Override
    public BinaryTree removeRightSubtree() {
        if (root == null) {
            throw new IllegalArgumentException("tree is empty");
        }

        // detach right subtree and save in rightSubtree
        LinkedBinaryTree rightSubtree = new LinkedBinaryTree();
        rightSubtree.root = root.rightChild;
        root.rightChild = null;

        return (BinaryTree) rightSubtree;
    }

    /**
     * preorder traversal
     *
     * @param visit
     */
    @Override
    public void preOrder(Consumer<BinaryTreeNode> visit) {
        thePreOrder(root, visit);
    }

    /**
     * actual preorder traversal method
     */
    static void thePreOrder(BinaryTreeNode t, Consumer<BinaryTreeNode> visit) {
        if (t != null) {
            visit.accept(t);
            thePreOrder(t.leftChild, visit);             // do left subtree
            thePreOrder(t.rightChild, visit);            // do right subtree
        }
    }

    /**
     * inorder traversal
     *
     * @param visit
     */
    @Override
    public void inOrder(Consumer<BinaryTreeNode> visit) {
        theInOrder(root, visit);
    }

    /**
     * actual inorder traversal method
     */
    static void theInOrder(BinaryTreeNode t, Consumer<BinaryTreeNode> visit) {
        if (t != null) {
            theInOrder(t.leftChild, visit);              // do left subtree
            visit.accept(t); // visit tree root         
            theInOrder(t.rightChild, visit);             // do right subtree
        }
    }

    /**
     * postorder traversal
     *
     * @param visit
     */
    @Override
    public void postOrder(Consumer<BinaryTreeNode> visit) {
        thePostOrder(root, visit);
    }

    /**
     * actual postorder traversal method
     */
    static void thePostOrder(BinaryTreeNode t, Consumer<BinaryTreeNode> visit) {
        if (t != null) {
            thePostOrder(t.leftChild, visit);            // do left subtree
            thePostOrder(t.rightChild, visit);           // do right subtree
            visit.accept(t);
        }
    }

    /**
     * level order traversal
     *
     * @param visit
     */
    @Override
    public void levelOrder(Consumer<BinaryTreeNode> visit) {
        ArrayQueue q = new ArrayQueue();
        BinaryTreeNode t = root;
        while (t != null) {
            visit.accept(t); //visit node

            // put t's children on queue
            if (t.leftChild != null) {
                q.put(t.leftChild);
            }
            if (t.rightChild != null) {
                q.put(t.rightChild);
            }

            // get next node to visit
            t = (BinaryTreeNode) q.remove();
        }
    }

    /**
     * output elements in preorder
     */
    public void preOrderOutput() {
        preOrder(p -> p.printNode());
    }

    /**
     * output elements in inorder
     */
    public void inOrderOutput() {
        inOrder((p -> p.printNode()));
    }

    /**
     * output elements in postorder
     */
    public void postOrderOutput() {
        postOrder((p -> p.printNode()));
    }

    /**
     * output elements in level order
     */
    public void levelOrderOutput() {
        levelOrder((p -> p.printNode()));
    }

    /**
     * count number of nodes in tree
     *
     * @return
     */
    public int size() {        
        preOrder(p -> p.addOne(counter));
        return counter.getCont();
    }

    /**
     * @return tree height
     */
    public int height() {
        return theHeight(root);
    }

    /**
     * @return height of subtree rooted at t
     */
    static int theHeight(BinaryTreeNode t) {
        if (t == null) {
            return 0;
        }
        int hl = theHeight(t.leftChild);  // height of left subtree
        int hr = theHeight(t.rightChild); // height of right subtree
        if (hl > hr) {
            return ++hl;
        } else {
            return ++hr;
        }
    }

    /**
     * test program
     */
    public static void main(String[] args) {
        LinkedBinaryTree a = new LinkedBinaryTree();
        LinkedBinaryTree x = new LinkedBinaryTree();
        LinkedBinaryTree y = new LinkedBinaryTree(),
                z = new LinkedBinaryTree(),                
                w = new LinkedBinaryTree();
        w.makeTree(new Integer(1), a, a);
        z.makeTree(new Integer(2), a, a);
        x.makeTree(new Integer(3), w, z);
        y.makeTree(new Integer(4), x, a);

        System.out.println("Preorder sequence is ");
        y.preOrderOutput();
        System.out.println();

        System.out.println("Inorder sequence is ");
        y.inOrderOutput();
        System.out.println();

        System.out.println("Postorder sequence is ");
        y.postOrderOutput();
        System.out.println();

        System.out.println("Level order sequence is ");
        y.levelOrderOutput();
        System.out.println();

        System.out.println("Number of nodes = " + y.size());

        System.out.println("Height = " + y.height());
    }
}

class ContNodos{
    int number;

    public ContNodos() {
        number = 0;
    }
    
    public void addOne(){
        number++;
    }
    
    public int getCont(){
        return number;
    }
}