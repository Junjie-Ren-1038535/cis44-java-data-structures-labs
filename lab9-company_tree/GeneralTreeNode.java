import java.util.ArrayList;
import java.util.List;

public class GeneralTreeNode {
    String name; // Employee name or department title
    GeneralTreeNode parent;
    List<GeneralTreeNode> children;

    public GeneralTreeNode(String name) {
        this.name = name;
        this.parent = null;
        this.children = new ArrayList<>();
    }

    // Method to add a child to this node
    public void addChild(GeneralTreeNode child) {
        child.parent = this;
        this.children.add(child);
    }

    // --- TO BE COMPLETED BY STUDENT ---

    /**
     * Performs a preorder traversal starting from this node.
     * Prints the name of each node visited.
     * (Visit Parent, then visit children)
     */
    public void traversePreorder(GeneralTreeNode cur) {
        // Your code here
        // 1. Print this node's name
        // 2. Recursively call traversePreorder on each child
        if(cur == null) return;
        System.out.println(cur.name);
        for(int i = 0; i < cur.children.size(); i ++){
            traversePreorder(cur.children.get(i));
        }
    }

    /**
     * Performs a postorder traversal starting from this node.
     * Prints the name of each node visited.
     * (Visit children, then visit Parent)
     */
    public void traversePostorder(GeneralTreeNode cur) {
        // Your code here
        // 1. Recursively call traversePostorder on each child
        // 2. Print this node's name
        if(cur == null) return;
        for(int i = 0; i < cur.children.size(); i ++){
            traversePostorder(cur.children.get(i));
        }
        System.out.println(cur.name);
    }
}