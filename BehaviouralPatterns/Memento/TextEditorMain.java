package BehaviouralPatterns.Memento;

public class TextEditorMain {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        Catetaker catetaker = new Catetaker();
        editor.write("hello world");
        catetaker.saveState(editor);
        editor.write("hello from editor");
        catetaker.saveState(editor);
        editor.write("hello from editor2");
        catetaker.saveState(editor);
        // Problem - Undo
        // One solution is use stack - it will break SRP to store past state (state management)
        catetaker.undo(editor);
        catetaker.undo(editor);
        System.out.println(editor.getContent());
    }

}
