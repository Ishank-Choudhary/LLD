package BehavioralPattern.Command.withoutCommand;

public class Main {
    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor();
        BoldText boldText = new BoldText(textEditor);
        boldText.BoldItalics();
    }
}
