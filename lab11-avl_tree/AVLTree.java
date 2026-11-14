// TODO: Implement the AVLNode class
class AVLNode {
    int key, height;
    AVLNode left, right;

    // Constructor
    AVLNode(int key) {
        // TODO: Initialize key, height, left, and right
        this.key = key;
        this.height = 1;
        this.left = null;
        this.right = null;
    }
}

public class AVLTree {

    AVLNode root;

    // TODO: Return height of a node
    int height(AVLNode N) {
        if (N == null) return 0;
        return N.height; // placeholder
    }

    // TODO: Return maximum of two integers
    int max(int a, int b) {
        if(a > b) return a; // placeholder
        else return b;
    }

    // TODO: Compute balance factor
    int getBalance(AVLNode N) {
        if (N == null) return 0;
        return height(N.left) - height(N.right); // placeholder
    }

    // TODO: Right rotation
    AVLNode rightRotate(AVLNode y) {
        AVLNode l = y.left;
        AVLNode lr = l.right;
        l.right = y;
        y.left = lr;

        y.height = max(height(y.left), height(y.right)) + 1;
        l.height = max(height(l.left), height(l.right)) + 1;
        return l; // placeholder
    }

    // TODO: Left rotation
    AVLNode leftRotate(AVLNode x) {
        AVLNode r = x.right;
        AVLNode rl = r.left;
        r.left = x;
        x.right = rl;
        x.height = max(height(x.left), height(x.right)) + 1;
        r.height = max(height(r.left), height(r.right)) + 1;

        return r; // placeholder
    }

    // TODO: Left-Right rotation
    AVLNode leftRightRotate(AVLNode z) {
        z.left = leftRotate(z.left);
        AVLNode curRoot = rightRotate(z);
        return curRoot; // placeholder
    }

    // TODO: Right-Left rotation
    AVLNode rightLeftRotate(AVLNode y) {
        y.right = rightRotate(y.right);
        AVLNode curRoot = leftRotate(y);
        return curRoot;  // placeholder
    }

    // Public insert method
    public void insert(int key) {
        root = insert(root, key);
    }

    // TODO: Recursive insertion with rebalancing
    private AVLNode insert(AVLNode node, int key) {
        if(node == null){
            return new AVLNode(key);
        }
        if(key > node.key){
            node.right = insert(node.right, key);
        }else if (key < node.key){
            node.left = insert(node.left, key);
        }

        node.height = max(height(node.left), height(node.right)) + 1;
        int balance = getBalance(node);

        if (balance < -1 && key > node.right.key){
            return leftRotate(node);
        }

        if (balance > 1 && key < node.left.key){
            return rightRotate(node);
        }

        if(balance > 1 && key > node.left.key){
            return leftRightRotate(node);
        }

        if(balance < -1 && key < node.right.key){
            return rightLeftRotate(node);
        }
        return node; // placeholder
    }

    // TODO: Traversal methods
    public void inorder() {
        inorder(root);
        System.out.println();
    }

    private void inorder(AVLNode node) {
        // placeholder

        if(node != null){
            inorder(node.left);
            System.out.print(node.key + " ");
            inorder(node.right);
        }
    }

    public void preorder() {
        preorder(root);
        System.out.println();
    }

    private void preorder(AVLNode node) {
        // placeholder

        if(node != null){
            System.out.print(node.key + " ");
            preorder(node.left);
            preorder(node.right);
        }
    }

    public void postorder() {
        postorder(root);
        System.out.println();
    }

    private void postorder(AVLNode node) {
        // placeholder
        if(node != null){
            postorder(node.left);
            postorder(node.right);
            System.out.print(node.key + " ");
        }
    }
}