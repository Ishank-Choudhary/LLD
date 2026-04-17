package BehavioralPattern.TemplateMethodPattern.withTemplate;

abstract class DataParser {

    public final void parse(){
        openFile();
        parseData();
        closeFile();
    }

    public void openFile(){
        System.out.println("Opening a file...");
    }

    public void closeFile(){
        System.out.println("Closing a file...");
    }

    protected abstract void parseData();
}
