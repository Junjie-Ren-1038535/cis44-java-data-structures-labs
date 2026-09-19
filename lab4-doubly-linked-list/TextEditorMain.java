public class TextEditorMain {
    public static void main(String[] args){
        TextEditor NewTextEditor = new TextEditor();
        NewTextEditor.add("a");
        NewTextEditor.add("ab");
        NewTextEditor.add("abc");
        NewTextEditor.add("abcd");
        System.out.println("Current String: ");
        NewTextEditor.printCurrent();
        System.out.println("Calling undo: ");
        NewTextEditor.undo();
        NewTextEditor.printCurrent();
        System.out.println("Update the string: ");
        NewTextEditor.add("abcde");
        NewTextEditor.printCurrent();
        System.out.println("Calling undo: ");
        NewTextEditor.undo();
        NewTextEditor.printCurrent();
        NewTextEditor.redo();
        System.out.println("Calling redo: ");
        NewTextEditor.printCurrent();
    }
}
