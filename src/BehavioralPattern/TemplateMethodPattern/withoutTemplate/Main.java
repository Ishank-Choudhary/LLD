package BehavioralPattern.TemplateMethodPattern.withoutTemplate;

public class Main {
    public static void main(String[] args) {
        CSVparser csVparser = new CSVparser();
        JSONparser jsoNparser = new JSONparser();
        csVparser.parser();
        jsoNparser.parser();
    }
}
