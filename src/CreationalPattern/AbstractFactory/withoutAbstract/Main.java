package CreationalPattern.AbstractFactory.withoutAbstract;

class WindowsScrollbar{
    public void render(){
        System.out.println("Rendering windows scrollbar");
    }
}

class WindowsClick{
    public void render(){
        System.out.println("Rendering windows click");
    }
}

public class Main {
    public static void main(String[] args) {

        WindowsScrollbar ws = new WindowsScrollbar();
        ws.render();

        WindowsClick wc = new WindowsClick();
        wc.render();
    }
}
