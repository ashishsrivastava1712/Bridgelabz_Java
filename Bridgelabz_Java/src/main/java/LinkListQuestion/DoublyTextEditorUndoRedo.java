package LinkListQuestion;

/*
 * Problem 8: Doubly Linked List: Undo/Redo Functionality for Text Editor
 * Each node stores one text state. Implement adding states, undo, redo,
 * displaying the current state, and a fixed history limit of 10 states.
 * Hint: prev represents undo and next represents redo. After a new state is
 * added following undo, discard all redo states. Remove oldest states when
 * the history becomes larger than the fixed limit.
 * Author: Ashish Srivastava
 * Date: 12 - 10 - 2026
 */
class TextNode {
    String text;
    TextNode next, prev;

    TextNode(String t) {
        text = t;
    }
}

class TextHistory {
    private TextNode head, tail, current;
    private int size;
    private final int max = 10;

    TextHistory(String initial) {
        head = tail = current = new TextNode(initial);
        size = 1;
    }

    // Method to handle add operations
    void add(String text) {
        current.next = null;
        tail = current;
        TextNode x = new TextNode(text);
        x.prev = current;
        current.next = x;
        current = tail = x;
        size++;
        while (size > max) {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    // Method to handle undo operations
    void undo() {
        if (current != head)
            current = current.prev;
    }

    // Method to handle redo operations
    void redo() {
        if (current != tail)
            current = current.next;
    }

    // Method to handle display operations
    void display() {
        System.out.println("Current: " + current.text);
    }
}

class DoublyTextEditorUndoRedo {
    // Main execution method to run and demonstrate the solution
    public static void main(String[] a) {
        TextHistory h = new TextHistory("");
        h.add("Hello");
        h.add("Hello Java");
        h.add("Hello Java World");
        h.display();
        h.undo();
        h.display();
        h.redo();
        h.display();
    }
}
