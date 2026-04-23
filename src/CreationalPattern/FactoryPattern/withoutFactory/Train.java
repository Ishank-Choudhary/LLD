package CreationalPattern.FactoryPattern.withoutFactory;

public class Train implements Transport {

    @Override
    public void deliver() {
        System.out.println("Delivering through train");
    }
}
