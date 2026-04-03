package BehavioralPattern.MementoPattern;

import java.util.Stack;

// managing the state
public class TextHistory {

    private final Stack<EditorMemento> history = new Stack<>();

    public void saveState(TextEditor textEditor){
        history.push(textEditor.save());
    }

    public void undo(TextEditor textEditor){
        if(history.size() > 1){
            history.pop();
            textEditor.restore(history.peek());
        }
    }
}
