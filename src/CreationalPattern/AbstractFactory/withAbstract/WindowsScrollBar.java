package CreationalPattern.AbstractFactory.withAbstract;

public class WindowsScrollBar implements ScrollBar{

    @Override
    public void scroll() {
        System.out.println("Scrolling in windows");
    }
}
