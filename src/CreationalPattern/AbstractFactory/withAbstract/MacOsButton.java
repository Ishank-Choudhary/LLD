package CreationalPattern.AbstractFactory.withAbstract;

public class MacOsButton implements Button1 {
    @Override
    public void render() {
        System.out.println("Rendering MacOs Button");
    }
}
