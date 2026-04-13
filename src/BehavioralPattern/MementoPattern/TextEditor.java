package BehavioralPattern.MementoPattern;

public class TextEditor {

    // current state
    private String content = "";

    public TextEditor(String content) {
        this.content = content;
    }

    public TextEditor() {
    }

    // creates a snapshot of the current state
    public EditorMemento save(){
        return new EditorMemento(content);
    }

    // restores the editor state from a snapshot (memento)
    public void restore(EditorMemento editorMemento){
        content = editorMemento.getContent(); // content is the single string that is sumup of all the strings we passed in the write method.
    }

    // returns the current state
    public String getContent() {
        return content;
    }

    // modifies the current state by appending text
    public void write(String newText){
        this.content += newText;
    }
}
