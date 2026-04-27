package CreationalPattern.AbstractFactory.withAbstract;

public class WindowsFactory implements UIFactory {

    public Button1 createButton() {
        return new WindowsButton();
    }

    public ScrollBar createScrollBar() {
        return new WindowsScrollBar();
    }
}
