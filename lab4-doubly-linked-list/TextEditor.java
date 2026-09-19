public class TextEditor {
    private static class Node {
        String textState;
        Node prev;
        Node next;
        // Node constructor...
        Node(String text, Node prev, Node next){
            textState = text;
            this.prev = prev;
            this.next = next;
        }
    }

    private Node currentNode;

    public TextEditor() {
        // Start with an initial empty string state.
        Node initialNode = new Node("", null, null);
        this.currentNode = initialNode;
    }

    public void add(String newText) {
        // Create a new node with the updated text.
        // Set its 'prev' to the current node.
        // Set the current node's 'next' to this new node.
        // Finally, update currentNode to point to the new node.
        Node newNode = new Node(newText, currentNode, null);
        currentNode.next = newNode;
        currentNode = newNode;
    }

    public String undo() {
        // Check if currentNode.prev is not null.
        // If it is, move currentNode back and return the text.
        // Otherwise, you can't undo.
        if(currentNode.prev == null){
            //doesnt do anything if there is no where to go back to
            System.out.println("This is the oldest version");
            return currentNode.textState;
        }
        else{
            //revert back to prev iteration
            currentNode = currentNode.prev;
            return currentNode.textState;
        }
    }

    public String redo() {
        // Check if currentNode.next is not null.
        // If it is, move currentNode forward and return the text.
        if(currentNode.next == null){
            //doesn't do anything if the current is the most recent
            System.out.println("This is the most recent version");
            return currentNode.textState;
        }
        else{
            // ret the next iteration
            currentNode = currentNode.next;
            return currentNode.textState;
        }
    }

    public void printCurrent() {
        // Print current text state
        System.out.println(currentNode.textState);
    }
}
