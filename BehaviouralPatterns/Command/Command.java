package BehaviouralPatterns.Command;

// Command Interface
interface  CommandInterface {
    void execute();
}

// Receiver
class TextEditor {
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

// Concrete class for commands - Concrete command
class BoldCommand implements CommandInterface {

    private TextEditor editor;

    public BoldCommand(TextEditor editor) {
        this.editor = editor;
    }

    @Override
    public void execute() {
        editor.BoldText();
    }

}

// Concrete class for commands - Concrete command
class UnderlineCommand implements CommandInterface {

    private TextEditor editor;

    public UnderlineCommand(TextEditor editor) {
        this.editor = editor;
    }

    @Override
    public void execute() {
        editor.UnderlineText();
    }

}
// invoker
class Button {
    private CommandInterface command;
    
    // public Button(CommandInterface command) {
    //     this.command = command;
    // }

    public void setCommand(CommandInterface command) {
        this.command = command;
    }
    public void click() {
        command.execute();
    }

}


public class Command {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        
        // Button button = new Button(new BoldCommand(editor));
        // button.click();

        // button = new Button(new UnderlineCommand(editor));
        // button.click();

        Button button = new Button();
        button.setCommand(new BoldCommand(editor));
        button.click();
        button.setCommand(new UnderlineCommand(editor));
        button.click();
    }
}
