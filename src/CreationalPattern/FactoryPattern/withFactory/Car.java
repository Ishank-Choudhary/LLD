package CreationalPattern.FactoryPattern.withFactory;

public class Car implements Transport{
    @Override
    public void deliver() {
        System.out.println("This is car");
    }
}
