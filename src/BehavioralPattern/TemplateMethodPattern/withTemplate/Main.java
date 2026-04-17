package BehavioralPattern.TemplateMethodPattern.withTemplate;

public class Main {
    public static void main(String[] args) {
        CSVParser csvParser = new CSVParser();
        JSONparser jsoNparser = new JSONparser();
        csvParser.parse();
        jsoNparser.parse();
    }
}
