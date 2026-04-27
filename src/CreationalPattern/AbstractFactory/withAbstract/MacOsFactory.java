package CreationalPattern.AbstractFactory.withAbstract;


public class MacOsFactory implements UIFactory{

    @Override
    public Button1 createButton() {
        return new MacOsButton();
    }

    @Override
    public ScrollBar createScrollBar() {
        return new MacOsScrollBar();
    }

}
