package CreationalPattern.AbstractFactory.withAbstract;

public class MacOsScrollBar implements ScrollBar {
    @Override
    public void scroll() {
        System.out.println("Scrolling in macOS");
    }
}
