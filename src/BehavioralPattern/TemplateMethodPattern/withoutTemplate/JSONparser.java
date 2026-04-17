package BehavioralPattern.TemplateMethodPattern.withoutTemplate;

public class JSONparser {
    public void parser(){
        open();
        System.out.println("parsing a json file");
        closing();
    }

    public void open(){
        System.out.println("opening a file");
    }

    public void closing(){
        System.out.println("Closing a file");
    }
}
