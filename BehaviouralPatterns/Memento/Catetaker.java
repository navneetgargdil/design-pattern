package BehaviouralPatterns.Memento;

import java.util.Stack;

public class Catetaker {
    private final Stack<EditorMemento> history = new Stack<>();

    public void saveState(TextEditor editor) {
        history.push(editor.save());
    }
    public void undo(TextEditor editor) {
        if (!history.empty()) {
            history.pop();
            editor.restore(history.peek());
        }
    }
    
    // public void saveState(TextEditor editor) {
    //     history.push(editor.save());
    // }
    // public void undo(TextEditor editor) {
    //     if (!history.empty()) {
    //         history.pop();
    //         editor.restore(history.peek());
    //     }
    // }
}
