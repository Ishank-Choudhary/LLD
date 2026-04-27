package CreationalPattern.AbstractFactory.withAbstract;

public class Main {
    public static void main(String[] args) {
        UIFactory windowsFactory = new WindowsFactory();

        Button1 b1 = windowsFactory.createButton();
        ScrollBar s1 = windowsFactory.createScrollBar();

        b1.render();     // ✅ use it
        s1.scroll();    // ✅ use it

        UIFactory macOsFactory = new MacOsFactory();
        Button1 b2 = macOsFactory.createButton();
        ScrollBar s2 = macOsFactory.createScrollBar();

        b2.render();
        s2.scroll();

    }
}