package BehavioralPattern.Command.withCommand;

public class Main {
    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor();
        Button button1 = new Button(new BoldCommand(textEditor));
        Button button2 = new Button(new HighlightCommand(textEditor));

        button1.click();
        button2.click();
    }
}
