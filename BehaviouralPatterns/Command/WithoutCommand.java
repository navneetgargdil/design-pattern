package BehaviouralPatterns.Command;

class TextEditorWithout {
    public void BoldText() {
        System.out.println("Text has been bold");
    }
    public void ItalicText() {
        System.out.println("Text has been italic");
    }

    public void UnderlineText() {
        System.out.println("Text has been underline");
    }
}

class BoldButtonWithout {
    private TextEditorWithout editor;

    public BoldButtonWithout(TextEditorWithout editor) {
        this.editor = editor;
    }

    public void click() {
        editor.BoldText();
    }
}

public class WithoutCommand {
    public static void main(String[] args) {
        TextEditorWithout editorWithout = new TextEditorWithout();
        BoldButtonWithout  boldButtonWithout = new BoldButtonWithout(editorWithout);

        boldButtonWithout.click();
    }
}
