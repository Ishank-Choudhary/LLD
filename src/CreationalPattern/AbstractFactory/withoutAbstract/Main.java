package CreationalPattern.AbstractFactory.withoutAbstract;

class WindowsScrollbar{
    public void render(){
        System.out.println("Rendering windows scrollbar");
    }
}

class MacOsScrollBar{
    public void render(){
        System.out.println("Rendering macos scroll bar");
    }
}

public class Main {
    public static void main(String[] args) {

        WindowsScrollbar ws = new WindowsScrollbar();
        ws.render();

       MacOsScrollBar ms = new MacOsScrollBar();
       ms.render();

    }
}
