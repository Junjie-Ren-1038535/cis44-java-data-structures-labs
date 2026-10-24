public class ExpressionTreeDriver {
    public static void main(String[] args) {
        // 1. Build the Tree
        // Manually build the tree for: ( (3 + 7) * (9 - 4) )
        //
        //         *
        //        / \
        //       +   -
        //      / \ / \
        //     3  7 9  4
        //

        BinaryTreeNode root = new BinaryTreeNode("*");

        BinaryTreeNode nodePlus = new BinaryTreeNode("+");
        BinaryTreeNode nodeMinus = new BinaryTreeNode("-");

        // --- TO BE COMPLETED BY STUDENT ---
        // Connect root, nodePlus, and nodeMinus
        // root.left = ...
        // root.right = ...
        // nodePlus.parent = ...
        root.left = nodePlus;
        root.right = nodeMinus;
        nodePlus.parent = root;
        nodeMinus.parent = root;

        // Create and connect the leaves (operands)
        BinaryTreeNode node3 = new BinaryTreeNode("3");
        node3.parent = nodePlus;
        nodePlus.left = node3;
        BinaryTreeNode node7 = new BinaryTreeNode("7");
        node7.parent = nodePlus;
        nodePlus.right = node7;


        // ...
        BinaryTreeNode node9 = new BinaryTreeNode("9");
        node9.parent = nodeMinus;
        nodeMinus.left = node9;
        BinaryTreeNode node4 = new BinaryTreeNode("4");
        node4.parent = nodeMinus;
        nodeMinus.right = node4;
        // Connect leaves to their parents (nodePlus and nodeMinus)
        // nodePlus.left = ...
        // nodePlus.right = ...
        // node3.parent = ...


        // 2. Perform Traversals
        System.out.println("--- Preorder Traversal (Prefix) ---");
        root.traversePreorder(root);

        System.out.println("\n\n--- Inorder Traversal (Infix) ---");
        root.traverseInorder(root);

        System.out.println("\n\n--- Postorder Traversal (Postfix) ---");
        root.traversePostorder(root);
    }
}
