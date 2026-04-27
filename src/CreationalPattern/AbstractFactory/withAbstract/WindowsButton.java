package CreationalPattern.AbstractFactory.withAbstract;

public class WindowsButton implements Button1 {

    @Override
    public void render() {
        System.out.println("Rendering Windows button");
    }
}
