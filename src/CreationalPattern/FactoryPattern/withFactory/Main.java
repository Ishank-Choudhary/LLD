package CreationalPattern.FactoryPattern.withFactory;

import CreationalPattern.FactoryPattern.withoutFactory.Car;
import CreationalPattern.FactoryPattern.withoutFactory.Train;
import CreationalPattern.FactoryPattern.withoutFactory.Transport;

public class Main {
    public static void main(String[] args) {
        Transport car = new Car();
        Transport train = new Train();

        car.deliver();
        train.deliver();

        // transport class is dependent on concrete classes
    }
}
