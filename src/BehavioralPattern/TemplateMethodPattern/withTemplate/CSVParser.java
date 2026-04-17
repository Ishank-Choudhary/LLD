package BehavioralPattern.TemplateMethodPattern.withTemplate;

public class CSVParser extends DataParser{
    @Override
    protected void parseData() {
        System.out.println("Parsing CSV data");
    }
}
