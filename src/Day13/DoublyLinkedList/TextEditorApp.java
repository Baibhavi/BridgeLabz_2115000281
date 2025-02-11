package Day13.DoublyLinkedList;
class TextState {
    String content;
    TextState next;
    TextState prev;

    public TextState(String content) {
        this.content = content;
        this.next = null;
        this.prev = null;
    }
}
class TextEditor {
    private TextState head;
    private TextState tail;
    private TextState current;
    private int maxSize;
    private int size;

    public TextEditor(int maxSize) {
        this.head = null;
        this.tail = null;
        this.current = null;
        this.maxSize = maxSize;
        this.size = 0;
    }

    public void addTextState(String content) {
        TextState newState = new TextState(content);
        if (head == null) {
            head = tail = current = newState;
        } else {
            if (size == maxSize) {
                head = head.next;
                head.prev = null;
                size--;
            }
            tail.next = newState;
            newState.prev = tail;
            tail = newState;
            current = newState;
        }
        size++;
    }
    public void undo() {
        if (current != null && current.prev != null) {
            current = current.prev;
        } else {
            System.out.println("No more undos available.");
        }
    }
    public void redo() {
        if (current != null && current.next != null) {
            current = current.next;
        } else {
            System.out.println("No more redos available.");
        }
    }
    public void displayCurrentState() {
        if (current != null) {
            System.out.println("Current State: " + current.content);
        } else {
            System.out.println("No content available.");
        }
    }
}

public class TextEditorApp {
    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor(10);
        textEditor.addTextState("Hello");
        textEditor.addTextState("Hello World");
        textEditor.addTextState("Hello World!");
        textEditor.displayCurrentState();
        textEditor.undo();
        textEditor.displayCurrentState();
        textEditor.redo();
        textEditor.displayCurrentState();
        textEditor.addTextState("Hello World! How are you?");
        textEditor.displayCurrentState();
        textEditor.undo();
        textEditor.displayCurrentState();
    }
}
