package BehavioralPattern.Command.withCommand;

public class HighlightCommand implements Command{

    private TextEditor textEditor;

    public HighlightCommand(TextEditor textEditor) {
        this.textEditor = textEditor;
    }

    @Override
    public void execute() {
        textEditor.highlight();
    }
}
