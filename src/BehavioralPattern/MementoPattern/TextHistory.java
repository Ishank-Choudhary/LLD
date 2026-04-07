package BehavioralPattern.MementoPattern;

import java.util.Stack;

// managing undo history
public class TextHistory {

    private final Stack<EditorMemento> history = new Stack<>();
    private final Stack<EditorMemento> undoHistory = new Stack<>();

    public void saveState(TextEditor textEditor){
        //“Using textEditor.save(), we are saving the current state of the TextEditor into an EditorMemento object.
        history.push(textEditor.save());
    }

    public void undo(TextEditor textEditor){
        if(history.size() > 1){
            EditorMemento e = history.pop(); // removes the latest
            undoHistory.push(e);
            textEditor.restore(history.peek()); // now history.peek() will return EditorMemento object, because stack holds the objects
        }
    }
    public void redo(TextEditor textEditor){
        if(!undoHistory.isEmpty()){
            EditorMemento redoState = undoHistory.pop();
            history.push(redoState);
            textEditor.restore(redoState);
        }
    }

}
