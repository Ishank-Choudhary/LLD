package BehavioralPattern.MementoPattern;

public class Main {
    public static void main(String[] args) {

        TextEditor textEditor = new TextEditor();
        TextHistory textHistory = new TextHistory();


        textEditor.write("Ishank is a developer");
        textHistory.saveState(textEditor);


        textEditor.write("\nIshank is a java developer");
        textHistory.saveState(textEditor);

        textEditor.write("\nIshank is a python developer");
        textHistory.saveState(textEditor);

       textHistory.undo(textEditor);
       textHistory.redo(textEditor);

        System.out.println(textEditor.getContent());

    }
}
