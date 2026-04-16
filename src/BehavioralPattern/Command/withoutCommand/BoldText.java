package BehavioralPattern.Command.withoutCommand;

public class BoldText {
    private TextEditor textEditor;

    public BoldText(TextEditor textEditor){
        this.textEditor=textEditor;
    }

    public void BoldItalics(){
        textEditor.italicText();
    }
}
