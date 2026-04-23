package CreationalPattern.FactoryPattern.withFactory;

public class Train implements Transport{
    @Override
    public void deliver() {
        System.out.println("This is train");
    }
}
