package BehavioralPattern.MementoPattern;

// EditorMemento acts as a container that captures and stores the internal state of the TextEditor
// so it can be restored later without exposing its implementation
public class EditorMemento {

    // saved past state
    private final String content;

    public EditorMemento(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}
