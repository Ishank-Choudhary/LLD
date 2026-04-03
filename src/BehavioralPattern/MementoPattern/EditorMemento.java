package BehavioralPattern.MementoPattern;

// This class stores the internal Structure of the editor
public class EditorMemento {

    private final String content;

    public EditorMemento(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}
