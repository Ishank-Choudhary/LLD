package BehavioralPattern.MementoPattern;

public class TextEditor {

    private String content = "";

    public TextEditor(String content) {
        this.content = content;
    }

    public TextEditor() {
    }

    public EditorMemento save(){
        return  new EditorMemento(content);
    }

    // Restore the previous state
    public void restore(EditorMemento editorMemento){
        content = editorMemento.getContent();
    }

    public String getContent() {
        return content;
    }

    public void write(String newText){
        this.content += newText;
    }
}
