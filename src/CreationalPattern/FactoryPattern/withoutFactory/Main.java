package CreationalPattern.FactoryPattern.withoutFactory;

public class Main {
    public static void main(String[] args) {
        Transport car = new Car();
        car.deliver();

        Transport train = new Train();
        train.deliver();
    }
}
